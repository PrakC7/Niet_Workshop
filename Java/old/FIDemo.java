class FIDemo
{
public static void main(String a[])
{
Say s = (int i, int j)-> { 
System.out.println("Hello! How are you?");
return(i+j);
};
int res = s.message(10,7);
System.out.println(res);
}
}