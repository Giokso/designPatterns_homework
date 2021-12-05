package StepObjects;

import PageObjects.PracticeFormPage;

import static com.codeborne.selenide.Selenide.$;

public class PracticeFormPageSteps extends PracticeFormPage {
    PracticeFormPage practiceFormPage = new PracticeFormPage();


    public PracticeFormPage fillForm(String name, String lname, String gender, String mobile){
        firstName.sendKeys(name);
        lastName.sendKeys(lname);
        genderLabel.click();
        mobilePhone.sendKeys(mobile);
        submitButton.submit();
        return this;
    }
}
