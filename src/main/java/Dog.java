public class Dog {
    int speed;
    String name;
    String breed;

//    void run() {
//        for(int i = 0; i < speed; i++)
//            if ( i < speed - 1)
//                System.out.print("бегу, ");
//            else
//                System.out.print("бегу.");
//    }
//
//    String info() {
//        return "Кличка: " + name + " Порода: " + breed + " Скорость " + speed;
//    }

    void run() {
        String result = "";
        for (int i = 0; i < speed; i++) {
            result += "бегу";

            if (i == speed - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }

    String info() {
        return "Кличка: " + name + " Порода: " + breed + " Скорость " + speed;
    }
}

