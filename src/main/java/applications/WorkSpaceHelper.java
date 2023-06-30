package applications;

import models.User;
import models.WorkSpace;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WorkSpaceHelper extends HelperBase{
    public WorkSpaceHelper(WebDriver wd) {
        super(wd);
    }

    public void pressPlusButton() {
        click(By.cssSelector(""));
        pause(2000);
    }

    public void fillWorkSpaceForm(WorkSpace workSpace) {
        type(By.cssSelector(""), workSpace.getName());
        click(By.cssSelector(""));
        pause(2000);
        // setTimeout(function() {
        //  debugger;
        // }, 5000);
        click(By.xpath(""));
        pause(4000);
        WebElement el = wd.findElement(By.cssSelector(""));
        new Actions(wd).moveToElement(el).click(el).sendKeys("qa19_workspace").perform();
        pause(2000);
        click(By.cssSelector(""));
        pause(2000);
        click(By.xpath(""));
        pause(3000);
    }

    public String getTitle() {
        return wd.findElement(By.xpath("")).getText();
    }
}
