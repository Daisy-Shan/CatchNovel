import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static com.codeborne.selenide.Selenide.*;

public class OriginalNovelWebSitePage {
    private final By bookList = By.cssSelector("div.all-book-list > div.book-img-text > ul.all-img-list.cf > li >div > h4");

    public OriginalNovelWebSitePage()
    {

    }
    public OriginalNovelWebSitePage load()
    {
        open("https://www.qidian.com/mm/finish");
        return this;
    }

    public List<String> getAllBookList()
    {
        List<String> books = new ArrayList<String>();
        ElementsCollection eles = $$(bookList);
        for (WebElement e: eles) {
            books.add(e.getText());
            System.out.println(e.getText());
        }
        return books;
    }


}
