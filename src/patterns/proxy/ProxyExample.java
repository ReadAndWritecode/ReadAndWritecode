package patterns.proxy;

// Использование
public class ProxyExample {

    public static void main(String[] args) {

//        Image image = new RealImage("image.png");
//        image.display();


        // Клиентский код использует прокси, но реальное изображение не загружается
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // Изображение будет загружено только при вызове display()
        // Реальное изображение загружается только здесь
        image1.display();


        // Изображение уже загружено, повторная загрузка не требуется
        image1.display();

        // Изображение 2 загружается только в этот момент
        image2.display();
    }
}