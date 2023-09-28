import java.util.ArrayList;
import java.util.Scanner;

public class СhoiceToy {

    public ArrayList <Integer> choiceList = new ArrayList<>();

    private ArrayList <Toy> toysToGive = new ArrayList<>();

    public ArrayList<Toy> getToysToGive() {
        return toysToGive;
    }

    public ArrayList<Integer> getChoiceList() {
        return choiceList;
    }

    public void choiceThreeToy (ArrayList <Toy> toyList)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Вас приветствует автомат с игрушками! Выберите три любые игрушки из списка:");

        for (Toy toy : toyList) {
            if (toy.getFrequency() > 0)
            {
                System.out.println(toy.getIdToy() + " " + toy);
            }
        }

        System.out.print("Введите id первой игрушки: ");
        int firstToy = in.nextInt();
        choiceList.add(firstToy);
        
        for (Toy toy : toyList) {
            if (toy.getIdToy() == firstToy)
            {
                toysToGive.add(toy);
            }
        }

        for (Toy toy : toyList) {
            if (toy.getFrequency() > 0 && !choiceList.contains(toy.getIdToy()))
            {
                System.out.println(toy.getIdToy() + " " + toy);
            }
        }

        System.out.print("Введите id второй игрушки: ");
        int secondToy = in.nextInt();
        choiceList.add(secondToy);

        for (Toy toy : toyList) {
            if (toy.getIdToy() == secondToy)
            {
                toysToGive.add(toy);
            }
        }

        for (Toy toy : toyList) {
            if (toy.getFrequency() > 0 && !choiceList.contains(toy.getIdToy()))
            {
                System.out.println(toy.getIdToy() + " " + toy);
            }
        }

        System.out.print("Введите id третьей игрушки: ");
        int thirdToy = in.nextInt();
        choiceList.add(thirdToy);

        for (Toy toy : toyList) {
            if (toy.getIdToy() == thirdToy)
            {
                toysToGive.add(toy);
            }
        }

        //in.close();

        System.out.println("Вы выбрали следующие игрушки: ");
        for (Toy toy : toyList) {
            if (choiceList.contains(toy.getIdToy()))
            {
                System.out.println(toy);
            }
        }
        System.out.println("============");
    }
}
