public class Cond {
    public static void main(String[] args) {
        int temp = 25;
        int time = 14;
        boolean hot = temp >= 25;
        boolean timer = time >= 22 || time <= 8;
        if (!hot || timer){
            System.out.println("Кондиционер выключен!");
        } else {
            System.out.println("Кондиционер включен!");
        }
    }
}
