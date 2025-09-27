import java.io.*;
import java.io.FileWriter;
class FileWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriterDemo fr = new FileWriter("one.txt");
			fr.write("This is Niet College - The worst choice.");
            fr.close();
        } 
		catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
