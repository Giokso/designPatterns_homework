package StepObjects;

import PageObjects.MainPage;

public class MainPageSteps extends MainPage {
    public MainPageSteps clickOnFormsButton(){
        formsButton.click();
        return this;
    }
}
