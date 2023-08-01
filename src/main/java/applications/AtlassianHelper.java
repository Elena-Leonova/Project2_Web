package applications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;

public class AtlassianHelper extends HelperBase {
    public AtlassianHelper(WebDriver wd) {
        super(wd);
    }

    public void initChangePhoto() {
        Actions action = new Actions(wd);
        action.moveToElement(wd.findElement(By.cssSelector("[data-test-selector='profile-hover-info']"))).click().perform();
        pause(2000);
        click(By.xpath("//*[text()='Add profile photo']"));



    }

    public void uploadPhoto(String path) {
        wd.findElement(By.xpath("//*[text()='Upload a photo']")).sendKeys(path);
        pause(2000);
        click(By.xpath("//*[text()='Upload']"));
        pause(2000);
    }

    public void returnToTrello() {
        List<String> tabs = new ArrayList<>(wd.getWindowHandles());
        wd.switchTo().window(tabs.get(0));
    }
}