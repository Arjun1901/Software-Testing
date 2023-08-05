package org.stepdefinition;

import org.base.BaseClass;
import org.junit.After;
import org.junit.Before;

public class HookClass extends BaseClass{
	
	@Before
	private void precondition() {
		launchBrowser();
        windowsMaximize();  
	}
	
	@After
	private void postcondition() {
		closeEntireBrowser();

	}

}
