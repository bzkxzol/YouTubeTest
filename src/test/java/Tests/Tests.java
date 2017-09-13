package Tests;

import Pages.SearchPage;
import Pages.VideoPage;
import Settings.ChromeSettings;
import org.testng.annotations.Test;

public class Tests extends ChromeSettings{

    @Test
    public void searchVideo() throws InterruptedException{
        SearchPage searchPage = new SearchPage(driver);
        VideoPage videoPage = new VideoPage(driver);

        searchPage.typeVideoName();
        searchPage.videoClick();
        videoPage.clickLikeButton();
    }

}