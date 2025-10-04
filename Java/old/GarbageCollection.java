public class GarbageCollection{
public void finalize(){
System.out.println("Object is garbage collected");
}
public static void main(String a[]){
GarbageCollection s1=new GarbageCollection();
GarbageCollection s2=new GarbageCollection();
s1=null;
s2=null;
System.gc();
}
}