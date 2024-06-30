public class Q2_Constructors {
  public static void main(String[] args) {
    // Default Constructor
    String s1 = new String();
    System.out.println(s1 + "Default constructor");
    // Parameterised Constructor by passing strings
    String s2 = new String("Hello Java");
    System.out.println(s2);
    // String object using character arrays
    char chars[] = { 's', 'c', 'i', 'e', 'n', 'c', 'e' };
    String s3 = new String(chars);
    System.out.println(s3);
    // constructor with substring
    char chs[] = { 'w', 'i', 'n', 'd', 'o', 'w', 's' };
    String s4 = new String(chs, 0, 4);
    System.out.println(s4);
    // Copy constructor
    char ch[] = { 'F', 'A', 'N' };
    String s5 = new String(ch);
    String s6 = new String(s5);
    System.out.println(s5);
    System.out.println(s6);
    // Example for String(byte byteArr[ ])
    byte b[] = { 97, 98, 99, 100 }; // Range of bytes: -128 to 127
    // . These byte values will be converted into corresponding//characters.
    String s7 = new String(b);
    System.out.println(s7);

    // Example for String(byte byteArr[ ], int startIndex, int count)
    byte b1[] = { 65, 66, 67, 68, 69, 70 };
    String s8 = new String(b1, 2, 4);
    System.out.println(s8);
  }
}
