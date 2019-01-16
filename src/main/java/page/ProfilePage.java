package page;

import org.openqa.selenium.WebElement;

public class ProfilePage extends BasePage {

    public LoginPage gotoLoginPage(){

            while (true){
                WebElement element = find(text("点击登录"));
                if(element.isDisplayed()) {
                    element.click();
                    break;
                }

            }

        return new LoginPage();
    }
}
