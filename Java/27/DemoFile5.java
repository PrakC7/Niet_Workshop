import java.io.*;
class DemoFile5{
	public static void main(String a[]){
		try{
			FileInputStream fis1 = new FileInputStream("abc.txt");
			FileInputStream fis2 = new FileInputStream("abc1.txt");
			SequenceInputStream sis = new SequenceInputStream(fis1,fis2);
			int i;
		
			while((i = sis.read()) != -1){
				System.out.print((char)i);
			}
		ois.close();
		}
		
		catch(IOException e){
			System.out.println(e);
		}
	}
}
