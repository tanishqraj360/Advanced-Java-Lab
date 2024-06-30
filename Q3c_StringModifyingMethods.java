import java.util.Arrays;

public class Q3c_StringModifyingMethods {
  public static void main(String[] args) {
    String str = "   Hello, World!   ";

    // substring() method
    String substr1 = str.substring(7);
    String substr2 = str.substring(1, 5);
    System.out.println("Substring from index 7: '" + substr1 + "'");
    System.out.println("Substring from index 1 to 5: '" + substr2 + "'");

    // concat() method
    String str1 = "Hello";
    String str2 = "World";
    String result = str1.concat(", ").concat(str2).concat("!");
    System.out.println("Concatenated string: " + result);

    // replace() method
    String result1 = str.replace('o', '0');
    String result2 = str.replace("World", "Java");
    System.out.println("Replaced 'o' with '0': " + result1);
    System.out.println("Replaced 'World' with 'Java': " + result2);

    // replaceAll() method
    String str3 = "Hello123World";
    String result3 = str3.replaceAll("[0-9]", "#");
    System.out.println("Replaced all digits with '#': " + result3);

    // replaceFirst() method
    String str4 = "Hello123World123";
    String result4 = str4.replaceFirst("[0-9]", "#");
    System.out.println("Replaced first digit with '#': " + result4);

    // toUpperCase() method
    String upperCaseResult = str.toUpperCase();
    System.out.println("Uppercase string: " + upperCaseResult);

    // toLowerCase() method
    String lowerCaseResult = str.toLowerCase();
    System.out.println("Lowercase string: " + lowerCaseResult);

    // trim() method
    String trimmedResult = str.trim();
    System.out.println("Trimmed string: '" + trimmedResult + "'");

    // split() method
    String str5 = "apple,banana,cherry";
    String[] result5 = str5.split(",");
    System.out.println("Split string: " + Arrays.toString(result5));
  }
}
