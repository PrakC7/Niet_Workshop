import java.io.*;
class ObjectDemo{
	public static void main(String a[]){
		try{
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("first.txt"));
			oos.writeObject(new Customer());
			oos.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
