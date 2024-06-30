class Teststringcomparison1 {
  public static void main(String args[]) {
    String s1 = "Sachin";
    String s2 = "Sachin";
    String s3 = new String("Sachin");
    String s4 = "Saurav";
    System.out.println(s1.equals(s2));// true
    System.out.println(s1.equals(s3));// true
    System.out.println(s1.equals(s4));// false
    System.out.println(s1.equalsIgnoreCase(s2));
    String Sc1 = new String("This is an example");
    String Sc2 = new String("isan");
    System.out.println("Result of comparing Sc1 with Sc2: ");
    System.out.println(Sc1.regionMatches(true, 2, Sc2, 0, 2));
    System.out.println(Sc1.regionMatches(true, 5, Sc2, 0, 2));
    System.out.println(Sc1.regionMatches(true, 15, Sc2, 0, 2));
    System.out.println(Sc1.startsWith("This"));
    System.out.println(Sc1.startsWith("his", 1));
    System.out.println(Sc1.startsWith("is", 1));
    System.out.println(Sc1.endsWith("example"));
    System.out.println(Sc1.endsWith("is"));
    String ss1 = "Sachin";
    String ss2 = "Mithun";
    String ss3 = "Ratan";
    System.out.println(s1.compareTo(s2));// s1==s2 returns 0
    System.out.println(ss3.compareTo(ss2));// 1(because ss3>ss2)
    System.out.println(ss3.compareTo(ss1));// -1(because ss3<ss1)
  }
}
