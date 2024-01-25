package CodingAssingment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ServicePageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://qaservicesect.ccbp.tech/");
        driver.manage().window().maximize();
        List<WebElement> list1=driver.findElements(By.xpath("//h1[contains(text(),'Online Support 24/7')]/ancestor::div[position()=2]/preceding::h1[@class='services-card-title']"));
        String[]set={"Fast and Free Delivery", "100% Money back guarantee"};
        String []actualvalue=new String[list1.size()];
        for(int i=0;i< list1.size();i++){
            actualvalue[i]=list1.get(i).getText();
        }
        boolean match=java.util.Arrays.equals(actualvalue,set);
        if(match){
            System.out.println("Titles Checked");
        }else{
            System.out.println("Mismatch Found in Titles");
        }
        List<WebElement> elementList = driver.findElements(By.xpath("//ancestor::div[position()=2]/preceding::p[@class='services-card-description']"));
        String[]set1={"Fast, free, and convenient delivery choices on millions of items.", "This is probably the most popular guarantee in the world."};
        String []actualvalue1=new String[elementList.size()];
        for(int i=0;i< elementList.size();i++){
            actualvalue1[i]=elementList.get(i).getText();
        }
       boolean match1=java.util.Arrays.equals(actualvalue1,set1);
        if(match1){
            System.out.println("Descriptions Checked");
        }else{
            System.out.println("Mismatch Found in Descriptions");
        }
        WebElement el2=driver.findElement(By.xpath("//ancestor::div[position()=2]/preceding::div[position()=5]/child::h1[@class='services-section-heading']"));
        String Str1=el2.getText();
        String Str2="Our Services";
        if(Str1.equals(Str2)){
            System.out.println("Section Header Checked");
        }else{
            System.out.println("Mismatch Found in Section Header");
        }
        WebElement el3=driver.findElement(By.xpath("//ancestor::div[position()=2]/preceding::div[position()=5]/child::p[@class='services-section-description']"));
        String Str4=el3.getText();
        String Str5="Most online stores offer lower prices. Online shopping makes price comparison simpler and quicker. It is very convenient to shop from where you are located. It saves you the cost of driving to stores, as well as parking fees.";
        if(Str4.equals(Str5)){
            System.out.println("Section Header Checked");
        }else{
            System.out.println("Mismatch Found in Section Header");
        }
        driver.quit();
    }
    }

