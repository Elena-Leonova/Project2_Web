package applications;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import javax.jws.soap.SOAPBinding;

public class UserHelper extends HelperBase {
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {
        click(By.xpath("//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr']"));
    }

    public void fillLoginForm(User user) {
       type(By.xpath("//input[@id='user']"), user.getEmail());
       click(By.xpath("//input[@id='login']"));
       pause(3000);
       type(By.xpath("//input[@id='password']"), user.getPassword());
    }

    public void submitLogin() {
        click(By.xpath("//span[text()='Log in']"));
    }

    public void fillEmailField(User user) {
        type(By.xpath("//input[@id='user']"), user.getEmail());
        click(By.xpath("//input[@id='login']"));
        click(By.xpath("//input[@id='login']"));
    }

    public void openAccountform() {
        click(By.xpath("//span[@class='DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez']"));

    }

    public void submitLogOut() {
        click(By.xpath("//span[normalize-space()='Log out']"));
    }

    public void pressOkButton() {
        click(By.xpath("//span[contains(text(),'Log out')]"));
    }
}
