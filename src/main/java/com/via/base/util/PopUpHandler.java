package com.via.base.util;


public class PopUpHandler extends SeleniumBase {
	public void accept() {
		javaScriptAccept(driver);
	}

	public void dismiss() {
		javaScriptDismiss(driver);
	}
}