package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VideoPage {

    private WebDriver driver;

    public VideoPage(WebDriver driver) {
        this.driver = driver;
    }

    By likeButtonLocator = By.xpath(".//*[@id='top-level-buttons']/ytd-toggle-button-renderer[1]");

    public void clickLikeButton(){
        WebElement likeButton = driver.findElement(likeButtonLocator);
        likeButton.click();
    }

}
