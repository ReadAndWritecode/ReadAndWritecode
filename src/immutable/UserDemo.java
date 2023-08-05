package immutable;

import java.util.HashMap;
import java.util.Map;

public class UserDemo {

    public static void main(String[] args) {

        Map<User, String> userMap = new HashMap<>();

        User user1 = new User("Vacya1", "Pupkin", 30);
        User user2 = new User("Vacya2", "Pupkin", 30);

        userMap.put(user1, "Employee");
        System.out.println("containsKey(user1) " + userMap.containsKey(user1));
        System.out.println("----------------------------------------");

//        user1.setFirstName("Vasya3");
        userMap.put(user2, "Manager");

        // Доступ к значению по ключу (user1 и user2)
        String roleForUser1 = userMap.get(user1);
        String roleForUser2 = userMap.get(user2);

        System.out.println("Role for User1: " + roleForUser1);
        System.out.println("Role for User2: " + roleForUser2);

        System.out.println("----------------------------------------");

        System.out.println("containsKey(user1) " + userMap.containsKey(user1));


    }
}
