package patterns.memento;

// Memento (Хранитель)
class TextMemento {
    private String savedText;

    public TextMemento(String text) {
        this.savedText = text;
    }

    public String getSavedText() {
        return savedText;
    }
}