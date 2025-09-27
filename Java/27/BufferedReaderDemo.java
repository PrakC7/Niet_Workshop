import java.io.*;
import java.io.FileWriter;
class BufferedReaderDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("one.txt");
			BufferedReader br = new BufferedReader(fr);
			String i;
            while((i=br.readLine()) != null)
			System.out.print(i);
			br.close();
        } 
		catch (Exception e) {
            System.out.println(e);
        }
    }
}
