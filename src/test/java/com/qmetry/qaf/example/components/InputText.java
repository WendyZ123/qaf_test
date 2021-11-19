package com.qmetry.qaf.example.components;

import com.qmetry.qaf.automation.ui.webdriver.QAFWebComponent;

public class InputText extends QAFWebComponent {
    public InputText(String locator) {
        super(locator);
    }

    public void typeIn(String text) {
        this.sendKeys(text);
    }


}
