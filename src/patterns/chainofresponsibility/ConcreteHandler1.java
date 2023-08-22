package patterns.chainofresponsibility;

/**
 * Конкретные обработчик1
 */
class ConcreteHandler1 extends RequestHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE1) {
            System.out.println("ConcreteHandler1 handles the request.");
        } else {
            super.handleRequest(request);
        }
    }
}