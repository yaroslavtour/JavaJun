public class Space {
    public static void main(String[] args) {
        String[] nameOfMonth = {
                "Январь",
                "Февраль",
                "Март",
                "Апрель",
                "Май",
                "Июнь",
                "Июль",
                "Август",
                "Сентябрь",
                "Октябрь",
                "Ноябрь",
                "Декабрь"
        };
        String result = "";
        for(int i = 0; i < nameOfMonth.length; i++) {
            result += nameOfMonth[i];
            if (i == nameOfMonth.length - 1) {
                result += ".";
            } else {
                result += ", ";
            }
        }
        System.out.println(result);
    }
}
