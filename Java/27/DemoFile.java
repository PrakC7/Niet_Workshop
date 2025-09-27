import java.io.*;
class DemoFile{
	public static void main(String a[]){
		try{
			FileOutputStream fos = new FileOutputStream("abc.txt");
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
