package applications;

import models.Board;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class BoardHelper extends HelperBase{
    public BoardHelper(WebDriver wd) {
        super(wd);
    }

    public void fillBoardForm(Board board) {
        type(By.xpath("//input[@data-testid='create-board-title-input']"), board.getName() );

    }

    public void pressCreateButton() {

        click(By.xpath("//span[text()='Create new board']"));
    }


    public void submitCreateButton() {
        click(By.xpath("//button[@data-testid='create-board-submit-button']"));

    }

    public void pressBoard() {
       click(By.xpath("//p[@class='nNvJhnERHVQb9o']"));

    }

    public int counterBoards(){
        List<WebElement>boardList = wd.findElements(By.xpath("//ul[@class='boards-page-board-section-list']//li"));
        return boardList.size();
    }

    public String getTitle(){
        return  wd.findElement(By.xpath("//h1[@class='HKTtBLwDyErB_o']")).getText();
    }

    public void openMenu() {
        click(By.xpath("//button[@aria-label='Show menu']"));
    }

    public void pressMore() {
        click(By.xpath("//li[@class='board-menu-navigation-item']//a[contains(.,'More')]"));
    }

    public void pressCloseBoard() {
        click(By.xpath("//a[@class='board-menu-navigation-item-link js-close-board']"));
    }

    public void submitClose() {
        click(By.xpath("//input[@type='submit'] [@value='Close']"));
    }

    public void pressPermanentlyDelete() {
        click(By.xpath("//button[text()='Permanently delete board']"));
    }

    public void pressDeleteButton() {
        click(By.xpath("//button[@data-testid='close-board-delete-board-confirm-button']"));
    }

    
    public void boardsDelitionPath() {

       // WebElement el = wd.findElement(By.xpath("//li[@class='mlpxvZU4v4cMQN wVRQcl7CJz79Tr qUkRGnTnJDff85']//div[@role='menu']//span[@class='css-snhnyn']"));
        WebElement el = wd.findElement(By.xpath("//span[data-testid='OverflowMenuHorizontalIcon']"));
      //WebElement el = wd.findElement(By.xpath(""));
        pause(2000);
        new Actions(wd).moveToElement(el).clickAndHold().click(el).build().perform();
        click(By.xpath("//button[@title='Close board']"));
        pause(2000);
        click(By.xpath("//button[@title='Close']"));
        pause(2000);
        click(By.cssSelector("class^='Bp80TGmc9hQIdE '"));
        pause(2000);
        click(By.cssSelector("//class^=a72r81xglmtLCW bxgKMAm3lq5BpA KpU415sFFvOzGZ PnEv2xIWy3eSui SEj5vUdI3VvxDc"));

    //click(By.xpath("//li[@class='mlpxvZU4v4cMQN wVRQcl7CJz79Tr qUkRGnTnJDff85']//div[@role='menu']//span[@class='css-snhnyn']"));
    }

    public void pressFirstBoardSpot() {
        click(By.xpath("By.xpath(//ul[@class='boards-page-board-section-list']//li[1])"));
    }

    public int getBoardNumber() {
        return counterBoards(By.xpath(""));
    }

    public void boardNameModif() {
        //type(By.xpath("//h1[@data-testid='board-name-display']"), "qa19");
        WebElement el = wd.findElement(By.cssSelector("//div[@class='hiRkezEUBG7ve6 uXhW3KBBr1jUsJ']"));
        pause(3000);
        click(By.cssSelector("//div[@class='hiRkezEUBG7ve6 uXhW3KBBr1jUsJ']"));
        new Actions(wd).moveToElement(el).click(el).sendKeys("qa19" + Keys.ENTER).build().perform();
    }
}
