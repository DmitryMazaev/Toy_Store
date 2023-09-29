import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class GiveToy {

    СhoiceToy choiceToy = new СhoiceToy();

    // Функция для изменения количества игрушек, оставшихся в автомате
    public void changeFrequency (ArrayList <Integer> choiceList, ArrayList <Toy> toysToGive)
    {
        for (Toy toy : toysToGive) {
            if (choiceList.contains(toy.getIdToy()))
            {
                toy.setFrequency(toy.getFrequency() - 1);
            }
        }
        choiceList.clear();
    }
    // Функция для вывода в порядке убывания игрушек согласно их количеству в автомате
    public void priorityQueue (ArrayList <Toy> toysToGive)
    {
        PriorityQueue<Integer> queueToy = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (Toy toy : toysToGive) {
            queueToy.add(toy.getFrequency());
        }

        System.out.println("Очередь выдачи: ");

        printToy(queueToy.peek(), toysToGive);
        queueToy.remove();
        printToy(queueToy.peek(), toysToGive);
        queueToy.remove();
        printToy(queueToy.peek(), toysToGive);
        queueToy.remove();



        System.out.println("=============");
    }

    // Функция для печати выбранных игрушек
    public void printToy (int a, ArrayList <Toy> toysToGive)
    {
        for (Toy toy : toysToGive) {
            if (toy.getFrequency() == a)
            {
                System.out.println(toy.toStringWhithoutFrequency());
            }
        }
    }

}
