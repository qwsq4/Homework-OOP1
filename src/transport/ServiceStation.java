package transport;

import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation<C extends Car>{

    Queue<C> queue = new LinkedList<C>();

    public void addAuto(C car) {
        if (car.getClass() != Bus.class) {
            queue.offer(car);
        } else System.out.println("Данный автомобиль не нуждается в обслуживании");
    }

    public void serviceAuto() {
        C car = queue.poll();
        System.out.println(car.getBrand() + " " + car.getModel() + ": выполняется диагностика...");
        System.out.println(car.getBrand() + " " + car.getModel() + ": обслуживание завершено");
    }
}
