import java.util.Scanner;

public class EnterNumber {
    // Функция, обрабатывающая исключения при вводе некорректного id
    public int enterNumber()
    {
        int a = 0;
        while (true) {
            Scanner in = new Scanner(System.in);
            String input = in.next();
            a = 0;
            try {
                a = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите id игрушке из списка выше");
            }

        }
        return a;
    }
}
