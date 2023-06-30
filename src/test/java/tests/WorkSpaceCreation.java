package tests;

import models.User;
import models.WorkSpace;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WorkSpaceCreation extends TestBase{

    @BeforeMethod
    public void preConditions() {
        if(!app.getUserHelper().isElementPresent(By.xpath("//span[@class='DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez']"))){
            app.getUserHelper().openLoginForm();
            app.getUserHelper().fillLoginForm(new User().withEmail("lena.postrash@gmail.com").withPassword("Mynameislena1!"));
            app.getUserHelper().submitLogin();
            app.getUserHelper().pause(3000);
        }
    }

    @Test

    public void workSpaceCreationTest(){
        app.getWorkSpaceHelper().pressPlusButton();
        String name = "qa19_" ;
        app.getWorkSpaceHelper().fillWorkSpaceForm(new WorkSpace().withName(name));
        String title = app.getWorkSpaceHelper().getTitle();
        Assert.assertEquals(name, title);
    }
}
