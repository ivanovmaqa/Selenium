package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AdminPage extends BasePage {

    public SelenideElement adminTab = $(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]"));
    public SelenideElement usernameField = $(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
    public SelenideElement searchButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement userRoleButton = $(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]"));
    public SelenideElement userRoleDropDown = $(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
}
