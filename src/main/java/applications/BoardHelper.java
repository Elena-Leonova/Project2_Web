
package applications;

import models.Board;
import models.BoardLombok;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

    public class BoardHelper extends HelperBase {
        public BoardHelper(WebDriver wd) {
            super(wd);
        }

        public void pressCreateButton() {
             click(By.xpath("//span[text()='Create new board']"));
           // click(By.xpath("//div[@class='board-tile mod-add'][.='Create new board']"));
        }

//        public void fillBoardForm(Board board) {
//            type(By.xpath("//input[@data-testid='create-board-title-input']"), board.getName());
//
//        }

        public void fillBoardForm(Board board){
            type(By.xpath("//input[@data-testid='create-board-title-input']"), board.getName());
        }

        public void fillBoardForm(BoardLombok boardLombok){
            type(By.xpath("//input[@data-testid='create-board-title-input']"), boardLombok.getName());
        }

        public void submitCreate() {
            click(By.xpath("//button[@data-testid='create-board-submit-button']"));
        }
        public void pressBoard() {
            click(By.xpath("//p[@class='nNvJhnERHVQb9o']"));

        }

        public int counterBoards(By locator) {
            List<WebElement> boardList = wd.findElements(locator);
            return boardList.size();
        }

        public String getTitle() {
            return wd.findElement(By.xpath("//h1[@class='HKTtBLwDyErB_o']")).getText();
        }





//    public void openMenu() {
//        click(By.xpath("//button[@aria-label='Show menu']"));
//    }
//
//    public void pressMore() {
//        click(By.xpath("//li[@class='board-menu-navigation-item']//a[contains(.,'More')]"));
//    }
//
//    public void pressCloseBoard() {
//        click(By.xpath("//a[@class='board-menu-navigation-item-link js-close-board']"));
//    }
//
//    public void submitClose() {
//        click(By.xpath("//input[@type='submit'] [@value='Close']"));
//    }
//
//    public void pressPermanentlyDelete() {
//        click(By.xpath("//button[text()='Permanently delete board']"));
//    }
//
//    public void pressDeleteButton() {
//        click(By.xpath("//button[@data-testid='close-board-delete-board-confirm-button']"));
//    }

        public void createBoard() {
            click(By.xpath("//div[@class='board-tile mod-add']"));
            pause(2000);
            type(By.xpath("//input[@data-testid='create-board-title-input']"), "hhh");
            pause(2000);
            click(By.xpath("//button[@data-testid='create-board-submit-button']"));
        }

        public boolean isThereAboard() {
            return isElementPresent(By.xpath("//ul[@class='boards-page-board-section-list']//li[1]"));
        }
        public void selectFirstBoard() {
            click(By.xpath("//ul[@class='boards-page-board-section-list']//li[1])"));

        }

        public int numberBoards() {
            return counterBoards(By.cssSelector(".boards-page-board-section-list-item"));
        }

        public int boardsNumber() {
            return counterBoards(By.cssSelector(".mlpxvZU4v4cMQN qUkRGnTnJDff85"));
        }

//        public void boardDeletionPath() {
//            pause(4000);
//            click(By.xpath("//li[@class='mlpxvZU4v4cMQN wVRQcl7CJz79Tr qUkRGnTnJDff85']//a[@class='cZx7p8hAQGLEz5 l7ix_KdG4LuugK']"));
//            pause(3000);
//           // WebElement el = wd.findElement(By.xpath("//li[@class='mlpxvZU4v4cMQN wVRQcl7CJz79Tr qUkRGnTnJDff85']//div[@role='menu']//span[@class='css-snhnyn']"));
//            WebElement el = wd.findElement(By.xpath("//ul[@data-testid='collapsible-list-items']//div[@class='jv7QDCKI8FPToj']//li[@class='mlpxvZU4v4cMQN wVRQcl7CJz79Tr qUkRGnTnJDff85']//span[@data-testid='OverflowMenuHorizontalIcon']"));
//            pause(4000);
//            new Actions(wd).moveToElement(el).clickAndHold().click(el).build().perform();
//            pause(2000);
//            click(By.xpath("//button[@title='Close board']"));
//            pause(2000);
//            click(By.xpath("//button[@title='Close']"));
//            pause(2000);
//            click(By.cssSelector("[class^='Bp80TGmc9hQIdE ']"));
//            pause(2000);
//            click(By.cssSelector("[class^='a72r81xglmtLCW']"));
//
//        }
//
//        public boolean waitForElementPresent(By locator, int timeOut) {
//            return new WebDriverWait(wd, timeOut)
//                    .until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)).size() > 0;
//        }
//
//        public void pressFirstBoardSpot() {
//            click(By.xpath("//ul[@class='boards-page-board-section-list']//li[1]"));
//        }

        public void boardDeletionPath() {
            pause(4000);
           // click(By.xpath("//li[@class='mlpxvZU4v4cMQN wVRQcl7CJz79Tr qUkRGnTnJDff85']//a[@class='cZx7p8hAQGLEz5 l7ix_KdG4LuugK']"));
           // click(By.xpath("//a[normalize-space()='qa19_1687723339634']"));
            //click(By.xpath("//ul[@class='boards-page-board-section-list']//li[1]"));
            pause(3000);
            WebElement el = wd.findElement(By.xpath("//li[@class='mlpxvZU4v4cMQN wVRQcl7CJz79Tr qUkRGnTnJDff85']//div[@role='menu']//span[@class='css-snhnyn']"));
            pause(4000);
            new Actions(wd).moveToElement(el).clickAndHold().click(el).build().perform();
            pause(2000);
            click(By.xpath("//button[@title='Close board']"));
            pause(2000);
            click(By.xpath("//button[@title='Close']"));
            pause(2000);
            click(By.cssSelector("[class^='Bp80TGmc9hQIdE ']"));
            pause(2000);
            click(By.cssSelector("[class^='a72r81xglmtLCW']"));

        }

        public boolean waitForElementPresent(By locator, int timeOut) {
            return new WebDriverWait(wd, timeOut)
                    .until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator)).size() > 0;
        }

        public void pressFirstBoardSpot() {
           // click(By.xpath("//ul[@class='boards-page-board-section-list']//li[1]"));
           //click(By.xpath("//div[@class='boards-page-team-section']//ul[@class='boards-page-board-section-list']//li[1]"));
           click(By.cssSelector(".boards-page-board-section-list .boards-page-board-section-list-item:first-child"));
        }

        public int getBoardsNumber() {
            return counterBoards(By.xpath("//li[@class='mlpxvZU4v4cMQN qUkRGnTnJDff85']"));
        }


        public void boardNameModification(Board board) {

            for (int i = 1; i < numberBoards(); i++) {
                String xp = "//ul[@class='boards-page-board-section-list']//li[" + i + "]";
                click(By.xpath(xp));
                waitForElementPresent(By.cssSelector(".hiRkezEUBG7ve6.uXhW3KBBr1jUsJ"), 10);
                WebElement el = wd.findElement(By.cssSelector(".hiRkezEUBG7ve6.uXhW3KBBr1jUsJ"));
                new Actions(wd).moveToElement(el).click(el).sendKeys(board.getName() + Keys.ENTER).perform();
                String title = wd.findElement(By.cssSelector(".hiRkezEUBG7ve6.uXhW3KBBr1jUsJ")).getText();
                Assert.assertEquals(board.getName(), title);
                click(By.cssSelector(".nNvJhnERHVQb9o"));
                pause(2000);
            }


        }

    }


