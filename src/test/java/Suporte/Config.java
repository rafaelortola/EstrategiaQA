package Suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Config {

    public static WebDriver Chrome(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/rafae/Desktop/DesafioEstrategia/chromedriver/chromedriver.exe");
        WebDriver navegador = new ChromeDriver();

        //Trecho de código para maximizar a tela
        navegador.manage().window().maximize();

        //Definindo um timeout implícito de 20 segundos
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Direciona para URL
        navegador.get("https://www.estrategiaconcursos.com.br/");

        //Retorna a nova instância do navegador para execução
        return navegador;
    }
}
