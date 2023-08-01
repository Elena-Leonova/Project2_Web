package tests;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Avatar extends TestBase{

    @BeforeMethod
    public void preConditions() {
        if (!app.getUserHelper().isElementPresent(By.xpath("//span[@class='DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez']"))) {
            app.getUserHelper().login();
        }
    }
    @Test
public void changeAvatar(){
        app.getBoardHelper().clickTheAvatar();
        app.getUserHelper().pause(2000);
        app.getAtlassian().initChangePhoto();
        app.getUserHelper().pause(2000);
        app.getAtlassian().uploadPhoto("src/test/resources/man-person-girl-.jpg");
        app.getUserHelper().pause(2000);
        app.getAtlassian().returnToTrello();

}
}
