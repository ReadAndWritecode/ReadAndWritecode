package patterns.chainofresponsibility;

/**
 * Конкретные обработчик2
 */
class ConcreteHandler2 extends RequestHandler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE2) {
            System.out.println("ConcreteHandler2 handles the request.");
        } else {
            super.handleRequest(request);
        }
    }
}