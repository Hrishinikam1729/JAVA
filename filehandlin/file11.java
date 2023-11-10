package filehandlin;

import java.io.File;
import java.io.IOException;

public class file11 {

	public static void main(String[] args) {

		File file = new File("C:\\New folder", "tejas.txt");

		try {
			if (file.exists()) {
				System.out.println("File already exists!!");
			} else {
				file.createNewFile();
				System.out.println("File is created");
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		File file1 = new File("C:\\New folder");
		File[] fil = file1.listFiles();
		for (File f : fil) {

			if (f.isFile()) {
				System.out.println("File: " + f.getName());
			} else if (f.isDirectory()) {
				System.out.println("Directory: " + f.getName());
			} else {
				System.out.println(f.getName());
			}

		}

	}

}
