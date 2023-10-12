package homework;

import java.util.HashSet;
import java.util.Set;

public class Laptop_Main {
    public static void main(String[] args) throws Exception {
        // Создание объектов класса Laptop
        Laptop laptop1 = new Laptop("HP Pavilion x360", 15, 512,
                "SSD", 16, "Windows 11");
        
        Laptop laptop2 = new Laptop("iRU Калибр", 15, 1024,
                "HDD", 8, "Free DOS");

        Laptop laptop3 = new Laptop("Digma Pro Magnus", 16, 512,
                "SSD", 16, "Windows 11 Professional");

        Laptop laptop4 = new Laptop("Apple MacBook Pro", 16, 512,
                "SSD", 16, "Mac OS");
       
        Laptop laptop5 = new Laptop("Apple MacBook Air", 13, 256,
                "SSD", 8, "Mac OS");
      
        Laptop laptop6 = new Laptop("DELL XPS 17 9730", 17, 1024,
                "SSD", 32, "Windows 11 Professional");
       
        Laptop laptop7 = new Laptop("ASUS ROG Zephyrus Duo 16", 16, 2048,
                "SSD", 32, "Windows 11 Home");
       
        Laptop laptop8 = new Laptop("Acer ConceptD 7 Ezel", 16, 1024,
                "SSD", 32, "Windows 10 Professional");
      
        Laptop laptop9 = new Laptop("MSI CreatorPro X17", 17, 2048,
                "SSD", 32, "Windows 11 Professional");
        
        Laptop laptop10 = new Laptop("Digma EVE 15", 15, 128,
                "eMMC", 4, "Windows 11 Home");
        
        // Создание множества
        Set<Laptop> laptop = new HashSet<>();
        laptop.add(laptop1);
        laptop.add(laptop2);
        laptop.add(laptop3);
        laptop.add(laptop4);
        laptop.add(laptop5);
        laptop.add(laptop6);
        laptop.add(laptop7);
        laptop.add(laptop8);
        laptop.add(laptop9);
        laptop.add(laptop10);

        // создание нового объекта вызова методов
        Laptop FilterLaptop = new Laptop();

        // вызов метода фильтрации по заданным параметрам
        System.out.println(FilterLaptop.newFilter(laptop));
    }
}
