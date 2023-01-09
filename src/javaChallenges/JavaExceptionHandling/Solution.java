package javaChallenges.JavaExceptionHandling;


import java.util.Scanner;

public class Solution {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        MyCalculator myCalculator = new MyCalculator();

        while(scanner.hasNext()) {

            try {
                System.out.println(myCalculator.power(scanner.nextInt(), scanner.nextInt()));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}


class MyCalculator {
    public long power(int n, int p) throws Exception{
        if(n==0 && p==0) {
            throw new Exception("n and p should not be zero.");
        }
        else if(n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        }
        return (long) Math.pow(n, p);
    }
}
