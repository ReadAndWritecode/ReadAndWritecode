package patterns.strategy;


/**
 * Интерфейс стратегии для выбора платежной системы
 */
interface PaymentStrategy {

    /**
     * Логика для оплаты
     * @param amount
     */
    void pay(double amount);
}