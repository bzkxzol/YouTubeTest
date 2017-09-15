package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    private By searchFieldLocator = By.xpath(".//*[@id='search']");
    private By searchButtonLocator = By.xpath(".//*[@id='search-icon-legacy']");
    private By videoLocator = By.xpath(".//*[@id='video-title' and @href='/watch?v=g8ud96hgrDM&t=1s']");

    public void typeVideoName() {
        WebElement searchField = driver.findElement(searchFieldLocator);
        searchField.click();
        searchField.sendKeys("pubg jump through window");
        WebElement searchButton = driver.findElement(searchButtonLocator);
        searchButton.click();
    }

    public void videoClick() throws InterruptedException {
        WebElement video = driver.findElement(videoLocator);
        video.click();
        Thread.sleep(1000);
    }
}
