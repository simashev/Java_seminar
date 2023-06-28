//Задание:
//        Организовать вводи и хранение данных пользователей. ФИО возраст и пол
//        вывод в формате Фамилия И.О. возраст пол
//        добавить возможность выхода или вывода списка отсортированного по возрасту!)
//        *реализовать сортировку по возрасту с использованием индексов
//        *реализовать сортировку по возрасту и полу с использованием индексов
package Sem_4;
import java.util.ArrayList;
import java.util.Scanner;
public class hw_1 {
    public static void main(String[] args) {
        Boolean run = true;
        ArrayList<Integer> index = new ArrayList<>();
        ArrayList<String> familia = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> batka = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> gender = new ArrayList<>();
        System.out.println("Введите фио, возраст и пол");
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (run) {
            String str = scanner.nextLine();

            if (str.equals("q")) {
                System.out.println("Вышли)))");
                break;
            }

            String[] fio = str.split(" ");
            index.add(i);
            familia.add(fio[0]);
            name.add(fio[1]);
            batka.add(fio[2]);
            age.add(Integer.parseInt(fio[3]));
            gender.add(fio[4]);

            i++;
        }
        ArrayList<Integer> temporary = new ArrayList<>();
        for (int j = 0; j < i; j++) {
            temporary.add(age.get(j));

        }
        // Сортировка индексов по возрасту
        for (int j = 0; j < index.size() - 1; j++) {
            for (int k = 0; k < index.size() - 1 - j; k++) {
                if (temporary.get(k) > temporary.get(k + 1)) {

                    int temp = index.get(k);
                    index.set(k, index.get(k + 1));
                    index.set(k + 1, temp);
                    temp = temporary.get(k);
                    temporary.set(k, temporary.get(k + 1));
                    temporary.set(k + 1, temp);

                }
            }
        }
        for (int j = 0; j < index.size(); j++) {
            System.out.printf("%s %s. %s. %s %s \n", familia.get(index.get(j)), name.get(index.get(j)).charAt(0),
                    batka.get(index.get(j)).charAt(0), age.get(index.get(j)), gender.get(index.get(j)));
        }

        ArrayList<String> temporary2 = new ArrayList<>();
        for (int j = 0; j < index.size(); j++) {
            temporary2.add(gender.get(index.get(j)));
        }
        // Сортировка по полу
        for (int j = 0; j < index.size() - 1; j++) {

            if (temporary2.get(j).contains("м") && temporary2.get(j + 1).contains("ж")) {
                int temp = index.get(j);
                index.set(j, index.get(j + 1));
                index.set(j + 1, temp);
                String temp2 = temporary2.get(j);
                temporary2.set(j, temporary2.get(j + 1));
                temporary2.set(j + 1, temp2);
            } else continue;
        }
        System.out.println("\n");
        for (int j = 0; j < index.size(); j++) {
            System.out.printf("%s %s. %s. %s %s \n", familia.get(index.get(j)), name.get(index.get(j)).charAt(0),
                    batka.get(index.get(j)).charAt(0), age.get(index.get(j)), gender.get(index.get(j)));
        }
    }
}
