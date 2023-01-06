package javaChallenges.abstractClass;

import java.util.Scanner;

public class Solution {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        MyBook myBook = new MyBook();
        myBook.setTitle(scanner.nextLine());

        System.out.println("The title is: " + myBook.getTitle());

    }
}
abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }
}

class MyBook extends Book{

    @Override
    void setTitle(String s) {
        title = s;
    }
}
