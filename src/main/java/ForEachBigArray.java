public class ForEachBigArray {
    public static void main(String[] args) {
        int sum = 0;
        int nums [] [] = new int[3] [5];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 5; j++)
                nums [i] [j] = (i + 1) * (j + 1);
        for (int i [] : nums) {
            for (int j : i) {
                System.out.println("Значение равно: " + j);
                sum += j;
            }
        }
        System.out.println("Сумма: " + sum);
    }
}
