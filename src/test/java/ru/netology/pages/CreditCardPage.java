package ru.netology.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import ru.netology.data.DataHelper;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CreditCardPage {
    private SelenideElement formPayment = $(byText("Купить"));
    private SelenideElement cardNumberField = $("[placeholder='0000 0000 0000 0000']");
    private SelenideElement monthField = $("[placeholder='08']");
    private SelenideElement yearField = $("[placeholder='22']");
    private SelenideElement ownerField = $(By.xpath("//span[text()='Владелец']/..//input"));
    private SelenideElement cvcField = $("[placeholder='999']");
    private SelenideElement continueButton = $(byText("Продолжить"));

    public CreditCardPage() {
        formPayment.shouldBe(Condition.visible);
    }

    public void fillingCreditCardPaymentForm(DataHelper.CardInfo cardInfo) {
        cardNumberField.setValue(cardInfo.getCardNumber());
        monthField.setValue(cardInfo.getMonth());
        yearField.setValue(cardInfo.getYear());
        ownerField.setValue(cardInfo.getName());
        cvcField.setValue(cardInfo.getCvc());
        continueButton.click();
    }

    private SelenideElement successNotification = $(byText("Успешно"));
    private SelenideElement errorNotification = $(byText("Ошибка"));
    private SelenideElement formatError = $(byText("Неверный формат"));
    private SelenideElement ownerRequiredField = $(byText("Поле обязательно для заполнения"));
    private SelenideElement expiredLastMonthField = $(byText("Неверно указан срок действия карты"));
    private SelenideElement expiredLastYearField = $(byText("Истёк срок действия карты"));

    public void successfulPayment() {
        successNotification.shouldBe(visible, Duration.ofSeconds(15));
    }

    public void errorPayment() {
        errorNotification.shouldBe(visible, Duration.ofSeconds(15));
    }

    public void requiredField() {
        ownerRequiredField.shouldBe(visible);
    }

    public void invalidFormatField() {
        formatError.shouldBe(visible);
    }

    public void expiredLastMonth() {
        expiredLastMonthField.shouldBe(visible);
    }

    public void expiredLastYear() {
        expiredLastYearField.shouldBe(visible);
    }
}