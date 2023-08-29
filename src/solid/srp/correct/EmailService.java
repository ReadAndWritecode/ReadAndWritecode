package solid.srp.correct;

import solid.srp.User;

/**
 * В этом примере мы разделили две ответственности - управление пользователями и отправку email - на два отдельных класса: UserManager и EmailService.
 * Теперь изменения в логике отправки email не затронут класс, отвечающий за управление пользователями.
 */
class EmailService {

    public void sendEmail(User user, String message) {
        // Код отправки email пользователю
    }
}