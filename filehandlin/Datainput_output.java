package filehandlin;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Datainput_output {
	
	public static void main(String[] args) {
		
		try (DataInputStream dif = new DataInputStream(new FileInputStream("C:\\New folder\\tejas.csv"));
				DataOutputStream dof =  new DataOutputStream(new FileOutputStream("C:\\New folder\\Hrishi.csv",true));){
		       String s = dif.readLine();
		       String[] s1 =s.split(",");
		       Employee1 e = new Employee1(s1[0],s1[1],s1[2]);
		       System.out.println(e);
		       Employee1 e1 = new Employee1("Hrishi","Cleaning","2000/12/14");
		       String s2 = e1.toString();
		       dof.writeUTF(s2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
