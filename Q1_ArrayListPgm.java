import java.util.ArrayList;
import java.util.Collections;

public class Q1_ArrayListPgm {
  public static void main(String[] args) {
    // create an array list
    ArrayList<String> a1 = new ArrayList<String>();
    System.out.println("The initial size of a1: " + a1.size());
    // add the elements to the array list
    a1.add("W");
    a1.add("E");
    a1.add("L");
    a1.add("C");
    a1.add(2, "ome");
    System.out.println("Size of a1 after additions :" + a1.size());
    // display the array list
    System.out.println("The contents of list :" + a1);
    Collections.sort(a1);
    System.out.println("The contents of list after sorting :" + a1);
    a1.remove("C");
    a1.remove(2);
    System.out.println("Size of arraylist after deletions :" + a1.size());
    System.out.println("The contents of list :" + a1);
  }
}
