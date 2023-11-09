package fileHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
public class fileHandling1 {
public static void main(String[] args) {
	FileInputStream fin = null;
	FileOutputStream fou =null;
	try{
		fin = new FileInputStream("testfile.txt");
		fou = new FileOutputStream("textcopy.txt");
		int x = fin.read();

		while(x!=-1)
		{
			System.out.println(x);
			fou.write(x);
			x = fin.read(); 
		}
		
	}
	catch(FileNotFoundException e)
	{
		System.out.println("byye");
		System.out.println(e.getMessage());
	}
		catch(IOException e)
	{
			System.out.println("GT");
		System.out.println(e.getMessage());
	}
		try {
			fin.close();
		}catch (NullPointerException e) {
			System.out.println("sharukh");
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} 
		catch (Exception e) {
			System.out.println("sharukh");
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
		try {
            fou.close();
		} catch (NullPointerException e) {
			System.out.println("ma'am");
			// TODO Auto-generated catch block
//			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
		}
	
	
}
}
