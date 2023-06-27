package tests;

import models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardDeletion extends TestBase{
    @BeforeMethod
    public void preConditions(){
        if(!app.getUserHelper().isElementPresent(By.xpath("//span[@class='DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez']"))){
            app.getUserHelper().openLoginForm();
            app.getUserHelper().fillLoginForm(new User().withEmail("lena.postrash@gmail.com").withPassword("Mynameislena1!"));
            app.getUserHelper().submitLogin();
            app.getUserHelper().pause(5000);
            app.getUserHelper().click(By.xpath("//ul[@class='boards-page-board-section-list']//li"));
            app.getUserHelper().pause(5000);
        }
    }

//    @Test
//    public void boardDeletionTest(){
//        app.getBoardHelper().openMenu();
//        app.getUserHelper().pause(3000);
//        app.getBoardHelper().pressMore();
//        app.getUserHelper().pause(3000);
//        app.getBoardHelper().pressCloseBoard();
//        app.getUserHelper().pause(2000);
//        app.getBoardHelper().submitClose();
//        app.getUserHelper().pause(2000);
//        app.getBoardHelper().pressPermanentlyDelete();
//        app.getUserHelper().pause(2000);
//        app.getBoardHelper().pressDeleteButton();
//    }

    @Test
    public void boardDeletionTest(){
        while(app.getBoardHelper().getBoardNumber()<8) {
            int before = app.getBoardHelper().NumberBoards();
            app.getBoardHelper().pause(2000);
            app.getBoardHelper().pressFirstBoardSpot();
            app.getBoardHelper().boardsDelitionPath();
            int after = app.getBoardHelper().NumberBoards();
            app.getBoardHelper().pause(2000);
            Assert.assertEquals(before, after+1);
        }

    }
}
