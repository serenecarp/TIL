package selenium_practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
	public static void main(String[] args) {
		// 크롬 드라이버 가져왔다!
		
		// 크롬 드라이버 생성 후에 변수에 담고
		WebDriver driver = new ChromeDriver();
		
		// 내가 원하는 사이트 열어줘~
		driver.get("https://www.naver.com");
	}
}
