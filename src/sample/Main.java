public class Main{
    public static void main(String args[]) {
        double ref =100;
        int bon = ref >=1000? (int ) (ref/100):0;
        double balance = 100 + ref + bon;
        System.out.println("Итог = "+balance);
    }
}