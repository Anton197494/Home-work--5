public class Main {
    public static void main(String[] args) {
        task1(0);
        task1(1);
        task1 (3);
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


}