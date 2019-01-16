package XueQiu;

import Data.XueqiuParamers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.LoginPage;
import page.MainPage;
import page.ProfilePage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class LoginTest {

    static MainPage mainPage;
    static ProfilePage profilePage;

//    @BeforeAll
    @BeforeClass
    static void before(){
         mainPage = MainPage.start();
         profilePage = mainPage.gotoProfile();
    }

//    @ParameterizedTest
//    @CsvSource({
//            "15600534760, xxxxxxxx, 用户名或密码错误",
//            "1560053476, xxxxxxxx, 手机号码填写错误"
//    })

      @Test(dataProvider = "getLogin",dataProviderClass = XueqiuParamers.class)
      public void byPassword(String usename,String password, String expect){

        LoginPage loginpage = profilePage.gotoLoginPage();
        loginpage.passwordFalse(usename, password);
        assertThat(loginpage.getMessage(),equalTo(expect));
        loginpage.gotoProfile();


    }
}
