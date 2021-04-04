package StepsDefinitions;

import Enums.ProfessorEnum;
import Objetos.ObjetoClass;
import Suporte.Config;
import cucumber.api.java.Before;
import cucumber.api.java.After;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.Format;

import static java.lang.Double.doubleToLongBits;
import static java.lang.Double.valueOf;

public class Steps {

    private WebDriver navegador;

    ObjetoClass obj = new ObjetoClass();

    //Método que executa tudo antes dos testes
    @Before
    public void setUp() {
        navegador = Config.Chrome();
    }

    @Dado("que acesso a homepage do estratégia concursos")
    public void acessarHomePage() {

    }

    @E("clico no link 'por professores'")
    public void linkPorProfessores() throws InterruptedException {
        //Thread.sleep(3000);
        WebElement divPorProfessor = navegador.findElement(By.cssSelector("#b_home > header > nav"));
        divPorProfessor.findElement(By.cssSelector("#b_home > header > nav > div > div > div.nav-header-links > a:nth-child(3)")).click();

        String TituloPagina = navegador.findElement(By.xpath("/html/body/div[1]/header/div/div/h1")).getText();
        if (TituloPagina.contains("Cursos por professor")) {
            Assert.assertTrue(true);
        } else {
            Assert.fail("ERRO - O link acessado foi: " + TituloPagina);
        }

    }

    @E("preencho o campo busca com o nome do professor (.*)")
    public void preecherCampoBuscaProfessor(String professor) throws InterruptedException {

        WebElement AcessoCampoBusca = navegador.findElement(By.cssSelector("#b_cursos > div.js-page-courses > div > div > section:nth-child(1) > header > div > div > form > input[type=text]"));
        Thread.sleep(4000);
        AcessoCampoBusca.click();
        Thread.sleep(4000);
        AcessoCampoBusca.sendKeys(professor);

        String pegaValor = navegador.findElement(By.cssSelector("#b_cursos > div.js-page-courses > div > div > section:nth-child(2) > div.page-result-list > section > h1 > a")).getText();

        if (pegaValor.contains(professor)) {
            Assert.assertTrue(true);
        } else {
            Assert.assertEquals(professor, pegaValor);
        }
    }

    @E("acesso a página lista dos cursos")
    public void acessarCursosE() {

        //Pegando o total de registros do curso
        String TotalDeCursos = navegador.findElement(By.cssSelector("#b_cursos > div.js-page-courses > div > div > section:nth-child(2) > div.page-result-list > section > div")).getText();
        obj.setTotalDeCursos(TotalDeCursos);

        navegador.get(ProfessorEnum.ENA_LOIOLA.getLinkPorProfessor());
    }

    @Quando("acesso a página lista dos cursos por professor")
    public void acessarCursosQuando() {

        //Pegando o total de registros do curso
        String TotalDeCursos = navegador.findElement(By.cssSelector("#b_cursos > div.js-page-courses > div > div > section:nth-child(2) > div.page-result-list > section > div")).getText();
        obj.setTotalCursosPaginaProfessor(TotalDeCursos);

        navegador.get(ProfessorEnum.ENA_LOIOLA.getLinkPorProfessor());
    }

    @Quando("escolho o curso (.*) e armazeno o valor da lista")
    public void escolherCurso(String curso) throws Throwable {
        //Armazenamos o valor do curso O VALOR DO CURSO A VISTA X E ARMAZENA NA VARIAVEL ORIENTADA A OBJETOS


        //Pegamos o total de cursos disponíveis do professor
        String PegaTotalCursos = obj.getTotalDeCursos();

        //Deixaremos exibir os 3 primeiros caracteres e retiramos o restante que é "cursos disponíveis"
        String PegaTotalCursosFormatado = PegaTotalCursos.substring(0, 3);

        //Caso tenha espaço, retiramos o espaço para poder pegar o número e transformar de STRING para INTEIRO
        String Formatado = PegaTotalCursosFormatado.replace(" ", "");

        //Criamos a variavel avaixo para fazer a transformação de string para inteiro
        int TransformaStringParaInteger = Integer.parseInt(Formatado);
        int i;

        //Definimos esse WebElement para poder entrarmos no elemento pai que contém a lista de cursos
        WebElement tabela = navegador.findElement(By.cssSelector("#b_cursos_porconcurso > div.cur-listing.-margin > div"));

        //Criamos esse for para podermos ler a lista de cursos
        for (i = 1; i <= TransformaStringParaInteger; i++) {

            //Cada vez que passar pelo for ele vai incrementar a variável i com o valor atual e vai ler o curso.
            String lista = String.valueOf(tabela.findElement(By.cssSelector("#b_cursos_porconcurso > div.cur-listing.-margin > div > div.js-cur-content > div.js-card-prod-container > section:nth-child(" + i + ") > h1")).getText());
            String ValorListaCurso = navegador.findElement(By.cssSelector("#b_cursos_porconcurso > div.cur-listing.-margin > div > div.js-cur-content > div.js-card-prod-container > section:nth-child(" + i + ") > div")).getText();

            //Se o curso conter na lista, vai fazer um assertEquals pra certificar mais uma vez que é igual e vai armazenar
            //o valor atual da variável i no objeto setArmazenaCurso. O For vai continuar lendo a lista até o último elemento
            if (curso.contains(lista)) {
                Assert.assertEquals(curso, lista);
                obj.setArmazenaCurso(i);
                obj.setValorCurso(ValorListaCurso);
            }
        }

        //Ao sair do for ele vai pegar o atributo da variável i que foi armazenado quando encontrou o curso, sendo assim, ele pega a URL
        String PegaAtributo = navegador.findElement(By.cssSelector("#b_cursos_porconcurso > div.cur-listing.-margin > div > div.js-cur-content > div.js-card-prod-container > section:nth-child(" + obj.getArmazenaCurso() + ") > a")).getAttribute("href");

        //Com a URL fazemos um GET para ir para a tela de Detalhes
        navegador.get(PegaAtributo);
    }

