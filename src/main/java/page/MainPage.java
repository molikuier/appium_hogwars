package page;

import driver.Driver;
import org.openqa.selenium.By;

public class MainPage extends BasePage{

    public static MainPage start(){
        Driver.start();
        return new MainPage();
    }

    public ProfilePage gotoProfile(){
        find(By.id("user_profile_icon")).click();
        return new ProfilePage();
    }

    public SearchPage gotoSearch(){
        find(By.id("home_search")).click();
        return new SearchPage();
    }

}
