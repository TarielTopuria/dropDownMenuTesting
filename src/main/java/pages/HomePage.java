package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private final WebDriver driver;

    private final By dropDown = By.linkText("Dropdown");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public DropDownPage selectOptionOne(){
        driver.findElement(dropDown).click();
        return new DropDownPage(driver);
    }
}
