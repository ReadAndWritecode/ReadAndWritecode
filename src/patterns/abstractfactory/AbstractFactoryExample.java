package patterns.abstractfactory;

public class AbstractFactoryExample {

    public static void main(String[] args) {

        // Создаем фабрику мебели в стиле Модерн
        FurnitureFactory modernFactory = new ModernFurnitureFactory();

        // Создаем стул и диван в стиле Модерн
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();

        // Используем созданные объекты
        modernChair.sitOn();
        modernSofa.lieOn();

        // Теперь создаем фабрику мебели в стиле Викторианский
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();

        // Создаем стул и диван в стиле Викторианский
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();

        // Используем созданные объекты
        victorianChair.sitOn();
        victorianSofa.lieOn();

//        FurnitureFactory factory;
//
//        String style = "victorian"; // Здесь можно установить стиль мебели
//
//        if (style.equalsIgnoreCase("modern")) {
//            factory = new ModernFurnitureFactory();
//        } else if (style.equalsIgnoreCase("victorian")) {
//            factory = new VictorianFurnitureFactory();
//        } else {
//            throw new IllegalArgumentException("Неизвестный стиль мебели");
//        }
//
//        Chair chair = factory.createChair();
//        Sofa sofa = factory.createSofa();
//
//        chair.sitOn();
//        sofa.lieOn();
    }
}


