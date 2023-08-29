package solid.srp.correct;

import solid.srp.User;

/**
 * В этом примере мы разделили две ответственности - управление пользователями и отправку email - на два отдельных класса: UserManager и EmailService.
 * Теперь изменения в логике отправки email не затронут класс, отвечающий за управление пользователями.
 */
class UserManager {

    public void createUser(User user) {
        // Код создания пользователя
    }

    public void updateUser(User user) {
        // Код обновления данных пользователя
    }
}