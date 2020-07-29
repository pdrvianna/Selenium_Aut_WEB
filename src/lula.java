import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lula {

		 
		public static void main(String[] args) {
			
			//WebDriver driver = new FirefoxDriver(); 
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"/lib/chromedriver");
			
			WebDriver driver = new ChromeDriver(); 
			

		/*	driver.get("http://www.terra.com.br");	
			boolean i = driver.getPageSource().contains("Lula");
			System.out.println("Lula no Terra? "+(i?"Sim":"Não")); 
			
			driver.get("http://www.uol.com.br");	
			i = driver.getPageSource().contains("Lula");
			System.out.println("Lula no Uol? "+(i?"Sim":"Não")); */
			
		/*	driver.get("https://www.smartfit.com.br/reservas");
			//driver.findElement(By.xpath("//input[@actions = 'button']")).click(); 
			boolean i = driver.getPageSource().contains("Mão");
			System.out.println("Achou SmartFit? "+(i?"Sim":"Não")); 
			WebElement usrLogin = driver.findElement(By.id("fitness_classes_session_login"));
			 usrLogin.sendKeys("01089361718");
			 driver.findElement(By.name("commit")).click();*/
			
			 
			 
			 driver.get("https://www.smartfit.com.br/person_sessions/new");
			 WebElement usrLogin2 = driver.findElement(By.id("person_session_login"));
			 usrLogin2.sendKeys("xxxxx");
			 WebElement passLogin = driver.findElement(By.id("person_session_password"));
			 passLogin.sendKeys("xxxxx");
			 driver.findElement(By.id("s_login")).click();
			 driver.findElement(By.linkText("Reservas")).click();
			//driver.close(); 
			
			
			/*driver.get("http://michelpf.com/exemplo-de-calculadora-em-javascript/"); 

			driver.findElement(By.xpath("//input[@id='1']")).click(); 
			driver.findElement(By.xpath("//input[@id='plus']")).click(); 
			driver.findElement(By.xpath("//input[@id='6']")).click(); 
			driver.findElement(By.xpath("//input[@id='equals']")).click(); 
			String result = driver.findElement(By.xpath("//input[@id='Resultbox']")).getAttribute("value"); 
			System.out.println("Resultado 1+6 = " + result); 
			driver.close();*/
			
			
		}
	}