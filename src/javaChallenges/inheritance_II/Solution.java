package javaChallenges.inheritance_II;

public class Solution
{
    public static void main(String[] args) {

        Adder adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getSimpleName());
        System.out.println(adder.add(30,12) + " " + adder.add(10,3) + " " + adder.add(10, 10));
    }
}

class Arithmetic{

    public int add(int x, int y)
    {
        return x+y;
    }
}
class Adder extends Arithmetic{


}