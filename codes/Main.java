import java.util.*;

public class Main {

    public static List<Integer> primeNums(int n) {
        List<Integer> resultSet = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i ; j++) {
                if (i%j==0) {
                    isPrime = false;
                }
            }
            if (isPrime)
                resultSet.add(i);
        }
        return resultSet;
    }

    public static void main(String[] args) {
        List<Integer> result = primeNums(10);
        System.out.println(result);
    }
}
