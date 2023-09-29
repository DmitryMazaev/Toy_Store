import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class СhoiceToy {
    // Список из выбранных id игрушек
    private ArrayList <Integer> choiceList = new ArrayList<>();

    // Список игрушек, предназначенных для выдачи пользователю
    private ArrayList <Toy> toysToGive = new ArrayList<>();

    public ArrayList<Toy> getToysToGive() {
        return toysToGive;
    }

    public ArrayList<Integer> getChoiceList() {
        return choiceList;
    }

    EnterNumber enterNumber = new EnterNumber();

    // Функция для ввода пользователем id игрушек, которые он хочет выбрать
    public void choiceThreeToy (ArrayList <Toy> toyList, FileWriter fw)
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
        int firstToy = enterNumber.enterNumber();
        choiceList.add(firstToy);
        
        for (Toy toy : toyList) {
            if (toy.getIdToy() == firstToy)
            {
                toysToGive.add(toy);
                try {
                    fw.write("Выдача игрушек:");
                    fw.write("\n");
                    fw.write("| id | Имя | Кол-во |");
                    fw.write("\n");
                    fw.write("  " + toy.getIdToy() + " " + toy.getNameToy() + " " + toy.getFrequency());
                    fw.write("\n");
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
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
                try {
                    fw.write("  " + toy.getIdToy() + " " + toy.getNameToy() + " " + toy.getFrequency());
                    fw.write("\n");
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
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
                try {
                    fw.write("  " + toy.getIdToy() + " " + toy.getNameToy() + " " + toy.getFrequency());
                    fw.write("\n");
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
        System.out.println("============");

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
