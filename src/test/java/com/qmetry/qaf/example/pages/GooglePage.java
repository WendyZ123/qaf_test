package com.qmetry.qaf.example.pages;

import com.qmetry.qaf.automation.ui.annotations.FindBy;
import com.qmetry.qaf.automation.ui.webdriver.QAFExtendedWebElement;
import com.qmetry.qaf.example.components.InputText;

public class GooglePage extends CommonPage {

    @FindBy(locator = "id=logo")
    private QAFExtendedWebElement logo;

    @FindBy(locator = "className=gLFyf")
//    @FindBy(locator = "css=.gLFyf")
    private InputText input;
//    private QAFExtendedWebElement input;

    public void search(String words) {
        input.typeIn(words);
    }

    @Override
    public void waitForPageToLoad() {
        logo.isPresent();
    }
}
