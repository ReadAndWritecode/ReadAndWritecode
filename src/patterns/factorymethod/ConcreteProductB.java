package patterns.factorymethod;

// 2. ConcreteProductB
class ConcreteProductB implements Product {
    @Override
    public void create() {
        System.out.println("ConcreteProductB created");
    }
}