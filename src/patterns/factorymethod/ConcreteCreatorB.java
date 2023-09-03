package patterns.factorymethod;

// 4. ConcreteCreatorB
class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProductB();
    }
}