package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest4 {
	public static void main(String[] args) {
		// 크롬 드라이버 생성 후에 변수에 담고
		WebDriver driver = new ChromeDriver();
						
		// 내가 원하는 사이트 열어줘~
		driver.get("https://www.letskorail.com/");
				
		System.out.println(driver.getWindowHandles());
		
		// 메인 창의 이름 저장
		String mainPage = driver.getWindowHandle(); // 제일 첫번째꺼 하나
		
		for (String handle: driver.getWindowHandles()) {
			// 메인페이지와 이름이 다른 경우를 찾아서 걸러내겠다
			if (!handle.equals(mainPage)) {
				// 창을 닫는 액션
				driver.switchTo().window(handle).close();
			}
		}
		driver.switchTo().window(mainPage);
	}
}
