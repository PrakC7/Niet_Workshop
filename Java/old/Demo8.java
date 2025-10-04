 class Demo8{
	public static void main(String a[]){
		String s = "GyaniBhai";
		String s2="Gyani_Bhai_ka_Gyan";
		String e[]=s2.split("_");
		for(int i = 0; i <e.length; i++){
			System.out.println(e[i]);
		}
	}
}