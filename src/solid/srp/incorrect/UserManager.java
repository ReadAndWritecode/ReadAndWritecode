package solid.srp.incorrect;

import solid.srp.User;

/**
 * В данном примере класс UserManager нарушает принцип SRP, так как он имеет две ответственности: управление пользователями и отправку email.
 * Если изменится логика отправки email, это может повлиять на класс, который должен заниматься управлением пользователями.
 */
class UserManager {

    public void createUser(User user) {
        // Код создания пользователя
    }

    public void updateUser(User user) {
        // Код обновления данных пользователя
    }

    public void sendEmail(User user, String message) {
        // Код отправки email пользователю
    }
}