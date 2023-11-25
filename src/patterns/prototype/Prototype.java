package patterns.prototype;

/**
 * Интерфейс Прототипа
 */
interface Prototype extends Cloneable {

    Prototype clone();

    void displayInfo();
}