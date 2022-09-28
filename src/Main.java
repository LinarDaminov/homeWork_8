public class Main {
    public static void main(String[] args) {
        checkYear(2020);
        checkPhone(1, 2020);
        int deliveryDays = deleveryDistance(40);
        System.out.println("Потребуется для доставки " + deliveryDays + " дней " );
    }

    public static void checkYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void checkPhone(int clientOS, int clientDeviceYear) {
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Скачайте приложение по ссылке для IOS");
        }
        if (clientOS == 0 && 2015 > clientDeviceYear) {
            System.out.println("Скачайте облегченную версию для Android");
        }
        if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Скачайте приложение по ссылке для Android");
        }
        if (clientOS == 1 && 2015 > clientDeviceYear) {
            System.out.println("Скачайте облегченную версию для Android");
        }
    }
    public static int deleveryDistance(int deliveryDistance) {
        int deliveryDays = 0;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        } return deliveryDays;
    }
}







