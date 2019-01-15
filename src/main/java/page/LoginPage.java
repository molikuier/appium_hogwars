package page;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    private By weixin = By.xpath("//*[@text='微信登录']");
    private By other = By.xpath("//*[@text='手机及其他登录']");
    private By passwordLogin = By.xpath("//*[@text='邮箱手机号密码登录']");
    private By username = By.id("login_account");
    private By password = By.xpath("//*[@password='true']");
    private By login_bt = By.id("button_next");

    String message;

    public  void gotoWeixinLogin(){
        find(weixin).click();

    }
    public LoginByYanzheng gotoYanZheng(){
        find(other).click();
        return new LoginByYanzheng();

    }
    public LoginPage passwordFalse(String user,String pass){
        find(other).click();
        find(passwordLogin).click();
        find(username).sendKeys(user);
        find(password).sendKeys(pass);
        find(login_bt).click();
        message = find(By.id("md_content")).getText();
        find(By.id("md_buttonDefaultPositive")).click();
        return this;

    }

    public MainPage passwordSuccess(String user,String pass) {
        find(other).click();
        find(passwordLogin).click();
        find(username).sendKeys(user);
        find(password).sendKeys(pass);
        find(login_bt).click();
        return new MainPage();
    }


    public String getMessage(){return message;}

    public ProfilePage gotoProfile(){
        find(By.xpath("//*[contains(@resource-id, 'iv_close') or contains(@resource-id, 'iv_action_back')]")).click();
        return new ProfilePage();

    }


}
