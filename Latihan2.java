package mod4keg1;
 import java.util.LinkedList;
 import java. util.Queue;
public class Latihan2 {
    public void queueExample(){
        Queue queue = new LinkedList();

        queue.add("Java");
        queue.add("DoNot");
        queue.offer("PHP");
        queue.offer("HTML");
        System.out.println("Remove : " +queue.remove());
        System.out.println("Element : " + queue.element());
        System.out.println("Poll : " + queue.poll());
        System.out.println("Peek : " + queue.peek());
    }

    public static void main(String[] args) {
        new Latihan2().queueExample();
    }
}
