package CodingAssingment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class MobilePageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qamobilespecs.ccbp.tech/");
        driver.manage().window().maximize();
List<WebElement>elements=driver.findElements(By.xpath("//li[contains(text(),'3 GB RAM')]/following-sibling::li"));
String[]set={"5.80 Super Retina HD OLED Display", "Front Camera 7MP","Rear Camera 12MP + 12MP","Apple A11 Bionic Processor", "Battery Capacity 2716mAH"};
String[]actualvalue=new String[elements.size()];
for(int i=0;i< elements.size();i++){
actualvalue[i]=elements.get(i).getText();
}
boolean match=java.util.Arrays.equals(actualvalue,set);
if(match){
    System.out.println("Verified Specifications");
}else{
    System.out.println("Mismatch Found in Specifications");
}
WebElement el1=driver.findElement(By.xpath("//parent::div/preceding-sibling::h1"));
String str=el1.getText();
String str1="Specifications:";
if(str.equals(str1)){
    System.out.println("Verified Heading");
}else{
    System.out.println("Mismatch Found in Heading");
}
WebElement el3=driver.findElement(By.xpath("//following::button/parent::div"));
el3.click();
System.out.println("Button is Clicked");
    }
    }

