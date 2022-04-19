public class Pizza {
    public static void main(String[] args) {
        int money = 200;
        if (money > 500){
            System.out.println("Pizza");
        } else if (money < 100) {
            System.out.println("Doshik");
        } else if (money > 100 & money < 300){
            System.out.println("Gamburger");
        } else {
            System.out.println("It's not enough for Pizza or Gamburger but enough for Doshik");
        }
    }
}
