package solid.isp.incorrect;


/**
 * Нарушение: классы интерфейса Worker должны реализовать методы, которые им не нужны.
 */
interface Worker {

    void work();

    void manage();

}