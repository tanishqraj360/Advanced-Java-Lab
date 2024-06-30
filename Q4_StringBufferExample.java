public class Q4_StringBufferExample {
  public static void main(String[] args) {
    // Creating a StringBuffer object
    StringBuffer sb = new StringBuffer("Hello");
    // Append method
    sb.append(" World");
    System.out.println("After append: " + sb);
    // Insert method
    sb.insert(5, " Java");
    System.out.println("After insert: " + sb);
    // Replace method
    sb.replace(6, 10, "Program");
    System.out.println("After replace: " + sb);
    // Delete method
    sb.delete(5, 11);
    System.out.println("After delete: " + sb);
    // Reverse method
    sb.reverse();
    System.out.println("After reverse: " + sb);
    // Capacity method
    System.out.println("Capacity of StringBuffer: " + sb.capacity());
    // Length method
    System.out.println("Length of StringBuffer: " + sb.length());
    // EnsureCapacity method
    sb.ensureCapacity(30);
    System.out.println("Ensured Capacity: " + sb.capacity());
    // SetLength method
    sb.setLength(5);
    System.out.println("After setLength: " + sb);
  }
}
