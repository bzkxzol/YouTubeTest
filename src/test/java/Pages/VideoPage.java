package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class VideoPage {

    private WebDriver driver;

    public VideoPage(WebDriver driver) {
        this.driver = driver;
    }

    private By likeButtonLocator = By.xpath(".//*[@id='top-level-buttons']/ytd-toggle-button-renderer[1]");
    private By playVideoLocator = By.xpath("//button[@class='ytp-play-button ytp-button']");
    private By advertLocator = By.xpath(".//*[@class='image-container']/a/img");
    private By muteVideoLocator = By.xpath("//button[@class='ytp-mute-button ytp-button']");

//    public void clickLikeButton(){
//        WebElement likeButton = driver.findElement(likeButtonLocator);
//        likeButton.click();
//    }

    public void muteVideo(){
        WebElement muteVideo = driver.findElement(muteVideoLocator);
        Actions mute = new Actions(driver);
        mute.moveToElement(muteVideo).click().build().perform();
    }

    public void clickOnAdvert() throws InterruptedException {
        WebElement advertBlock = driver.findElement(advertLocator);
        advertBlock.click();
        Thread.sleep(5000);
    }

    public void playVideoClick() throws InterruptedException {
        WebElement playVideoButton = driver.findElement(playVideoLocator);
        Actions play = new Actions(driver);
        play.moveToElement(playVideoButton).click().build().perform();
        Thread.sleep(70000);
    }
}
