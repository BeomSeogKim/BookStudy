package Chapter09;

import Chapter09.sub.Sub;

public class Package {
    public static void main(String[] args) {
        System.out.println("Package class.");;
        Sub sub = new Sub();
        sub.subClassMethod();
    }
}