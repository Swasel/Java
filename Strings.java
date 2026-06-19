public class Strings {
  public static void main(String[] args) {
    // to create a string object
    String name = "Swathy";
    String surname = new String("Selvaraja");

    System.out.println(name.hashCode());
    // String concatenation
    System.out.println("Hello " + name);
    System.out.println(name.concat(" Selvaraja"));

    System.out.println(name.charAt(1));
    System.out.println(name.length());

    // two objects are created but have same reference in string constant pool
    String s1 = "Alex";
    String s2 = "Alex";
    System.out.println(s1 == s2);

    /*
     * Mutable String which can be changed
     * for this we use "stringbuffer or stringbuilder"
     * Immutable strings which cannot be changed
     * for this we use "String"
     */

    StringBuilder sb = new StringBuilder("Dean");
    System.out.println(sb.capacity());
    sb.append(" Di Laurentis");
    System.out.println(sb.toString());

    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    System.out.println(sb.substring(4));
    System.out.println(sb.substring(4).trim());
  }
}
