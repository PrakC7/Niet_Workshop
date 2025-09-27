import java.io.*;
class DemoFile2{
	public static void main(String a[]){
		try{
			FileInputStream fis = new FileInputStream("abc.txt");
			int i;
		
			while((i = fis.read()) != -1){
				System.out.print((char)i);
			}
		fis.close();
		}
		
		catch(IOException e){
			System.out.println(e);
		}
	}
}
