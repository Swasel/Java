import java.util.*;

public class CollectionsDemo {
  public static void main(String[] args) {

    // ================= ArrayList =================
    ArrayList<String> al = new ArrayList<>();

    al.add("Java");
    al.add("Python");
    al.add("C++");

    System.out.println("ArrayList: " + al);
    System.out.println("Get: " + al.get(1));
    al.set(1, "JavaScript");
    System.out.println("After Set: " + al);
    al.remove("C++");
    System.out.println("After Remove: " + al);
    System.out.println("Size: " + al.size());

    // ================= LinkedList =================
    LinkedList<String> ll = new LinkedList<>();

    ll.add("Apple");
    ll.add("Banana");
    ll.addFirst("Mango");
    ll.addLast("Orange");

    System.out.println("\nLinkedList: " + ll);
    System.out.println("First: " + ll.getFirst());
    System.out.println("Last: " + ll.getLast());
    ll.removeFirst();
    System.out.println("After removeFirst(): " + ll);

    // ================= HashSet =================
    HashSet<Integer> hs = new HashSet<>();

    hs.add(10);
    hs.add(20);
    hs.add(10); // duplicate ignored

    System.out.println("\nHashSet: " + hs);
    System.out.println("Contains 20? " + hs.contains(20));
    hs.remove(10);
    System.out.println("After Remove: " + hs);

    // ================= TreeSet =================
    TreeSet<Integer> ts = new TreeSet<>();

    ts.add(50);
    ts.add(10);
    ts.add(30);
    ts.add(20);

    System.out.println("\nTreeSet: " + ts);
    System.out.println("First: " + ts.first());
    System.out.println("Last: " + ts.last());
    System.out.println("Higher than 20: " + ts.higher(20));

    // ================= HashMap =================
    HashMap<Integer, String> hm = new HashMap<>();

    hm.put(101, "Swathy");
    hm.put(102, "Rahul");
    hm.put(103, "Priya");

    System.out.println("\nHashMap: " + hm);
    System.out.println("Get Key 102: " + hm.get(102));
    System.out.println("Contains Key 101? " + hm.containsKey(101));

    hm.remove(103);
    System.out.println("After Remove: " + hm);

    System.out.println("\nIterating HashMap:");
    for (Map.Entry<Integer, String> entry : hm.entrySet()) {
      System.out.println(entry.getKey() + " -> " + entry.getValue());
    }
  }
}