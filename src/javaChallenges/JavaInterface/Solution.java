package javaChallenges.JavaInterface;

import com.sun.jdi.InterfaceType;

import java.util.Scanner;

public class Solution {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int num = scanner.nextInt();

        MyCalculator myCalculator = new MyCalculator();
        System.out.println("I implemented: interface " + myCalculator.getClass().getInterfaces()[0].getSimpleName());
        System.out.println(myCalculator.divisor_sum(num));
    }
}

class MyCalculator implements AdvancedArithmetic{

    public int divisor_sum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if(n % i == 0){
                sum += i;
            }
        }
        return sum;
    }

}
interface AdvancedArithmetic{
    int divisor_sum(int n);
}