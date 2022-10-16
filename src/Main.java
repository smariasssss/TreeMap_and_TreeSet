import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Николай", "Миклухо-Маклай", 41));
        people.add(new Person("Эдвин", "Ван дер Сар", 51));
        people.add(new Person("Иван", "Смирнов", 21));
        people.add(new Person("Зинаида", "Христорождественская", 101));
        people.add(new Person("Артём", "Пономарёв", 15));
        people.add(new Person("Екатерина", "Вознесенская", 12));

        Collections.sort(people, new PersonComparator(3));
        Collections.reverse(people);
        System.out.println(people);
    }

}
