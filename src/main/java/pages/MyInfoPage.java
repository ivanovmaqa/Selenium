package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MyInfoPage extends BasePage {
    public SelenideElement myInfoTab = $(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[6]"));
    public SelenideElement personalDetailsTab = $(By.xpath("(//div[@class='orangehrm-tabs-wrapper'])[1]"));
    public SelenideElement firstNameField = $(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-firstname']"));
    public SelenideElement middleNameField = $(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-middlename']"));
    public SelenideElement lastNameField = $(By.xpath("//input[@class='oxd-input oxd-input--active orangehrm-lastname']"));
    public SelenideElement birthdayField = $(By.xpath("(//input[@class='oxd-input oxd-input--active'])[6]"));
    public SelenideElement genderRadioButton = $(By.xpath("(//span[@class='oxd-radio-input oxd-radio-input--active --label-right oxd-radio-input'])[2]"));
    public SelenideElement saveButton = $(By.xpath("(//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space'])[1]"));
}
