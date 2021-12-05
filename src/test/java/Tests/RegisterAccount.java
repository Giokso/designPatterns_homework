package Tests;


import StepObjects.*;
import org.testng.annotations.Test;
import DataObjects.practiceFormData;

import static com.codeborne.selenide.Selenide.open;

public class RegisterAccount {
    ConfigSteps configSteps;
    MainPageSteps mainPageSteps;
    FormsPageStep formsPageStep;
    PracticeFormPageSteps practiceFormPageSteps;
    ResultPageSteps resultPageSteps;
    public RegisterAccount(){
        configSteps = new ConfigSteps();
        mainPageSteps = new MainPageSteps();
        formsPageStep = new FormsPageStep();
        practiceFormPageSteps = new PracticeFormPageSteps();
        resultPageSteps = new ResultPageSteps();
    }

    @Test(dataProvider = "provider",dataProviderClass = practiceFormData.class)
    public void registerAccount(String name, String lname, String gender, String mobile) throws InterruptedException {
        configSteps.config();
        open("");
        mainPageSteps.clickOnFormsButton();

        formsPageStep.clickOnPracticeForm();

        practiceFormPageSteps.fillForm(name,lname,gender,mobile);
        resultPageSteps.checkInfo(name,lname,gender,mobile);
       // mainPageSteps.clickOnFormsButton();

    }
}
