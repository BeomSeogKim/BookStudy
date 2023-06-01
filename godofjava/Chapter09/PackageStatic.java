package Chapter09;

import Chapter09.sub.SubStatic;

public class PackageStatic {
    public static void main(String[] args) {
        SubStatic.subStaticMethod();
        System.out.println(SubStatic.CLASS_NAME);
    }
}