package solid.dip.incorrect;

/**
 * В этом примере класс Switch непосредственно зависит от класса LightBulb, что нарушает принцип DIP.
 * Если в будущем мы захотим изменить логику включения лампочки, это может повлиять на класс Switch.
 */
class Switch {
    private LightBulb bulb;

    public Switch() {
        this.bulb = new LightBulb();
    }

    public void operate() {
        bulb.turnOn();
    }
}