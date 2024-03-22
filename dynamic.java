import java.util.ArrayList;

public class DynamicArrayExample {
    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Adding elements to the ArrayList
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);

        // Accessing elements from the ArrayList
        System.out.println("Elements of the dynamic array:");
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }

        // Adding more elements
        dynamicArray.add(40);
        dynamicArray.add(50);

        // Updated elements
        System.out.println("Updated elements of the dynamic array:");
        for (int i = 0; i < dynamicArray.size(); i++) {
            System.out.println(dynamicArray.get(i));
        }
    }
}
