import java.io.*;
import java.io.FileWriter;
class FileReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("one.txt");
			int i;
            while((i=fr.read()) != -1)
			System.out.print((char)i);
			fr.close();
        } 
		catch (Exception e) {
            System.out.println(e);
        }
    }
}
