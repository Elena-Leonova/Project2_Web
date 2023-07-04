package tests;

import models.User;
import models.UserLombok;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginLombok extends TestBase{

    @Test
    public void positiveLoginTest(){
       // logger.info("Test login positive--> " + us);
        UserLombok userLombok = UserLombok.builder().email("lena.postrash@gmail.com").password("Mynameislena1!").build();
        app.getUserHelper().openLoginForm();
        app.getUserHelper().fillLoginForm(userLombok);
        app.getUserHelper().submitLogin();
        app.getUserHelper().pause(10000);
        Assert.assertTrue(app.getUserHelper().isElementPresent(By.xpath("//span[@class='DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez']")));
    }
}
