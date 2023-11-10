package filehandlin;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_input_output {
	public static void main(String[] args) {
		File file = new File("C:\\New folder","Hrishi.txt");
		File outfile = new File("C:\\New folder","Kaustubh.txt");

		int i = 0;
		try (FileInputStream filein = new FileInputStream(file);
				FileOutputStream fileout = new FileOutputStream(outfile);) {

			try {
				i = filein.read();
			} catch (IOException e) {
				e.printStackTrace();
			}

			while (i != -1) {
				try {
					System.out.println((char)i);
					fileout.write(i);
					i = filein.read();
				} catch (IOException e) {
					e.printStackTrace();
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
