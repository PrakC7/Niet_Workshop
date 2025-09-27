import java.io.*;
class DemoFile4{
	public static void main(String a[]){
		try{
			FileOutputStream fos = new FileOutputStream("abc.txt");
			BufferedOutputStream fos = new BufferedOutputStream(fos);
			String s = "I am Niet College";
		
			for(int i = 0; i < s.length(); i++){
				fos.write(s.charAt(i));	
			}
		fos.close();
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
}
