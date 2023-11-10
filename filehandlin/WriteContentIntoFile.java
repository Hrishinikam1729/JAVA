package filehandlin;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteContentIntoFile {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter File Path : ");
		String path = sc.nextLine();
		String opt;
		do {
			System.out.println("Write Content : ");
			String content = sc.next();
			
			
			File file = new File(path);
			byte [] b = content.getBytes();
			
			try {
				FileOutputStream fil = new FileOutputStream(file,true);
				fil.write(b);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
//			try {
//				DataOutputStream fis = new DataOutputStream(new FileOutputStream(file,true));
//				fis.writeUTF(content);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}

			System.out.println("Do you want to write more (y/n): ");
			opt = sc.next();
		} while (opt.equalsIgnoreCase("y"));
	}

}
