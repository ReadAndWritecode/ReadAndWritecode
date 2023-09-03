package patterns.factorymethod;

// 2. ConcreteProductA
class ConcreteProductA implements Product {
    @Override
    public void create() {
        System.out.println("ConcreteProductA created");
    }
}