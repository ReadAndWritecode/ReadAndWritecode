package patterns.chainofresponsibility;

/**
 * Главный класс для демонстрации работы паттерна
 */
public class ChainOfResponsibilityExample {

    public static void main(String[] args) {

        RequestHandler handler1 = new ConcreteHandler1();
        RequestHandler handler2 = new ConcreteHandler2();
        RequestHandler handler3 = new ConcreteHandler3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        Request request1 = new Request(RequestType.TYPE1);
        Request request2 = new Request(RequestType.TYPE2);
        Request request3 = new Request(RequestType.TYPE3);

        handler1.handleRequest(request1);
        handler1.handleRequest(request2);
        handler1.handleRequest(request3);
    }
}