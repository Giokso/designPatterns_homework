package PageObjects;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class FormsPage {
    public SelenideElement practiceFormButton = $(By.xpath("//span[text()='Practice Form']"));
}
