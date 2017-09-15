package Tests;

import Pages.SearchPage;
import Pages.VideoPage;
import Settings.ChromeSettings;
import org.testng.annotations.Test;

public class Tests extends ChromeSettings {

    @Test
    public void searchVideo() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);
        VideoPage videoPage = new VideoPage(driver);
        searchPage.typeVideoName();
        searchPage.videoClick();

        String winHandleBefore = driver.getWindowHandle();
        videoPage.muteVideo();
        Thread.sleep(15000);
        videoPage.clickOnAdvert();
        driver.switchTo().window(winHandleBefore);
        Thread.sleep(1000);

        videoPage.playVideoClick();
    }
}
