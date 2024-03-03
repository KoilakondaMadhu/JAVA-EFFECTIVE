import java.util.LinkedList;

public class Main {
  public static void main(String[] args) {
    // create linkedlist
    LinkedList<String> animals = new LinkedList<>();

    // add elements to LinkedList
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");

    // print the LinkedList
    System.out.println("LinkedList: " + animals);

    // add an element at the beginning of the LinkedList
    animals.addFirst("Horse");
    System.out.println("LinkedList after addFirst(): " + animals);

    // add an element at the end of the LinkedList
    animals.addLast("Zebra");
    System.out.println("LinkedList after addLast(): " + animals);

    // remove the first element
    animals.removeFirst();
    System.out.println("LinkedList after removeFirst(): " + animals);

    // remove the last element
    animals.removeLast();
    System.out.println("LinkedList after removeLast(): " + animals);
  }
}


// ====================================OUTPUT====================================

// LinkedList: [Dog, Cat, Cow]
// LinkedList after addFirst(): [Horse, Dog, Cat, Cow]
// LinkedList after addLast(): [Horse, Dog, Cat, Cow, Zebra]
// LinkedList after removeFirst(): [Dog, Cat, Cow, Zebra]
// LinkedList after removeLast(): [Dog, Cat, Cow]
