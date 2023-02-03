package test05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class Test1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("data/refrigerator.json")));
		String str = null; // 한 줄씩 읽어오기 위해서....
		StringBuilder sb = new StringBuilder(); // 한 줄 한 줄 읽어온 것들을 여러 줄의 문자열로 이어 붙이기 위해서
		while((str = br.readLine()) != null){
			sb.append(str).append("\n");
			
		}
		// while문을 빠져나오면 refrigerator.json 파일의 문자열이 sb에 저장됨
		
		Gson gson = new Gson();
		Refrigerator[] arr = gson.fromJson(sb.toString(), Refrigerator[].class);
		List<Refrigerator> list = Arrays.asList(arr);
		System.out.println(list);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("data/refrigerator-copy.json")));
		String str2 = gson.toJson(list);
		bw.write(str2);
		bw.close();
	}
}
