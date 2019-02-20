package z1;

import java.time.Duration;
import java.time.LocalTime;

public class Algorithmics {

    public int potegowanie(int x, int y) {
        int result = 1;
        for (int i = 1; i <= y; i++) {
            result = result * x;
        }
        return result;
    }

    public int silnia(int n) {
//        int result =1;
//        int counter=1;
//        for (int i = 0; i < x; i++) {
//            result =result*counter;
//            counter++;
//        }
//        return  result;


        int result = 1;

        for (int i = n; i > 1; i--) {
            result = result * i;

        }
        return result;
    }

    public int ciagGeometryczny(int a, int q, int n) {
        int result = 0;
        for (int i = 0; i <= n - 1; i++) {
            result = result + (a * potegowanie(q, i));
        }
        return result;
    }

    public int ciagArytmetyczny(int a, int r, int n) {
        int result = 0;
        for (int i = 0; i <= n - 1; i++) {
            result = result + a + i * r;
        }
        return result;
    }

    public boolean czyLiczbaDoskonala(int x) {
        int sum = 0;
        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sum = sum + i;
//                System.out.println(sum);
            }
        }
//        if(x==sum){
//            return true;
//        }
//        return  false;
        return x == sum ? true : false;
    }

    public int getNWD(int x, int y) {
        int less = x;
        int greather = y;
        if (x > y) {
            less = y;
            greather = x;
        }
        for (int i = less; less >= 1; i--) {
            if (less % i == 0 && greather % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public String decimalToBinary(int decimal) {
        String binary = "";
        while (decimal >= 1) {
            binary = binary.concat(String.valueOf(decimal % 2));
            decimal = decimal / 2;
        }
//        StringBuffer sb = new StringBuffer(binary);
////        return sb.reverse().toString();
        return new StringBuffer(binary).reverse().toString();
    }

    public int binaryToDecimal(String binary) {
        int decimal = 0;
        for (int i = 0; i < binary.length(); i++) {
            decimal = decimal + (((int) binary.charAt(i) - 48) * potegowanie(2, (binary.length() - 1) - i));

        }
        return decimal;
    }

    public boolean czyPierwsza(int x) {
        int counter = 0;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                counter++;
                System.out.println(counter);
            }
        }
        return counter == 0 && x != 1 ? true : false;
    }

    public void liczbyPierwsze(int n) {
        LocalTime lt_start= LocalTime.now();
        int counter = 0;
        int i = 2;
        while (counter < n) {
            if (czyPierwsza(i)) {
                counter++;
                System.out.print(i + " ");
            }
            i++;
        }
        LocalTime lt_stop=LocalTime.now();
        Duration time_interval=Duration.between(lt_start,lt_stop);
        System.out.println("\nCzas wykonywania: "+time_interval);
    }
}
