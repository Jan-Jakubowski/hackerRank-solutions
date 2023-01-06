package javaChallenges.JavaGenerics;

import java.util.Scanner;

public class Solution{

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Integer intArr[] = {1, 2, 3};
        String stringArr[] = {"Hello", "World"};

        print(intArr);
        print(stringArr);
    }

    public static <T> void print(T[] arr) {

        for (T val : arr){
            System.out.println(val);
        }
    }

}
