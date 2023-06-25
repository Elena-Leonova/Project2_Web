package tests;

import models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase{

@Test(priority = 1)
    public void positiveLoginTest(){
        app.getUserHelper().openLoginForm();
        app.getUserHelper().fillLoginForm(new User().withEmail("lena.postrash@gmail.com").withPassword("Mynameislena1!"));
        app.getUserHelper().submitLogin();
        app.getUserHelper().pause(10000);
        Assert.assertTrue(app.getUserHelper().isElementPresent(By.xpath("//span[@class='DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez']")));
    }

   @Test
    public void negativePasswordLoginTest(){
        app.getUserHelper().openLoginForm();
        app.getUserHelper().fillLoginForm(new User().withEmail("lena.postrash@gmail.com").withPassword("Mynameislena1"));
        app.getUserHelper().submitLogin();
        app.getUserHelper().pause(10000);
        Assert.assertTrue(app.getUserHelper()
                .isElementPresent(By.xpath("//span[contains(text(),'Incorrect email address and / or password. If you ')]")));

    }


    @Test
    public void negativeEmailLoginTest(){
        app.getUserHelper().openLoginForm();
        app.getUserHelper().pause(2000);
        app.getUserHelper().fillEmailField(new User().withEmail("lena.postrash"));
        app.getUserHelper().pause(2000);
        Assert.assertTrue(app.getUserHelper().isElementPresent(By.xpath("//input[@id='login']")));

    }

    @Test(priority = 2)
    public void logoutTest() {
        if (app.getUserHelper().isElementPresent(By.xpath("//span[@class='DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez']"))) {
            app.getUserHelper().openAccountform();
            app.getUserHelper().pause(2000);
            app.getUserHelper().submitLogOut();
            app.getUserHelper().pressOkButton();
            app.getUserHelper().pause(2000);
            Assert.assertTrue(app.getUserHelper().isElementPresent(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")));
        } else {
            //Assert.assertTrue(app.getUserHelper().isElementPresent(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")));
            app.getUserHelper().openLoginForm();
            app.getUserHelper().fillLoginForm(new User().withEmail("lena.postrash@gmail.com").withPassword("Mynameislena1!"));
            app.getUserHelper().submitLogin();
            app.getUserHelper().pause(10000);
            app.getUserHelper().openAccountform();
            app.getUserHelper().pause(2000);
            app.getUserHelper().submitLogOut();
            app.getUserHelper().pressOkButton();
            app.getUserHelper().pause(2000);
            Assert.assertTrue(app.getUserHelper().isElementPresent(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']")));
        }
    }

@Test

public void negativeLoginWithoutPassword(){
app.getUserHelper().openLoginForm();
app.getUserHelper().fillLoginForm(new User().withEmail("lena.postrash@gmail.com"));
app.getUserHelper().submitLogin();
app.getUserHelper().pause(1000);
Assert.assertTrue(app.getUserHelper().isElementPresent(By.id("password-error")));
}
}