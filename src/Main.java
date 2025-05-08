public class Main {
    public static void main(String[] args) {
        task1(0);
        task1(1);
        task1 (3);
        task2(0, 2013);
        task2(0, 2015);
        task2(1, 2013);
        task2(1, 2015);
        task2(3, 2015);
        task2(3,2013);
        task2(4,2013);


    }

    public static void task1(int clientOS) {
        switch (clientOS) {
            case 0:
                System.out.println ("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println ("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println ("Такой операционной системы не существует");

        }


    }

    public static void task2(int clientOS, int clientDeviceYear){
        switch (clientOS) {
            case 0:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }else {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                }
                break;
            case 1:
                if (clientDeviceYear < 2015) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
                break;
            default:
                System.out.println ("Такой операционной системы не существует");

        }}}

