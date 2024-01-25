package CodingAssingment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdditionGameTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaadditiongame.ccbp.tech/");
        driver.manage().window().maximize();
       WebElement element1= driver.findElement(By.xpath("(//input[@id='userInput']/preceding-sibling::span)[1]"));
        WebElement element2= driver.findElement(By.xpath("(//input[@id='userInput']/preceding-sibling::span)[3]"));
         String firstElement= element1.getText();
        String secondElement= element2.getText();
         int firstvalue=Integer.parseInt(firstElement);
        int secondvalue=Integer.parseInt(secondElement);
         int actualvalue=firstvalue+secondvalue;
          String actual=String.valueOf(actualvalue);
         driver.findElement(By.xpath("//input[@id='userInput']")).sendKeys(actual);
         driver.findElement(By.xpath("//button[@id='checkButton']")).click();
         WebElement element= driver.findElement(By.xpath("//following-sibling::p"));
         String str1=element.getText();
         String str2="Congratulations! You got it right.";
         if(str1.equals(str2)){
             System.out.println("Success Case Checked");
         }else{
             System.out.println("Error at Success Case");
         }
        WebElement element4= driver.findElement(By.xpath("//button[@id='restartButton']"));
         element4.click();
        WebElement element8= driver.findElement(By.xpath("(//input[@id='userInput']/preceding-sibling::span)[1]"));
        WebElement element9= driver.findElement(By.xpath("(//input[@id='userInput']/preceding-sibling::span)[3]"));
        String firstElement1= element1.getText();
        String secondElement2= element2.getText();
        int firstvalue1=Integer.parseInt(firstElement);
        int secondvalue2=Integer.parseInt(secondElement);
        int actualvalue1=firstvalue+secondvalue;
        String actual1=String.valueOf(actualvalue);
        driver.findElement(By.xpath("//input[@id='userInput']")).sendKeys(actual);
        driver.findElement(By.xpath("//button[@id='checkButton']")).click();
       WebElement elment76= driver.findElement(By.xpath("//following-sibling::p"));
       String tr="Please Try Again!";
       String tr1= elment76.getText();
       if(tr1.equals(tr)){
           System.out.println("Failure Case Checked");
       }else{
           System.out.println("Error at Failure Case");
       }
       driver.quit();
    }
}
