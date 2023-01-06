package java.JavaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution
{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        Map<String, Integer> phoneBook = new HashMap<>();
        int numberOfEntries = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < numberOfEntries; i++)
        {
            phoneBook.put(scanner.nextLine(), scanner.nextInt());
            scanner.nextLine();
        }
        while (scanner.hasNext())
        {
            String person = scanner.nextLine();
            if(phoneBook.containsKey(person))
            {
                System.out.println(person + "=" + phoneBook.get(person));
            }
            else
                System.out.println("Not found");
        }
    }
}
