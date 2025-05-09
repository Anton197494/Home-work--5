public class Main {
    public static void main(String[] args) {
        task1(0);
        task1(1);
        task1(3);
        task2(0, 2013);
        task2(0, 2015);
        task2(1, 2013);
        task2(1, 2015);
        task2(3, 2015);
        task2(3, 2013);
        task2(4, 2013);
        task3(1584);
        task3(2);
        task3(2021);


    }

    public static void task1(int clientOS) {
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Такой операционной системы не существует");

        }


    }

    public static void task2(int clientOS, int clientDeviceYear) {
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println("Такой операционной системы не существует");
        }
        }

    public static void task3(int year){
        if (year>1524) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println("Год является високосным");
            } else {
                System.out.println("Год не является високосным");
            }
        } else {
            System.out.println("Год должен быть больше 1584");
        }


    }
    }