package com.qmetry.qaf.example.steps;

import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.example.pages.GooglePage;
import org.openqa.selenium.Keys;

import static com.qmetry.qaf.automation.step.CommonStep.sendKeys;

public class StepsLibrary {
	/**
	 * @param searchTerm
	 *            : search term to be searched
	 */
	@QAFTestStep(description = "search for {0}")
	public static void searchFor(String searchTerm) {
		sendKeys(searchTerm+Keys.ENTER, "input.search");
	}

	@QAFTestStep(description = "lands on google page")
	public static void landsOnGooglePage() {
		new GooglePage().waitForPageToLoad();
	}

	@QAFTestStep(description = "type in search words {0}")
	public static void typeInSearchWords(String words) {
		new GooglePage().search(words);
	}
}
