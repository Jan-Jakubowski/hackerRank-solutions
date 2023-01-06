package javaChallenges.JavaHashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Solution {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int numberOfPairs = scanner.nextInt();
        scanner.nextLine();

        HashSet<String> mySet = new HashSet<>();

        for (int i = 0; i < numberOfPairs; i++) {
            mySet.add(scanner.nextLine());
            System.out.println(mySet.size());
        }
    }
}
