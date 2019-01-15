package page;

import driver.Driver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class SearchPage extends BasePage {

    public  SearchPage search(String keyword){

        find(By.className("android.widget.EditText")).sendKeys(keyword);
        return this;

    }

    public MainPage cancle(){
        find(By.id("action_close")).click();
        return new MainPage();
    }

    public ArrayList<String> getAll(){
        ArrayList<String> result = new ArrayList<String>();

        for(WebElement e: Driver.getCurrentDriver().findElements(By.id("stockName"))){
            result.add(e.getAttribute("text"));
        }
        return result;

    }

    public ArrayList<String> addSelector(){
        ArrayList<String> result = new ArrayList<String>();
        AndroidElement element = (AndroidElement) find(By.xpath("//*[contains(@resource-id, 'follow') and contains(@resource-id, '_btn')]"));
        result.add(element.getAttribute("resourceId"));
        element.click();
        AndroidElement element1 = (AndroidElement) find(By.xpath("//*[contains(@resource-id, 'follow') and contains(@resource-id, '_btn')]"));
        result.add(element1.getAttribute("resourceId"));
        return result;

        }



    }


