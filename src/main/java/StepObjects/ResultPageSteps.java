package StepObjects;

import PageObjects.ResultPage;
import com.codeborne.selenide.Condition;

public class ResultPageSteps extends ResultPage {
    public ResultPageSteps checkInfo(String name, String lname, String genderText, String mobile){

        firstNameLastName.shouldHave(Condition.text(name+" "+lname));
        gender.shouldHave(Condition.text(genderText));
        mobileNUmber.shouldHave(Condition.text(mobile));
        return this;
    }
}
