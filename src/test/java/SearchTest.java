import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import page.MainPage;
import page.SearchPage;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;

public class SearchTest {

    static MainPage mainPage;
    static SearchPage searchPage;

    @BeforeAll
    static void befor(){
        mainPage = MainPage.start();
        searchPage = mainPage.gotoSearch();

    }

    @ParameterizedTest
    @CsvSource({"pdd,拼多多","alibaba, 阿里巴巴"})
     void search(String keyword,String expect){
        searchPage.search(keyword);
        ArrayList<String> result = searchPage.getAll();
        String name = result.get(0);
        assertThat(name,equalTo(expect));



    }

    @Test
    void selector(){
        ArrayList<String> select = searchPage.search("alibaba").addSelector();
        assertThat(select,hasItems("com.xueqiu.android:id/followed_btn", "com.xueqiu.android:id/follow_btn"));
    }


}
