package PageObjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ResultPage {
    public SelenideElement firstNameLastName = $x("//td[text()=\"Student Name\"]/following-sibling::td");
    public SelenideElement gender = $x("//td[text()=\"Gender\"]/following-sibling::td");
    public SelenideElement mobileNUmber = $x("//td[text()=\"Mobile\"]/following-sibling::td");
}
