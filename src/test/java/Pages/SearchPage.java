package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {

    private WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }

    By searchFieldLocator = By.xpath(".//*[@id='search']");
    By searchButtonLocator = By.xpath(".//*[@id='search-icon-legacy']");
    By videoLocator = By.xpath(".//*[@title=\"Как выпрыгнуть в окно PUBG | How to jump through window - PlayerUnknown's Battlegrounds\"]");

    public void typeVideoName(){
        WebElement searchField = driver.findElement(searchFieldLocator);
        searchField.click();
        searchField.sendKeys("pubg jump through window");

        WebElement searchButton = driver.findElement(searchButtonLocator);
        searchButton.click();
    }

    public void videoClick() throws InterruptedException {
        WebElement video = driver.findElement(videoLocator);
        video.click();
        Thread.sleep(80000);
    }
}