//public class TestDemo {
//
//    private AndroidDriver driver;
//
//    @Before
//    public void setUp() throws MalformedURLException {
//        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability("platformName", "Android");
//        desiredCapabilities.setCapability("platformVersion", "8.0.0");
//        desiredCapabilities.setCapability("deviceName", "2b383fc5");
//        desiredCapabilities.setCapability("noReset", "true");
//        desiredCapabilities.setCapability("appActivity", ".view.WelcomeActivityAlias");
//        desiredCapabilities.setCapability("appPackage", "com.xueqiu.android");
//
//        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");
//
//        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
//    }
//
//    @Test
//    public void test_fun1() {
//
//        MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TabHost/android.widget.LinearLayout/android.widget.TabWidget/android.widget.RelativeLayout[4]/android.widget.ImageView");
//        el1.click();
//    }
//
//    @After
//    public void tearDown() {
//        driver.quit();
//    }
//}
