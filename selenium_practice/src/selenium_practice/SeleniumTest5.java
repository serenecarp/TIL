package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumTest5 {
	public static void main(String[] args) {
		// 크롬 드라이버 생성 후에 변수에 담고
		WebDriver driver = new ChromeDriver();

		// 내가 원하는 사이트 열어줘~
		driver.get("https://etk.srail.kr/main.do");

		// 출발역
		Select departure = new Select(driver.findElement(By.name("dptRsStnCd")));
		departure.selectByVisibleText("수서"); // 눈에 보이는 값
		
		// 도착역
		Select arrival = new Select(driver.findElement(By.name("arvRsStnCd")));
		arrival.selectByValue("0020");
		
		driver.findElement(By.cssSelector("#search-form > fieldset > a")).click();
	}
}
