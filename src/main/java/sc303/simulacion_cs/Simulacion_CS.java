/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package sc303.simulacion_cs;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simulacion_CS {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:/Users/usuario/Documents/NetBeansProjects");
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
    }
}
