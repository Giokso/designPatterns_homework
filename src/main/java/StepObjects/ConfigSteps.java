package StepObjects;


import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;

public class ConfigSteps {
    public ConfigSteps config(){
        Configuration.timeout = 10000;
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.startMaximized =true;
        return this;
    }
}
