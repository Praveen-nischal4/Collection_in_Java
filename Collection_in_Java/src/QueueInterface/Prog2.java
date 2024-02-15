package QueueInterface;


import java.util.*;

public class Prog2 {

    public static void main(String[] args) {

        // Create a queue using LinkedList
        Queue<Integer> lst = new LinkedList<>();

        // Store elements in the queue
        for(int i = 1; i <= 5; i++) {
            lst.offer(i); // Adds the specified element to the end of the queue
        }

        // Delete elements from the queue
        while (!lst.isEmpty()) {
            System.out.println("Deleted: " + lst.poll()); // Remove and print each element
        }

        // After deletion, the queue will be empty
        System.out.println("Queue is empty: " + lst.isEmpty());
    }

}
