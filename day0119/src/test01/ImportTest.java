package test01;

//import java.util.Arrays;
//import java.util.Date;
//import java.util.Scanner;
import java.util.*;
import java.util.logging.*;
// 하위 패키지에 있는 클래스까지 임포트되는 것은 아니다
// 하위 패키지라고 해도 엄연히 다른 패키지이다!

public class ImportTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date d = new Date();
		int[] arr = {1, 2, 3, 4, 5};
		Arrays.toString(arr);
		
		// java.util.logging.Logger
		Logger l = Logger.getGlobal();
	}
}
