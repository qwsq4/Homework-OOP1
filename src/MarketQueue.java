import java.util.LinkedList;
import java.util.Queue;

public class MarketQueue {

    private static Queue<String> queue1 = new LinkedList<>();
    private static Queue<String> queue2 = new LinkedList<>();
    private static Queue<String> queue3 = new LinkedList<>();

    public static void addToQueue(String... buyers) {
        for (String buyer : buyers) {
            if (queue1.size() == 5 && queue1.size() == queue2.size()) {
                queue3.add(buyer);
            } else if (queue1.size() > queue2.size()) {
                queue2.add(buyer);
            } else queue1.add(buyer);
        }
    }

    public static void deleteRandomBuyer() {
        double i = Math.random();
        if (queue3.size() != 0) {
            if (i <= 0.33) {
                queue1.poll();
            } else if (i <= 0.66) {
                queue2.poll();
            } else if (i > 0.66) {
                queue3.poll();
            }
        } else if (i <= 0.33) {
            queue1.poll();
        } else if (i <= 0.66) {
            queue2.poll();
        }
    }

    public static void getQueues() {
        System.out.println("  Первая очередь: ");
        for (String buyer : queue1) {
            System.out.println(buyer);
        }
        System.out.println("  Вторая очередь: ");
        for (String buyer : queue2) {
            System.out.println(buyer);
        }
        System.out.println("  Третья очередь: ");
        for (String buyer : queue3) {
            System.out.println(buyer);
        }
    }
}
