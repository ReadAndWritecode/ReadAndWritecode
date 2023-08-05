package immutable;

import java.util.HashMap;
import java.util.Map;

public class ImmutableDemo {
    public static void main(String[] args) {

        ImmutableUser user1 = new ImmutableUser("John", "Doe", 30);
        ImmutableUser user2 = new ImmutableUser("Alen", "Doe", 28);

        // Использование Immutable объекта
        System.out.println("User1: " + user1);
        System.out.println("User2: " + user2);

        System.out.println("----------------------------------------");

        // Вызов метода для обработки Immutable объекта
        user1.processUser(user1);
        user2.processUser(user2);

        Map<ImmutableUser, String> userMap = new HashMap<>();
        userMap.put(user1, "Employee");
        userMap.put(user2, "Manager");


        // Доступ к значению по ключу (user1 и user2)
        String roleForUser1 = userMap.get(user1);
        String roleForUser2 = userMap.get(user2);

        System.out.println("----------------------------------------");

        System.out.println("Role for User1: " + roleForUser1);
        System.out.println("Role for User2: " + roleForUser2);

    }
}
