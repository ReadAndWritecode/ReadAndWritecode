package patterns.factorymethod;

// 4. ConcreteCreatorA
class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductA();
    }
}