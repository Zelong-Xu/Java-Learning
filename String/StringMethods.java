package String;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "world";
        String str3 = "HELLO";
        String str4 = "hello world";

        System.out.println("Length of str1: " + str1.length());

        String concatenatedString = str1.concat(" ").concat(str2);
        System.out.println("Concatenated string: " + concatenatedString);

        int index = str4.indexOf("world");
        System.out.println("Index of 'world' in str4: " + index);

        char charAtIndex = str1.charAt(1);
        System.out.println("Character at index 1 in str1: " + charAtIndex);

        boolean equalsResult = str1.equals(str3);
        boolean equalsIgnoreCaseResult = str1.equalsIgnoreCase(str3);
        System.out.println("str1 equals str3: " + equalsResult);
        System.out.println("str1 equalsIgnoreCase str3: " + equalsIgnoreCaseResult);

        String substring = str4.substring(6);
        System.out.println("Substring of str4 from index 6: " + substring);
        String substringWithEndIndex = str4.substring(0, 5);
        System.out.println("Substring of str4 from index 0 to 5: " + substringWithEndIndex);

        String upperCaseString = str2.toUpperCase();
        System.out.println("str2 in uppercase: " + upperCaseString);
        String lowerCaseString = str3.toLowerCase();
        System.out.println("str3 in lowercase: " + lowerCaseString);
    }

    
}
