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



===========================================================================================
// Create an empty LinkedList of strings
LinkedList<String> animals = new LinkedList<String>();

// Add some animals to the list
animals.add("dog");
animals.add("rat");

// Get the first animal in the list
String firstAnimal = animals.get(0);
System.out.println("First animal in the list: " + firstAnimal);

// Display all animals in the list using a for-each loop
for (String animal : animals) {
    System.out.println(animal);
}

// Display all animals in the list using the Java 8 lambda syntax
animals.forEach(animal -> System.out.println(animal));




===================OUTPUT=================================
//   First animal in the list: dog
// dog
// rat
// dog
// rat
