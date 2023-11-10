package filehandlin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class obj_input_output {

    public static void main(String[] args) {

        Employee1[] gh = {new Employee1("Hrishi", "hr", "2000/12/12"),
                new Employee1("kaustubh", "ceo", "2000/12/14"),
        };

//        try {
//            ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("C:/New folder/jay.csv"));
//            for (int i = 0; i < gh.length; i++) {
//                obj.writeObject(gh[i]);
//            }
//            obj.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        
        
        try {
        	ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("C:\\New folder\\ass.txt"));
        	for(int i = 0; i<gh.length;i++) {
        		 Employee1 eobj= (Employee1)obj1.readObject();
        		 System.out.println(eobj.toString());
        		
        	}
        	obj1.close();
        }catch(IOException e) {
        	e.printStackTrace();
        } catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

    }
}

//try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\New folder\\jay.txt"));){
//	for(Employee1 e:gh) {
//		oos.writeObject(e);
//	}
//}
//catch(IOException e) {
//	System.out.println(e.getMessage());
//	e.printStackTrace();
//}
