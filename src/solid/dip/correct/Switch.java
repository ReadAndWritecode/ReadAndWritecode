package solid.dip.correct;


/**
 * В этом примере мы определили интерфейс Switchable, который предоставляет метод turnOn().
 * Классы LightBulb и Switch зависят от абстракции (Switchable), а не от конкретных реализаций.
 * Это соблюдение принципа инверсии зависимости, так как верхний уровень (Switch) зависит от абстракции, а не от деталей нижнего уровня (LightBulb).
 */
class Switch {
    private Switchable device;

    public Switch(Switchable device) {
        this.device = device;
    }

    public void operate() {
        device.turnOn();
    }
}