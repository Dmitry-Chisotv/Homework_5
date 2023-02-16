import java.util.*;

public class main {
    public static void main(String[] args) {
        //1. Создать словарь HashMap. Обобщение <Integer, String>.
        HashMap<Integer, String> db = new HashMap<>();

        //2. Заполнить пятью ключами (индекс, ФИО+Возраст+Пол "Иванов Иван Иванович 28 м"), добавить ключь, если не было!)
        db.put(101, "Telnova Anastasia Viktorovna 31 f");
        db.put(102, "Ivanova Olga Ivanovna 23 f");
        db.put(103, "Panenko Sergey Vasilievich 43 m");
        db.put(104, "Lagutin Ivan Nikolaevich 23 m");
        db.put(105, "Mamkina Svetlana Borisovna 23 f");

        //3. Изменить значения сделав пол большой буквой.
        db.replaceAll((k,v) -> v.replace(" m", " M").replace(" f", " F"));

        //4. Пройти по коллекции и вывести значения в формате Фамилия инициалы "Иванов И.И."

       db.forEach((k,v) -> System.out.println(v.replaceAll("(\\w+)\\s(\\w+)\\s(\\w+)\\s(\\w+)\\s(\\w+)", "$1 $2.$3. $4 $5")));

       // System.out.println(db);


            //5*. Сортировать значения по возрасту и вывести отсортированную коллекция как в четвёртом пункте.
        db.forEach((k,v) -> System.out.println(v.replaceAll("(\\w+)\\s(\\w+)\\s(\\w+)\\s(\\w+)\\s(\\w+)", "$4 $1 $2 $3 $5")));
        }

    }
