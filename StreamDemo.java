import java.util.*;
import java.util.stream.*;

class Student implements Comparable<Student> {
  int id;
  String name;
  int marks;

  Student(int id, String name, int marks) {
    this.id = id;
    this.name = name;
    this.marks = marks;
  }

  // Comparable - Sort by Marks
  public int compareTo(Student s) {
    return this.marks - s.marks;
  }

  public String toString() {
    return id + " " + name + " " + marks;
  }
}

public class StreamDemo {
  public static void main(String[] args) {

    List<Student> students = new ArrayList<>();

    students.add(new Student(101, "Swathy", 85));
    students.add(new Student(102, "Rahul", 70));
    students.add(new Student(103, "Priya", 95));
    students.add(new Student(104, "Kiran", 60));

    // forEach()
    System.out.println("Students:");
    students.forEach(System.out::println);

    // Comparable
    Collections.sort(students);
    System.out.println("\nSorted by Marks (Comparable):");
    students.forEach(System.out::println);

    // Comparator
    students.sort((s1, s2) -> s1.name.compareTo(s2.name));

    System.out.println("\nSorted by Name (Comparator):");
    students.forEach(System.out::println);

    // Stream API
    List<Integer> nums = Arrays.asList(10, 15, 20, 25, 30);

    // Filter
    System.out.println("\nFilter (Even Numbers):");
    nums.stream()
        .filter(n -> n % 2 == 0)
        .forEach(System.out::println);

    // Map
    System.out.println("\nMap (Square of Numbers):");
    nums.stream()
        .map(n -> n * n)
        .forEach(System.out::println);

    // Sorted
    System.out.println("\nSorted:");
    nums.stream()
        .sorted()
        .forEach(System.out::println);

    // Reduce
    int sum = nums.stream()
        .reduce(0, (a, b) -> a + b);

    System.out.println("\nReduce (Sum): " + sum);
  }
}