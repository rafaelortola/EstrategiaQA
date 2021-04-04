Olá, para rodar o projeto vamos definir uma série de etapas que serão explicadas em cada tópico abaixo: <br><br>

 --------------------------------------- ETAPAS DE CONFIGURAÇÃO  ---------------------------------------<br>
<br>
1- Fazer um git clone do projeto em sua máquina. <br><br>
2- Abrir a classe "TestRunner" e alterar a linha 8 com o endereço do seu computador: <br>
Exemplo: <i>plugin = {"pretty", "html:C:/Users/seu-usuario/Desktop/</i>DesafioEstrategia/src/test/java/Report"},</i><br><br>
3- Modificar, também, a linha 10 com o endereço do seu computador: <br>
Exemplo: <i>features = {"C:/Users/seu-usuario/Desktop/DesafioEstrategia/src/test/Features"},</i><br><br>
4- Abrir a classe "Config" que está dentro da pasta "Suporte" e alterar na linha 11 o trecho do código com seu usuário:<br>
Exemplo: <i>"C:/Users/seu-usuario/Desktop/DesafioEstrategia/chromedriver/chromedriver.exe");</i><br><br><br><br>
 --------------------------------------- IMPORTANTE ---------------------------------------<br><br>
A- O ChromeDriver.exe já está incluido em uma pasta do projeto, ou seja, é só o usuário seguir as orientações acima para poder rodar o projeto <br><br>
B- Os cenários estão descritos no formato ".FEATURE" e estão na pasta 'test/Features'.<br><br>
C- Os 3 cenários estão definidos com duas tags:<br><br>
@regressivo - essa tag roda todos os cenários de uma só vez<br>
@avista - essa tag roda apenas os cenários de cursos com valores a vista.<br>
@parcelado - essa tag roda apenas os cenários de cursos com valores parcelados.<br>
@validaquantidadecursos - essa tag executa, somente, o cenário que valida o TOTAL DE CURSOS exibidos na página de busca por professores com o total exibido na página que exibe a lista dos cursos de professores.<br><br>
D- Para rodar os testes, você deve abrir a classe "TestRunner" e inserir na linha 9, a TAG que deseja roda<br><br>
Exemplo: tags = {"@avista"},<br>
E- Ao iniciar a execução dos testes, não mexa mais em nada até que o teste seja concluido.<br><br>
F- Ao final da execução dos testes, o cucumber gera um relatório onde você pode verificar os resultados, esse relatório fica na pasta "Report". lá você pode encontrar um arquivo chamado index.html, no qual, você deve abrir ou arrastá-lo para o Google Chrome e visualizar.<br><br>
G- Vale a pena destacar aqui, que se você rodar o cenário com a tag @validaquantidadecursos, ele não vai passar, visto que abri um ticket para BUG pois os cursos disponíveis estão divergentes em páginas diferentes. por tanto, esse cenário você poderá verificar que a Asserção feita com o JUNIT está funcionando perfeitamente.
