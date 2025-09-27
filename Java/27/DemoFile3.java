import java.io.*;
class DemoFile3{
	public static void main(String a[]){
		try{
			FileInputStream fis = new FileInputStream("abc.txt");
			BufferedInputStream fis = new BufferedInputStream(fis);
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
