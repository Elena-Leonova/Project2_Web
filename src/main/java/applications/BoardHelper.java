package applications;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.nio.file.WatchEvent;
import java.util.List;

public class BoardHelper extends HelperBase{
    public BoardHelper(WebDriver wd) {
        super(wd);
    }

    public void fillBoardForm() {


    }

    public void pressCreateButton() {
        click(By.xpath("//span[text()='Create new board']"));
    }


    public void submitCreateButton() {

    }

    public void pressBoard() {
        click(By.xpath("//span[@class='DD3DlImSMT6fgc XQSLFE3ZZrvms3'][normalize-space()='Boards']"));
    }

    public int counterBoards(){
        List<WebElement>boardList = wd.findElements(By.xpath(""));
        return boardList.size();
    }

    public String getTitle(){
      return  wd.findElement(By.xpath("")).getText();
    }
}
