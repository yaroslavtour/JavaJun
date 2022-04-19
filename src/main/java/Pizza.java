public class Pizza {
    public static void main(String[] args) {
        int money = 400;
        if (money > 500){
            System.out.println("Pizza");
        } else if (money < 100) {
            System.out.println("Doshik");
        } else {
            System.out.println("It's not enough for Pizza but enough for Doshik");
        }
    }
}
