package javaChallenges.JavaSingletonePattern;

public class Solution {

}

class Singleton {

    public String str;
    public static Singleton instance = null;

    private Singleton(){}

    public static Singleton getSingleInstance() {
        if(instance == null) {
            return new Singleton();
        }else {
            return instance;
        }
    }

}
