public class Seconds {
    public static void main(String[] args) {
        int sec = 50000030;
        int days = sec / 86400;
        int hours = (sec % 86400) / 3600;
        int min = ((sec % 86400) % 3600) / 60;
        int leftSec = sec - days * 86400 - hours * 3600 - min * 60;
        System.out.println("Количество дней - " + days);
        System.out.println("Количество часов - " + hours);
        System.out.println("Количество минут - " + min);
        System.out.println("Количество секунд - " + leftSec);
    }
}
