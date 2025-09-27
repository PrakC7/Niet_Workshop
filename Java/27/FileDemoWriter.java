import java.io.*;
import java.io.FileWriter;
class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fr = new FileWriter("one.txt");
			fr.write("This is Niet College - The worst choice.");
            fr.close();
        } 
		catch (Exception e) {
            System.out.println(e);
        }
    }
}
