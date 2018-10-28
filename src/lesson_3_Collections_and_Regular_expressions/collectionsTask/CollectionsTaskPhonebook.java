/**
 * 2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
 * В этот телефонный справочник с помощью метода add() можно добавлять записи.
 * С помощью метода get() искать номер телефона по фамилии.
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны.
 *
 * Желательно как можно меньше добавлять своего, чего нет в задании
 * (т.е. не надо в телефонную запись добавлять еще дополнительные поля
 * (имя, отчество, адрес), делать взаимодействие с пользователем через консоль и т.д.).
 * Консоль желательно не использовать (в том числе Scanner),
 * тестировать просто из метода main(), прописывая add() и get().
 */

package lesson_3_Collections_and_Regular_expressions.collectionsTask;

import java.util.HashMap;
import java.util.Map;

public class CollectionsTaskPhonebook {

    public static Map<String, String> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        add("3-32-76", "Иванов");
        add("3-32-79", "Петров");
        add("3-32-12", "Сидоров");
        add("3-32-02", "Ким");
        add("3-32-17", "Заболотный");
        add("3-32-84", "Сидоров");
        add("3-32-25", "Иванов");
        add("3-32-03", "Иванов");

        get("Иванов");
        get("Заболотный");
        get("Сидоров");
        get("Семенов");
    }

    public static void get(String secondName){
        System.out.println("По запросу \"" + secondName + "\" найдено: ");
        for (Map.Entry<String, String> o : phoneBook.entrySet()){
            if (o.getValue() == secondName){
                System.out.println(o.getKey());
            }
        }
    }

    public static void add(String telephonNumber, String secondName){
        phoneBook.put(telephonNumber, secondName);
    }
}
