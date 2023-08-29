package solid.lsp.correct;

/**
 * В этом примере класс Ostrich соблюдает принцип LSP, так как он переопределяет метод fly() базового класса Bird
 * и предоставляет ожидаемое поведение полета.
 */
class Ostrich implements Bird {

    @Override
    public void fly() {
        // Страус может имитировать полет
    }
}
