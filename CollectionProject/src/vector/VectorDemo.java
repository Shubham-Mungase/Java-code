package vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // Create a Vector of Strings
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Accessing elements
        System.out.println("Element at index 1: " + vector.get(1));

        // Iterating through the Vector
        for (String fruit : vector) {
            System.out.println(fruit);
        }

        // Check if the vector contains a specific element
        System.out.println("Contains 'Banana'? " + vector.contains("Banana"));

        // Size and capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // Remove an element
        vector.remove("Banana");
        System.out.println("After removal: " + vector);
    }
}

