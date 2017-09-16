package Tests;

import Pages.SearchPage;
import Pages.VideoPage;
import Settings.ChromeSettings;
import org.testng.annotations.Test;

public class Tests extends ChromeSettings {

    @Test
    public void searchVideo() throws InterruptedException {
        SearchPage searchPage = new SearchPage(driver);

        System.out.println("Step 1");
        VideoPage videoPage = new VideoPage(driver);

        System.out.println("Step 2");
        searchPage.typeVideoName();

        System.out.println("Step 3");
        searchPage.videoClick();

        System.out.println("Step 4");
        String winHandleBefore = driver.getWindowHandle();

        System.out.println("Step 5");
        videoPage.muteVideo();
        Thread.sleep(5000);

        System.out.println("Step 5.1");
        videoPage.clickOnBigAdvert();
        Thread.sleep(6000);
        driver.switchTo().window(winHandleBefore);

        System.out.println("Step 6");
        videoPage.clickOnAdvert();

        System.out.println("Step 7");
        driver.switchTo().window(winHandleBefore);
        Thread.sleep(1000);

        System.out.println("Step 8");
        videoPage.playVideoClick();
    }
}
