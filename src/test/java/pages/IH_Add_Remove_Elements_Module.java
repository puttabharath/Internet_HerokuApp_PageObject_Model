package pages;

import locators.IH_Add_Remove_Elements_Loc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class IH_Add_Remove_Elements_Module {

    WebDriver driver;

    // constructor to accept WebDriver instance
    public IH_Add_Remove_Elements_Module(WebDriver driver)
    {
        this.driver = driver;
    }
    public void IHAddRemoveElements() {
        WebElement AddRemoveLink = driver.findElement(By.xpath(IH_Add_Remove_Elements_Loc.Add_Remove_Link));
        AddRemoveLink.click();
        WebElement Addbutton = driver.findElement(By.xpath(IH_Add_Remove_Elements_Loc.AddElementButton));
        for (int i=0;i<=67;i++){
            Addbutton.click();
        }

        List<WebElement> DeleteButtons = driver.findElements(By.xpath("//button[@class='added-manually']"));
        for (WebElement DeleteButton:
             DeleteButtons) {
            DeleteButton.click();
        }









    }

}
