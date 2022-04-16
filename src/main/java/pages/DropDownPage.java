package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    private final WebDriver driver;
    private final By dropDown = By.id("dropdown");

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOption(){
        List<WebElement> allOptions = findDropDownElement().getAllSelectedOptions();
        return allOptions.stream().map(WebElement::getText).collect(Collectors.toList());
    }

    public Select findDropDownElement(){
        return new Select(driver.findElement(dropDown));
    }
}
