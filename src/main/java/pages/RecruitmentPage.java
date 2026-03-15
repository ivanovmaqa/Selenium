package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class RecruitmentPage extends BasePage {

    public SelenideElement recruitmentTab = $(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[5]"));
    public SelenideElement searchButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement methodOfApplicationRoleButton = $(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[5]"));
    public SelenideElement methodOfApplicationDropDown = $(By.xpath("//div[@class='oxd-select-dropdown --positon-bottom']"));
    public SelenideElement selectedMethod = $(By.xpath("(//div[@class='oxd-select-text-input'])[5]"));
    public SelenideElement searchResult = $(By.xpath("//span[@class='oxd-text oxd-text--span']"));
    public SelenideElement candidateNameField = $(By.xpath("//input[@placeholder='Type for hints...']"));
    public SelenideElement errorMessage = $(By.xpath("//span[@class='oxd-text oxd-text--span oxd-input-field-error-message oxd-input-group__message']"));
    public SelenideElement dateOfApplicationRoleButtonFrom = $(By.xpath("(//div[@class='oxd-date-input'])[1]"));
    public SelenideElement dateOfApplicationBackButton = $(By.xpath("(//button[@class='oxd-icon-button'])[3]"));
    public SelenideElement dayOfApplicationDropDown = $(By.xpath("//div[@class='oxd-calendar-dates-grid']"));
    public SelenideElement dateOfApplicationRoleButtonTo = $(By.xpath("(//div[@class='oxd-date-input'])[2]"));
    public SelenideElement dateOfApplicationForwardButton = $(By.xpath("(//button[@class='oxd-icon-button'])[4]"));
    public SelenideElement dateOfApplicationTodayButton = $(By.xpath("//div[@class='oxd-date-input-link --today']"));
}
