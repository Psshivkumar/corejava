package com.xworkz.abstraction.boot;

import com.xworkz.abstraction.app.Browser;
import com.xworkz.abstraction.app.FiveG;
import com.xworkz.abstraction.app.FourG;
import com.xworkz.abstraction.app.Internet;

public class BrowserRunner {

	public static void main(String[] args) {

		Internet internet = new FourG();

		Browser browser = new Browser();
		browser.setInternet(internet);
		browser.connecting();

	}
}
