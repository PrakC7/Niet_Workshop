import java.io.*;

class ObjectDemo2 {
    public static void main(String[] args) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("first.txt"));
            Customer c = (Customer) ois.readObject();  
            ois.close();

            
            System.out.println("Username: "+c.userid);
			System.out.println("Password: "+c.pwd);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}
