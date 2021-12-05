package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
public class MainPage {
    public SelenideElement formsButton = $(By.xpath("//*[text()='Forms']"));
}
