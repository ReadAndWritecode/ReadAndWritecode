package patterns.factorymethod;

public class FactoryMethodExample {

    public static void main(String[] args) {

        Creator creatorA = new ConcreteCreatorA();
        Product productA = creatorA.factoryMethod();
        productA.create(); // Output: ConcreteProductA created
        
        Creator creatorB = new ConcreteCreatorB();
        Product productB = creatorB.factoryMethod();
        productB.create(); // Output: ConcreteProductB created
    }
}