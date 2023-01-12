package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
// . <- ~안에
// * <- 전부 다!
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest2 {
	public static void main (String[] args) {
		// 크롬 드라이버 생성 후에 변수에 담고
		WebDriver driver = new ChromeDriver();
		
		// 내가 원하는 사이트 열어줘~
		driver.get("https://www.naver.com");
		
		// 증권 버튼 선택자를 가져와 줘!
		WebElement financeBtn = driver.findElement(By.cssSelector("#NM_FAVORITE > div.group_nav > ul.list_nav.NM_FAVORITE_LIST > li:nth-child(3) > a"));
		
		// 증권 버튼 클릭!
		financeBtn.click();
		
		// 삼성전자 검색해보기
		// 1. 검색창 선택해보기
		// 검색창 선택자를 가져와줘~
		WebElement searchInput = driver.findElement(By.cssSelector("#stock_items"));
		
		// 2. 삼성전자 키워드를 입력하기(넣어주기)
		searchInput.sendKeys("삼성전자");
		
		// 3. 검색창 엔터 누르기
		searchInput.sendKeys(Keys.ENTER);
		
		// ctrl + shift + o -> 자동 import
	}
}
