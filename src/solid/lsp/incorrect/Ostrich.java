package solid.lsp.incorrect;


/**
 * Пример нарушения принципа LSP:
 *
 * В данном примере страус является подтипом птицы,
 * но он нарушает принцип LSP,
 * так как переопределение метода fly() в классе Ostrich вызывает исключение,
 * что не соответствует поведению базового класса Bird.
 */

class Ostrich extends Bird {

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Страус не умеет летать");
    }
}
