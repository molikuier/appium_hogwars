package Data;


import org.testng.annotations.DataProvider;

public class XueqiuParamers {

    @DataProvider
    public Object[][] getLogin(){
        return new Object[][]{
                {"15600534760", "xxxxxxxx", "用户名或密码错误"},
                {"1560053476", "xxxxxxxx", "手机号码填写错误"}
        };
    }

    @DataProvider
    public Object[][] getSearch(){
        return new Object[][]{
                {"pdd","拼多多"},
                {"alibaba", "阿里巴巴"}
        };
    }
}
