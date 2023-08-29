package solid.isp.incorrect;


/**
 * В этом примере класс Employee реализует интерфейс Worker, который имеет методы work() и manage().
 * Но сотрудник необязательно умеет управлять, и реализация метода manage() в данном контексте будет бессмысленной.
 */
class Employee implements Worker {

    public void work() {
        // Код выполнения работы сотрудника
    }

    public void manage() {
        // Пустая реализация, так как сотрудник не умеет управлять
    }
}