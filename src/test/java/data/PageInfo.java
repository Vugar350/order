package data;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class PageInfo {
    private final String currentUrl = "http://localhost:9999/";
    private SelenideElement name=$("[name='name']");
    private SelenideElement data=$("[data-test-id=\"date\"]");
    private SelenideElement city=$("[data-test-id=\"city\"]");
    private SelenideElement phone=$("[name='phone']");
    private SelenideElement checkbox=$("[data-test-id=\"agreement\"]");
    private SelenideElement button=$("[class='button__text']");
    private SelenideElement successMessage=$("[data-test-id=notification] .notification__content");
    private SelenideElement replanMessage=$("[data-test-id=notification] .replan-notification");
    private SelenideElement replanButton=$("[data-test-id=notification] .button__text");
    private SelenideElement closeButton = $("[data-test-id='success-notification'] button");

    public void succesOrder() {

    }



}
