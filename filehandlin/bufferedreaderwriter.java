package filehandlin;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedreaderwriter {

	public static void main(String[] args) {

		try {
			BufferedReader bf = new BufferedReader(new FileReader("C:\\New folder\\ayush.txt"));
			BufferedWriter bfw = new BufferedWriter(new FileWriter("C:\\New folder\\gupta.txt",true));
			String s = bf.readLine();
			while (s != null) {
				System.out.println(s);
				bfw.write(s);
				bfw.newLine();
				s = bf.readLine();
			}
			bfw.close();
			bf.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}