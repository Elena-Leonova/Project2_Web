package tests;

import applications.DataProviderUser;
import models.User;
import models.UserLombok;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginLombok extends TestBase {

    @Test
    public void positiveLoginTest() {
        // logger.info("Test login positive--> " + us);
        UserLombok userLombok = UserLombok.builder().email("lena.postrash@gmail.com").password("Mynameislena1!").build();
        logger.info("Test login positive --> " + userLombok.getEmail() + " " + userLombok.getPassword());
        app.getUserHelper().openLoginForm();
        app.getUserHelper().fillLoginForm(userLombok);
        app.getUserHelper().submitLogIn();
        app.getUserHelper().pause(10000);
        logger.info("Logged ----");
        Assert.assertTrue(app.getUserHelper().isElementPresent(By.xpath("//span[@class='DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez']")));
    }

    @Test(dataProvider = "UserDataProviderLombok", dataProviderClass = DataProviderUser.class)
    public void positiveLoginTestDP(UserLombok userLombok) {
        // logger.info("Test login positive--> " + us);
       // UserLombok userLombok = UserLombok.builder().email("lena.postrash@gmail.com").password("Mynameislena1!").build();
        logger.info("Test login positive --> " + userLombok.getEmail() + " " + userLombok.getPassword());
        app.getUserHelper().openLoginForm();
        app.getUserHelper().fillLoginForm(userLombok);
        app.getUserHelper().submitLogIn();
        app.getUserHelper().pause(10000);
        logger.info("Logged ----");
        Assert.assertTrue(app.getUserHelper().isElementPresent(By.xpath("//span[@class='DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez']")));
    }

    @Test
    public void negativePasswordLoginTest(){
        UserLombok userLombok = UserLombok.builder().email("lena.postrash@gmail.com").password("Mynameislena1").build();
        logger.info("Test negative with wrong password --> " + userLombok.getEmail() + " " + userLombok.getPassword());
        app.getUserHelper().openLoginForm();
        app.getUserHelper().fillLoginForm(userLombok);
        app.getUserHelper().submitLogIn();
        app.getUserHelper().pause(10000);
        logger.info("Test failed ");
        Assert.assertTrue(app.getUserHelper()
                .isElementPresent(By.xpath("//span[contains(text(),'Incorrect email address and / or password. If you ')]")));

    }
}
