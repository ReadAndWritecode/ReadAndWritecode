package solid.lsp.correct;


/**
 * В этом примере класс Sparrow соблюдает принцип LSP, так как он переопределяет метод fly() базового класса Bird
 * и предоставляет ожидаемое поведение полета.
 */
class Sparrow implements Bird {

    @Override
    public void fly() {
        // Код полета воробья
    }
}
