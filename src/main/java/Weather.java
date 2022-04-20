public class Weather {
    public static void main(String[] args) {
        int timer = 19;
        boolean goodWeather = false;
        boolean time = timer >= 21 || timer <= 7;
        if(!time && goodWeather){
            System.out.println("Гулять");
        }
        if (time){
            System.out.println("Спать");
        }
        if (!time && !goodWeather){
            System.out.println("Читать");
        }
    }
}
