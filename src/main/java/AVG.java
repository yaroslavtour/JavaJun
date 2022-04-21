public class AVG {
    public static void main(String[] args) {
       int sum = 0;
       int count = 1;
       while (count <= 100){
           sum += count;
           count++;
       }
       float res = sum / (float) count;
        System.out.println(res);
    }
}
