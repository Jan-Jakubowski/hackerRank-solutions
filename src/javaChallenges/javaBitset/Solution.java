package javaChallenges.javaBitset;

import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        scanner.nextLine();

        BitSet bitSet1 = new BitSet(N);
        BitSet bitSet2 = new BitSet(N);

        for (int i = 0; i < M; i++) {

            switch (scanner.next())
            {
                case "AND":
                    if(scanner.nextInt() == 1)
                        bitSet1.and(bitSet2);
                    else
                        bitSet2.and(bitSet1);
                    scanner.next();
                    break;
                case "OR":
                    if(scanner.nextInt() == 1)
                        bitSet1.or(bitSet2);
                    else
                        bitSet2.or(bitSet1);
                    scanner.next();
                    break;
                case "XOR":
                    if(scanner.nextInt() == 1)
                        bitSet1.xor(bitSet2);
                    else
                        bitSet2.xor(bitSet1);
                    scanner.next();
                    break;
                case "FLIP":
                    if (scanner.nextInt() == 1)
                        bitSet1.flip(scanner.nextInt());
                    else
                        bitSet2.flip(scanner.nextInt());
                    break;
                case "SET":
                    if(scanner.nextInt() == 1)
                        bitSet1.set(scanner.nextInt());
                    else
                        bitSet2.set(scanner.nextInt());
                    break;
            }
            System.out.println(bitSet1.cardinality() + " " + bitSet2.cardinality());
        }

    }
}
