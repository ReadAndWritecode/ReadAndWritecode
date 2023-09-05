package patterns.memento;

public class Main {

    public static void main(String[] args) {

        // Шаг 1: Создайте экземпляр Originator (текстовый редактор)
        TextEditor editor = new TextEditor();

        // Шаг 2: Создайте экземпляр Caretaker (опекун)
        TextEditorHistory history = new TextEditorHistory();

        // Шаг 3: Выполняйте операции над текстом и сохраняйте состояния
        editor.setText("Начальный текст");
        TextMemento saveInitialText = editor.save();
        history.save(saveInitialText); // Сохраняем начальное состояние

        editor.setText("Изменение 1");
        TextMemento saveFirstChange = editor.save();
        history.save(saveFirstChange); // Сохраняем первое изменение

        editor.setText("Изменение 2");
        TextMemento saveSecondChange = editor.save();
        history.save(saveSecondChange); // Сохраняем второе изменение

        // Шаг 4: Отменяем последнее изменение (второе изменение)
        history.undo();

        // Шаг 5: Восстанавливаем состояние "Изменение 1"
        TextMemento undo = history.undo();
        editor.restore(undo);

        // Текст вернется к "Изменение 1"
        System.out.println(editor.getText());
    }
}
