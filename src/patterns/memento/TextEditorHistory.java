package patterns.memento;

import java.util.Stack;

// Caretaker (Опекун)
class TextEditorHistory {

    /**
     * структура данных "стек" (stack) работает по принципу LIFO,
     * что расшифровывается как "Last-In-First-Out", что означает "последний вошел - первый вышел".
     * Это означает, что элементы добавленные последними в стек будут извлечены первыми.
     */
    private Stack<TextMemento> history = new Stack<>();

    public void save(TextMemento memento) {
        history.push(memento);
    }

    public TextMemento undo() {
        if (!history.isEmpty()) {
            // Удаляет элемент, находящийся на вершине стека.
            // Возвращает удаленный элемент.
            return history.pop();
        }
        return null;
    }
}