import java.io.*;
import java.io.FileWriter;
class BufferedWriterDemo {
    public static void main(String[] args) {
        try {
            FileWriter fr = new FileWriter("one.txt");
			BufferedWriter br = new BufferedWriter(fr);
			br.write("This is Niet College - The worst choice.");
            br.close();
        } 
		catch (Exception e) {
            System.out.println(e);
        }
    }
}
