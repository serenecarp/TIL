package test06_object_serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test1 {
	public static void main(String[] args) {
		ObjectInputStream in = null;
		ObjectOutputStream out = null;
		
		try {
			out = new ObjectOutputStream(new FileOutputStream(new File("object.dat")));
			out.writeObject(new Person("홍승길", 20));
			System.out.println("객체를 파일에 출력했습니다.");
			
			in = new ObjectInputStream(new FileInputStream(new File("object.dat")));
			Object obj = in.readObject();
			Person p = (Person) obj;
			System.out.println(p);
		} catch(Exception e){
			System.out.println("try 블록의 예외를 처리했어요.");
			e.printStackTrace();
		} finally {
			try {
			if(out != null)
				out.close();
			if(in != null)
				in.close();
			} catch (Exception e) {
				System.out.println("중첩 try -catch문을 사용해서 예외를 처리했어요.");
			}
		}
	}
}
