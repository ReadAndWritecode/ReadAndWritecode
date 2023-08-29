package solid.isp.correct;

/**
 * В этом примере мы разделили интерфейс Worker на два отдельных интерфейса: Worker и Manager.
 * Теперь классы Employee и Director могут реализовывать только те методы, которые им нужны, избегая пустых или ненужных реализаций.
 */
class Director implements Manager {

    @Override
    public void manage() {
        // Код управления директором
    }
}