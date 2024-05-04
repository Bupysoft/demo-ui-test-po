package com.example.dmuitestnewproject;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPage {
    public SelenideElement loginForm = $x("//*[@data-component=\"LogInForm\"]");
    public SelenideElement emailLoginField = $x("//*[@data-name=\"emailLoginForm\"]");
    public SelenideElement loginNextButton = $x("//*[@data-name=\"loginNextButton\"]");
    public SelenideElement emailValidationError = $x("//*[@data-name=\"emailValidationError\"]");
    public SelenideElement forgotPasswordLink = $x("//*[@data-name=\"forgotPasswordLink\"]");
    public SelenideElement forgotPasswordForm = $x("//*[@data-component=\"ForgotPassword\"]");

    public void isElementVisible(SelenideElement element) {
        element.shouldBe(Condition.visible);
    }

    public void isElementHidden(SelenideElement element) {
        element.shouldBe(Condition.hidden);
    }

    public void isElementDisabled(SelenideElement element) {
        element.shouldBe(Condition.disabled);
    }

    public void isElementClickable(SelenideElement element) {
        element.shouldBe(Condition.clickable);
    }

    public void isElementEditable(SelenideElement element) {
        element.shouldBe(Condition.editable);
    }

    public void click(SelenideElement element) {
        element.click();
    }

    public void setString(SelenideElement element, String str) {
        element.setValue(str);
    }
}
