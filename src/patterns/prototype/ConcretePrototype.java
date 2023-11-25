package patterns.prototype;

/**
 * Конкретный класс Прототипа
 */
class ConcretePrototype implements Prototype {
    private String property;

    public ConcretePrototype(String property) {
        this.property = property;
    }

    // Метод для клонирования
    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void setProperty(String property) {
        this.property = property;
    }

    @Override
    public void displayInfo() {
        System.out.println("Property: " + property);
    }
}