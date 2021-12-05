package PageObjects;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PracticeFormPage {

    public SelenideElement firstName = $("#firstName");
    public SelenideElement lastName = $("#lastName");
    public SelenideElement genderLabel = $("input[value='Male'] ~ label");
    public SelenideElement mobilePhone = $("#userNumber");
    public SelenideElement submitButton = $("#submit");
}
