package javaChallenges.JavaSort;

import java.util.*;

public class Solution {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int numberOfEntries = scanner.nextInt();
        scanner.nextLine();

        List<Person> students = new ArrayList<>();

        for (int i = 0; i < numberOfEntries; i++) {
            students.add(new Person(scanner.nextInt(), scanner.next(), scanner.nextDouble()));
        }

        Collections.sort(students);

        for (Person person : students){
            System.out.println(person.name);
        }

    }

}

class Person implements Comparable<Person> {
    int ID;
    String name;
    double CGPA;

    public Person(int ID, String name, double CGPA) {
        this.ID = ID;
        this.name = name;
        this.CGPA = CGPA;
    }

    @Override
    public int compareTo(Person s)
    {
        if(CGPA == s.CGPA && name.equals(s.name)){
            return ID - s.ID;
        }
        else if(CGPA == s.CGPA){
            return name.compareTo(s.name);
        }
        if(CGPA > s.CGPA){
            return -1;
        }
        return 1;
    }
}
