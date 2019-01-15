package page;

public class ProfilePage extends BasePage {

    public LoginPage gotoLoginPage(){
        find(text("点击登录")).click();
        return new LoginPage();
    }
}
