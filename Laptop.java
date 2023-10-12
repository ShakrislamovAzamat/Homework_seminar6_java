package homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Laptop {

    private String model;
    private int diagonal;
    private int pzuSize;
    private String pzuType;
    private int ozuSize;
    private String operatingSystem;

    public Laptop() {
    }

    public Laptop(String model, int diagonal, int pzuSize, String pzuType, int ozuSize,
            String operatingSystem) {

        this.model = model;
        this.diagonal = diagonal;
        this.pzuSize = pzuSize;
        this.pzuType = pzuType;
        this.ozuSize = ozuSize;
        this.operatingSystem = operatingSystem;
    }

    public String getModel() {
        return model;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getPzuSize() {
        return pzuSize;
    }

    public String getPzuType() {
        return pzuType;
    }

    public int getOzuSize() {
        return ozuSize;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    // создание метода фильтрации ноутбуков
    public Set<Laptop> newFilter(Set<Laptop> laptop) {
        Scanner scan = new Scanner(System.in);
        Set<Laptop> listLaptop = new HashSet<>(laptop);

        System.out.println("Выберите один или несколько (через пробел) параметров фильтрации" +
                "\n1. Диагональ экрана\n2. Объем накопителя\n3. Тип накопителя\n4. Объем оперативной памяти");
        String userRequest = scan.nextLine();

        for (int i = 0; i < userRequest.length(); i++) {
            if (1 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Выберите диагональ экрана \n");
                String inputDiagonal = scan.nextLine();
                int intParseInputDiagonal = Integer.parseInt(inputDiagonal);
                for (Laptop tempLaptop : laptop) {
                    if (intParseInputDiagonal != tempLaptop.diagonal) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if (2 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Выберите объем накопителя, Гб\n");
                String inputPzuSize = scan.nextLine();
                int intParseInputPzuSize = Integer.parseInt(inputPzuSize);
                for (Laptop tempLaptop : laptop) {
                    if (intParseInputPzuSize != tempLaptop.pzuSize) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if (3 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Выберите тип накопителя\n");
                String inputPzuType = scan.nextLine();
                for (Laptop tempLaptop : laptop) {
                    if ((inputPzuType.equals(tempLaptop.pzuType) == false)) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }

            if (4 == Character.getNumericValue(userRequest.charAt(i))) {
                System.out.println("Выберите объем оперативной памяти, Гб\n");
                String inputOzuSize = scan.nextLine();
                int intParseInputOzuSize = Integer.parseInt(inputOzuSize);
                for (Laptop tempLaptop : laptop) {
                    if (intParseInputOzuSize != tempLaptop.ozuSize) {
                        listLaptop.remove(tempLaptop);
                    }
                }
            }
        }
        scan.close();
        return listLaptop;
    }

    // метод toString, выводит на экран данные объекта
    @Override
    public String toString() {
        return "\n\n" + model + ": << Диагональ экрана: " + diagonal + " дюйм; объем накопителя: " + pzuSize
                + " Гб ; тип накопителя: " + pzuType + "; объем оперативной памяти: " + ozuSize
                + " Гб ; операционная система: " + operatingSystem + " >>";
    }
}
