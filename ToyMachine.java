import java.io.FileWriter;
import java.util.ArrayList;

public class ToyMachine {
    public static void main(String[] args) throws Exception {
        // Экземпляры игрушек
        Toy robot = new Toy(1, "Робот", 5);
        Toy puzzle = new Toy(2, "Пазл", 3);
        Toy constructor = new Toy(3, "Конструктор", 7);
        Toy car = new Toy(4, "Автомобиль", 12);
        Toy truck = new Toy(5, "Грузовик", 10);
        Toy excavator = new Toy(6, "Экскаватор", 4);
        Toy airplane = new Toy(7, "Самолет", 11);
        Toy soldier = new Toy(8, "Солдатик", 24);
        Toy gun = new Toy(9, "Пистолет", 8);
        Toy soapBubbles = new Toy(10, "Мыльные пузыри", 29);

        ArrayList <Toy> toyList  = new ArrayList<>();
        toyList.add(robot);
        toyList.add(puzzle);
        toyList.add(constructor);
        toyList.add(car);
        toyList.add(truck);
        toyList.add(excavator);
        toyList.add(airplane);
        toyList.add(soldier);
        toyList.add(gun);
        toyList.add(soapBubbles);

        

        while (true)
        {
            FileWriter fw = new FileWriter("ToyStore.txt", true);
            СhoiceToy choiceToy = new СhoiceToy();
            choiceToy.choiceThreeToy(toyList, fw);
            fw.close();
            GiveToy giveToy = new GiveToy();
            giveToy.priorityQueue(choiceToy.getToysToGive());
            giveToy.changeFrequency(choiceToy.getChoiceList(), choiceToy.getToysToGive());
        }
        
    }
}
