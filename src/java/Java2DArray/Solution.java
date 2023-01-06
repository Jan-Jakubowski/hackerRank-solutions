package java.Java2DArray;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();


        int currentMaxSum = Integer.MIN_VALUE;
        //[i][j] is a top left position of checked hourglass
        for (int i = 0; i < arr.size()-2; i++)
        {
            for (int j = 0; j < arr.get(i).size()-2; j++)
            {
                int currentHourglassSum = 0;
                currentHourglassSum += arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) +
                        arr.get(i+1).get(j+1) + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
                if(currentHourglassSum > currentMaxSum)
                {
                    currentMaxSum = currentHourglassSum;
                }
            }
        }
        System.out.println(currentMaxSum);
    }
}

