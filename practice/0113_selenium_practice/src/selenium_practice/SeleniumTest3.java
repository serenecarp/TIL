package selenium_practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest3 {
	public static void main(String[] args) {
		// 크롬 드라이버 생성 후에 변수에 담고
		WebDriver driver = new ChromeDriver();
				
		// 내가 원하는 사이트 열어줘~
		driver.get("https://finance.naver.com/news/");
		
		List<WebElement> news = driver.findElements(By.cssSelector("#newsMainTop > div > div.inner_area_left > div > div.main_news > ul > li > a"));
		
		// 멤버스 연산자
		for (WebElement n : news) {
			System.out.println(n.getText());
		}
	}
}