    @Então("valido se o A VISTA da lista é igual ao valor da PÁGINA DETALHE")
    public void validaValores() {
        //PEGA O VALOR DO CURSO A VISTA X E ARMAZENA NA VARIAVEL ORIENTADA A OBJETOS
        String ValorDetalhe = navegador.findElement(By.cssSelector("#b_curso > div:nth-child(8) > section > div.cur-details-shopping > div.cur-details-buy > div > div")).getText();
        obj.setValorDetalhe(ValorDetalhe);

        if (obj.getValorDetalhe().contains(obj.getValorCurso())) {
            Assert.assertTrue(true);
            System.out.println("Curso: " + obj.getArmazenaCurso());
            System.out.println("Valor da Lista: " + obj.getValorCurso() + "\nValor do Detalhe: " + obj.getValorDetalhe());
        } else {
            Assert.fail("ERRO - Os valores não são iguais! \n Valor da Lista: " + obj.getValorCurso() + "\n Valor Detalhe: " + obj.getValorDetalhe());
        }
    }

    @Então("valido se o valor PARCELADO da lista é igual ao valor da PÁGINA DETALHE")
    public void validaValoresParcelados() {

        //PEGA O VALOR DO CURSO A VISTA X E ARMAZENA NA VARIAVEL ORIENTADA A OBJETOS
        String VlrDetalhe = navegador.findElement(By.cssSelector("#b_curso > div:nth-child(8) > section > div.cur-details-shopping > div.cur-details-buy > div > div")).getText();
        obj.setValorDetalhe(VlrDetalhe);

        String ValorParcelado = navegador.findElement(By.cssSelector("#b_curso > div:nth-child(8) > section > div.cur-details-shopping > div.cur-details-buy > div.cur-details-shopping-installments")).getText();
        obj.setValorParceladoCurso(ValorParcelado);

        //Contador
        String ContadorCaracteresFraseValorDetalhe = String.valueOf(navegador.findElement(By.cssSelector("#b_curso > div:nth-child(8) > section > div.cur-details-shopping > div.cur-details-buy > div.cur-details-shopping-price")).getText().length());
        String ContadorCaracteresFraseValorParcelado = String.valueOf(navegador.findElement(By.cssSelector("#b_curso > div:nth-child(8) > section > div.cur-details-shopping > div.cur-details-buy > div.cur-details-shopping-installments")).getText().length());

        /* Verifica se valores detalhe igual a 1.000,00 e parcelados estão com valores corretos */
        if (ContadorCaracteresFraseValorDetalhe.contains("11") && ContadorCaracteresFraseValorParcelado.contains("19")) {

            //Código para Formatar o Valor Detalhe para Double
            String pegaValorDetalhe = obj.getValorDetalhe().substring(3, 11).replace(".", "").replace(",", ".");
            double d = Double.parseDouble(pegaValorDetalhe);
            Double DetalheFinal = d;
            System.out.println(DetalheFinal);

            //Código para Formatar o Valor Parcelado para Double
            String pegaValorParceladoCurso = obj.getValorParceladoCurso().substring(13, 19).replace(",", ".");
            double p = Double.parseDouble(pegaValorParceladoCurso);

            //Varável que faz a multiplicação x que é o valor do parcelamento
            double z = p * 12;
            z = Math.rint(z * 100.0) / 100.0; /* faz o arredondamento da multiplicação*/

            //Verifica se o valor total parcelado é igual ao valor total da página detalhe
            if (DetalheFinal.equals(z)) {
                Assert.assertTrue(true);
                System.out.println("Curso: " + obj.getArmazenaCurso());
                System.out.println("Valor da Lista: " + obj.getValorCurso() + "\nValor do Detalhe: " + obj.getValorDetalhe());
            } else {
                Assert.fail("ERRO - Os valores não são iguais! \n Valor da Lista: " + obj.getValorCurso() + "\n Valor Detalhe: " + obj.getValorDetalhe());
            }
        }

        /* Verifica se valores detalhe com 11 caractreres e parcelados com 18 estão com valores corretos */
        else if (ContadorCaracteresFraseValorDetalhe.contains("11") && ContadorCaracteresFraseValorParcelado.contains("18")) {

            //Código para Formatar o Valor Detalhe para Double
            String pegaValorDetalhe = obj.getValorDetalhe().substring(3, 11).replace(".", "").replace(",", ".");
            double d = Double.parseDouble(pegaValorDetalhe);
            Double DetalheFinal = d;
            System.out.println(DetalheFinal);

            //Código para Formatar o Valor Parcelado para Double
            String pegaValorParceladoCurso = obj.getValorParceladoCurso().substring(13, 18).replace(",", ".");
            double p = Double.parseDouble(pegaValorParceladoCurso);

            //Varável que faz a multiplicação x que é o valor do parcelamento
            double z = p * 12;
            z = Math.rint(z * 100.0) / 100.0; /* faz o arredondamento da multiplicação*/

            //Verifica se o valor total parcelado é igual ao valor total da página detalhe
            if (DetalheFinal.equals(z)) {
                Assert.assertTrue(true);
                System.out.println("Curso: " + obj.getArmazenaCurso());
                System.out.println("Valor da Lista: " + obj.getValorCurso() + "\nValor do Detalhe: " + obj.getValorDetalhe());
            } else {
                Assert.fail("ERRO - Os valores não são iguais! \n Valor da Lista: " + obj.getValorCurso() + "\n Valor Detalhe: " + obj.getValorDetalhe());
            }
        }

        /* Verifica se valores detalhe com 11 caractreres e parcelados com 18 estão com valores corretos */
        else if (ContadorCaracteresFraseValorDetalhe.contains("9") && ContadorCaracteresFraseValorParcelado.contains("19")) {

            //Código para Formatar o Valor Detalhe para Double
            String pegaValorDetalhe = obj.getValorDetalhe().substring(3, 9).replace(".", "").replace(",", ".");
            double d = Double.parseDouble(pegaValorDetalhe);
            Double DetalheFinal = d;
            System.out.println(DetalheFinal);

            //Código para Formatar o Valor Parcelado para Double
            String pegaValorParceladoCurso = obj.getValorParceladoCurso().substring(13, 19).replace(",", ".");
            double p = Double.parseDouble(pegaValorParceladoCurso);

            //Varável que faz a multiplicação x que é o valor do parcelamento
            double z = p * 12;
            z = Math.rint(z * 100.0) / 100.0; /* faz o arredondamento da multiplicação*/

            //Verifica se o valor total parcelado é igual ao valor total da página detalhe
            if (DetalheFinal.equals(z)) {
                Assert.assertTrue(true);
                System.out.println("Curso: " + obj.getArmazenaCurso());
                System.out.println("Valor da Lista: " + obj.getValorCurso() + "\nValor do Detalhe: " + obj.getValorDetalhe());
            } else {
                Assert.fail("ERRO - Os valores não são iguais! \n Valor da Lista: " + obj.getValorCurso() + "\n Valor Detalhe: " + obj.getValorDetalhe());
            }
        }

        /* Verifica se valores detalhe com 9 caractreres e parcelados com 18 estão com valores corretos */
        else if (ContadorCaracteresFraseValorDetalhe.contains("9") && ContadorCaracteresFraseValorParcelado.contains("18")) {

            //Código para Formatar o Valor Detalhe para Double
            String pegaValorDetalhe = obj.getValorDetalhe().substring(3, 9).replace(".", "").replace(",", ".");
            double d = Double.parseDouble(pegaValorDetalhe);
            Double DetalheFinal = d;
            System.out.println(DetalheFinal);

            //Código para Formatar o Valor Parcelado para Double
            String pegaValorParceladoCurso = obj.getValorParceladoCurso().substring(13, 18).replace(",", ".");
            double p = Double.parseDouble(pegaValorParceladoCurso);

            //Varável que faz a multiplicação x que é o valor do parcelamento
            double z = p * 12;
            z = Math.rint(z * 100.0) / 100.0; /* faz o arredondamento da multiplicação*/

            //Verifica se o valor total parcelado é igual ao valor total da página detalhe
            if (DetalheFinal.equals(z)) {
                Assert.assertTrue(true);
                System.out.println("Curso: " + obj.getArmazenaCurso());
                System.out.println("Valor da Lista: " + obj.getValorCurso() + "\nValor do Detalhe: " + obj.getValorDetalhe());
            } else {
                Assert.fail("ERRO - Os valores não são iguais! \n Valor da Lista: " + obj.getValorCurso() + "\n Valor Detalhe: " + obj.getValorDetalhe());
            }
        }

        /* Verifica se valores detalhe com 9 caractreres e parcelados com 17 estão com valores corretos */
        else if (ContadorCaracteresFraseValorDetalhe.contains("9") && ContadorCaracteresFraseValorParcelado.contains("17")) {

            //Código para Formatar o Valor Detalhe para Double
            String pegaValorDetalhe = obj.getValorDetalhe().substring(3, 9).replace(".", "").replace(",", ".");
            double d = Double.parseDouble(pegaValorDetalhe);
            Double DetalheFinal = d;
            System.out.println(DetalheFinal);

            //Código para Formatar o Valor Parcelado para Double
            String pegaValorParceladoCurso = obj.getValorParceladoCurso().substring(13, 17).replace(",", ".");
            double p = Double.parseDouble(pegaValorParceladoCurso);

            //Varável que faz a multiplicação x que é o valor do parcelamento
            double z = p * 12;
            z = Math.rint(z * 100.0) / 100.0; /* faz o arredondamento da multiplicação*/

            //Verifica se o valor total parcelado é igual ao valor total da página detalhe
            if (DetalheFinal.equals(z)) {
                Assert.assertTrue(true);
                System.out.println("Curso: " + obj.getArmazenaCurso());
                System.out.println("Valor da Lista: " + obj.getValorCurso() + "\nValor do Detalhe: " + obj.getValorDetalhe());
            } else {
                Assert.fail("ERRO - Os valores não são iguais! \n Valor da Lista: " + obj.getValorCurso() + "\n Valor Detalhe: " + obj.getValorDetalhe());
            }
        }

        /* Verifica se valores detalhe com 8 caractreres e parcelados com 18 estão com valores corretos */
        else if (ContadorCaracteresFraseValorDetalhe.contains("8") && ContadorCaracteresFraseValorParcelado.contains("17")) {

            //Código para Formatar o Valor Detalhe para Double
            String pegaValorDetalhe = obj.getValorDetalhe().substring(3, 8).replace(".", "").replace(",", ".");
            double d = Double.parseDouble(pegaValorDetalhe);
            Double DetalheFinal = d;
            System.out.println(DetalheFinal);

            //Código para Formatar o Valor Parcelado para Double
            String pegaValorParceladoCurso = obj.getValorParceladoCurso().substring(13, 17).replace(",", ".");
            double p = Double.parseDouble(pegaValorParceladoCurso);

            //Varável que faz a multiplicação x que é o valor do parcelamento
            double z = p * 12;
            z = Math.rint(z * 100.0) / 100.0; /* faz o arredondamento da multiplicação*/

            //Verifica se o valor total parcelado é igual ao valor total da página detalhe
            if (DetalheFinal.equals(z)) {
                Assert.assertTrue(true);
                System.out.println("Curso: " + obj.getArmazenaCurso());
                System.out.println("Valor da Lista: " + obj.getValorCurso() + "\nValor do Detalhe: " + obj.getValorDetalhe());
            } else {
                Assert.fail("ERRO - Os valores não são iguais! \n Valor da Lista: " + obj.getValorCurso() + "\n Valor Detalhe: " + obj.getValorDetalhe());
            }
        }
    }//Fim do Loop

    @Então("verifico que a quantidade de cursos disponíveis são iguais")
    public void verificaQuantidadeDeCursosDisponiveis(){

        String QntdCursoPaginaLista  = navegador.findElement(By.cssSelector("#b_cursos_porconcurso > section.section-content > div > div > div.cur-group-info > div > div > span.text")).getText();

        if (QntdCursoPaginaLista.contains(obj.getTotalCursosPaginaProfessor())){
            Assert.assertTrue(true);
            Assert.assertEquals(obj.getTotalCursosPaginaProfessor(), QntdCursoPaginaLista);
        }
        else {
         Assert.fail("ERRO - O Valor contido na página de busca por professor não está igual ao total de cursos contido na página da lista de cursos. \n Valor Página Professor: " + obj.getTotalCursosPaginaProfessor() + "\n Valor Página Lista Cursos: " + QntdCursoPaginaLista );
        }
    }

    @After
    public void tearDown(){
       navegador.quit();
    }

}
