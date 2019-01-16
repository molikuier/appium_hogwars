package page;

import org.openqa.selenium.By;

public class ProfilePage extends BasePage {

    public LoginPage gotoLoginPage(){

        find(By.xpath("//*[@text='点击登录']")).click();

        return new LoginPage();
    }
}
