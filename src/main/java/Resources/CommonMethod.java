package Resources;

import java.util.List;

import org.openqa.selenium.WebElement;

public class CommonMethod {
	public static void ForEachLoop(List<WebElement> Elements, String GetText) {
		for (WebElement m : Elements) {
			if (m.getText().equalsIgnoreCase(GetText)) {
				m.click();
				break;
			}
		}
	}

}
