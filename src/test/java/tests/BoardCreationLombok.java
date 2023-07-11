package tests;

import applications.MyDataProviderBoard;
import models.Board;
import models.BoardLombok;
import models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BoardCreationLombok extends TestBase{

    @BeforeMethod
    public void preConditions() {
        if (!app.getUserHelper().isElementPresent(By.xpath("//span[@class='DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez']"))) {
            app.getUserHelper().openLoginForm();
            app.getUserHelper().fillLoginForm(new User().withEmail("lena.postrash@gmail.com").withPassword("Mynameislena1!"));
            app.getUserHelper().submitLogin();
            app.getUserHelper().pause(3000);
        }
    }


    @Test(dataProvider = "boardModelLomData", dataProviderClass = MyDataProviderBoard.class)
    public void boardCreationTest(BoardLombok boardLombok) {
            app.getBoardHelper().pressCreateButton();
            app.getUserHelper().pause(3000);
            // app.getBoardHelper().selectCreateBoard();
            app.getBoardHelper().fillBoardForm(boardLombok);
            app.getUserHelper().pause(3000);
            app.getBoardHelper().submitCreate();
            app.getUserHelper().pause(3000);
            app.getBoardHelper().pressBoard();
            app.getUserHelper().pause(2000);
            int after = app.getBoardHelper().numberBoards();
            app.getUserHelper().pause(3000);
            //String title = app.getBoardHelper().getTitle();
            //app.getUserHelper().pause(3000);
           // Assert.assertEquals(before, after-1);
            //Assert.assertEquals(boardName, title);
        }
    @Test(dataProvider = "boardData", dataProviderClass = MyDataProviderBoard.class)
    public void boardCreationTest1(String title) {

        int before = app.getBoardHelper().numberBoards();
        app.getUserHelper().pause(3000);
        app.getBoardHelper().pressCreateButton();
        app.getUserHelper().pause(3000);
        app.getBoardHelper().fillBoardForm(title);
        app.getUserHelper().pause(3000);
        app.getBoardHelper().submitCreate();
        app.getUserHelper().pause(3000);
        app.getBoardHelper().pressBoard();
        app.getUserHelper().pause(2000);
        int after = app.getBoardHelper().numberBoards();
        app.getUserHelper().pause(3000);
    }
}
