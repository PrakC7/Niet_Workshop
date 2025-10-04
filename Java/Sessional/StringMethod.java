public class StringMethod {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World!";

        String combined = s1.concat(" ").concat(s2);
        System.out.println("Concatenated String: " + combined);

        int len = combined.length();
        System.out.println("Length of Combined String: " + len);

        String part = combined.substring(0, 5);
        System.out.println("Substring (0 to 5): " + part);

        String s3 = "Hello World!";
        boolean isEqual = combined.equals(s3);
        System.out.println("Strings are equal: " + isEqual);

	boolean hasWord = combined.contains("World");
	System.out.println("Does combined contain 'World'? "+hasWord);
    }
}
