package StepObjects;

import PageObjects.FormsPage;

public class FormsPageStep extends FormsPage {
    public FormsPageStep clickOnPracticeForm(){
        practiceFormButton.click();
        return this;

    }
}
