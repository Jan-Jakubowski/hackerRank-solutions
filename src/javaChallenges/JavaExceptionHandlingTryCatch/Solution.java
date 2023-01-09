package javaChallenges.JavaExceptionHandlingTryCatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Solution {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try{
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            System.out.println(x/y);
        }catch (InputMismatchException e) {
            System.out.print("java.util.InputMismatchException");
        }catch (ArithmeticException e){
            System.out.println(e.toString());
        }
    }
}
