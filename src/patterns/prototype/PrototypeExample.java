package patterns.prototype;

public class PrototypeExample {
    public static void main(String[] args) {
        // Создаем прототип
        ConcretePrototype prototype = new ConcretePrototype("Initial Property");

        // Клонируем прототип
        ConcretePrototype clone = (ConcretePrototype) prototype.clone();

        // Проверяем, что свойства одинаковы
        System.out.println("Original Prototype:");
        prototype.displayInfo();

        System.out.println("Cloned Prototype:");
        clone.displayInfo();

        // Меняем свойство в клоне и проверяем, что оригинал не изменился
        clone.setProperty("Modified Property");
        System.out.println("\nAfter modifying the clone:");
        System.out.println("Original Prototype:");
        prototype.displayInfo();

        System.out.println("Cloned Prototype:");
        clone.displayInfo();
    }
}