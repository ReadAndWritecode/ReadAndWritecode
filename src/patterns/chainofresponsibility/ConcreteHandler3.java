package patterns.chainofresponsibility;

/**
 * Конкретные обработчик3
 */
class ConcreteHandler3 extends RequestHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE3) {
            System.out.println("ConcreteHandler3 handles the request.");
        } else {
            super.handleRequest(request);
        }
    }
}