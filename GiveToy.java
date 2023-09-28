import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class GiveToy {

    СhoiceToy choiceToy = new СhoiceToy();

    public void changeFrequency (ArrayList <Integer> choiceList, ArrayList <Toy> toysToGive)
    {
        
        for (Toy toy : toysToGive) {
            if (choiceToy.choiceList.contains(toy.getIdToy()))
            {
                toy.setFrequency(toy.getFrequency() - 1);
            }
        }
        System.out.println(choiceToy.choiceList);
        choiceToy.choiceList.clear();
        choiceToy.choiceList.clear();
    }
    // Метод для вывода в порядке убывания игрушек согласно их количеству в автомате
    public void priorityQueue (ArrayList <Toy> toysToGive)
    {
        PriorityQueue<Integer> queueToy = new PriorityQueue<Integer>(Collections.reverseOrder());

        for (Toy toy : toysToGive) {
            queueToy.add(toy.getFrequency());
        }

        System.out.println("Колиечество игрушек на выдачу в автомате: " + queueToy);

        System.out.println("Очередь выдачи: ");

        /* while (queueToy.size() > 0) {
            for (Toy toy : toysToGive) {
                if (toy.getFrequency() == queueToy.peek())
                {
                    System.out.println(toy +" "+ queueToy.peek()+" "+ toy.getFrequency());
                    queueToy.remove();
                }
            }    
        } */
        printToy(queueToy.peek(), toysToGive);
        queueToy.remove();
        printToy(queueToy.peek(), toysToGive);
        queueToy.remove();
        printToy(queueToy.peek(), toysToGive);
        queueToy.remove();



        System.out.println("=============");
    }

    public void printToy (int a, ArrayList <Toy> toysToGive)
    {
        for (Toy toy : toysToGive) {
            if (toy.getFrequency() == a)
            {
                System.out.println(toy +" "+ toy.getFrequency());
            }
        }
    }

}
