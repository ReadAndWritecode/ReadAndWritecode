package patterns.chainofresponsibility;

/**
 * Абстрактный класс для обработчиков
 */
abstract class RequestHandler {
    private RequestHandler nextHandler;

    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Request request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            // Базовый обработчик - делаем что-то по умолчанию
            System.out.println("Request cannot be handled.");
        }
    }
}