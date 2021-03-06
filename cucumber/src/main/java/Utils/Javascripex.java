package Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import baseLayer.baseclass;

public class Javascripex extends  baseclass {
	public static JavascriptExecutor js;

	public static void ClickonElementUsingJS(WebElement wb) {

		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", wb );
	}

	public static void alertpopJS () {
		js=(JavascriptExecutor)driver;

		js.executeScript("alert('User is sucessfully login to home page');");
	}
	public static void  refreshBrowserJS() {

		js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
	}


	public static void gettitleJS()
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("return document.title;").toString();
	}

	public static void scrolltopageJS(WebElement wb)
	{
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",wb);

	}


	public static void openurlJS() {

		js=(JavascriptExecutor)driver;

		js.executeScript("window.open('https://www.facebook.com')");

	}
	public static void HighlightElement(WebElement wb)
	{

		js=(JavascriptExecutor)driver;

		js.executeScript("arguments[0].style.border='3px dotted red'",wb);
	}

}
