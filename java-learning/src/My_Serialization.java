import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class My_Serialization implements Serializable {
	int num ;
	String string;
	public My_Serialization(int num,String string) {
		
		// TODO Auto-generated constructor stub
		this.string=string;
		this.num=num;
	}
	
	public static void main(String[] args) {
		
		My_Serialization obj1 = new My_Serialization(10,"hello");
		File file = new File("src/serialization.txt");
		try {
			
			FileOutputStream output = new FileOutputStream(file);
			ObjectOutputStream out_object = new ObjectOutputStream(output);
			out_object.writeObject(obj1);
			out_object.close();
			output.close();
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		obj1= null;
		
		try {
			FileInputStream inputStream = new FileInputStream(file);
			ObjectInputStream in_object = new ObjectInputStream(inputStream);
			obj1 = (My_Serialization)in_object.readObject();
			System.out.println(obj1.num+" "+obj1.string);
			inputStream.close();
			in_object.close();
		}
		catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
