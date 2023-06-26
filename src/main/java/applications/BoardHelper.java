package applications;

import models.Board;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.WatchEvent;
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
}
