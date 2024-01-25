package CodingAssingment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class QuestionPageTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://qaquestion.ccbp.tech/");
        driver.manage().window().maximize();
        WebElement w1 = driver.findElement(By.xpath("//form[@id='questionsForm']/child::h1"));
        String Str1 = w1.getText();
        String Str2 = "What is the capital of India?";
        if (Str1.equals(Str2)) {
            System.out.println("Question Checked");
        } else {
            System.out.println("Mismatch Found in Question");
        }
        WebElement w2 = driver.findElement(By.xpath("//child::button"));
        w2.click();
        WebElement w3 = driver.findElement(By.xpath("//child::p"));
        String Str4 = w3.getText();
        String Str5 = "Please select the City!";
        if (Str4.equals(Str5)) {
            System.out.println("Missing Option Case Checked");
        } else {
            System.out.println("Error Occured for Missing Option Case");
        }
        List<WebElement> list1 = driver.findElements(By.xpath("//descendant::input"));
        List<WebElement> list2 = driver.findElements(By.xpath("//descendant::label"));
        int i=2;
        for (i = 0; i < list2.size(); i++) {
            if (list2.get(i).getText().equals("Delhi")) {
                list2.get(i).click();

            }
        }
        driver.findElement(By.xpath("//child::button")).click();
        WebElement l1 = driver.findElement(By.xpath("//p[@id='resultMsg']"));
        String message = l1.getText();
       String Excetedmessage="Correct Answer!";
       if(message.equals(Excetedmessage)){
           System.out.println("Correct Answer!");
       }else{
           System.out.println("Wrong Answer!");
       }
        if(!message.equals(Excetedmessage )){
            System.out.println("Error Occured in Options");

        }
        if(list2.size()==4){
            System.out.println("Question Page Working as Expected");
        }
    }
}
