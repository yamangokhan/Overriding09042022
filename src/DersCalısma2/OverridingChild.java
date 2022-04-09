package DersCalısma2;


public class OverridingChild extends OverridingPArent {

    public static void method1() {
        System.out.println("Child Method1 calisti");
    }
   // public static void method2() {
   // System.out.println("Child Method2 calisti");
//}

    public static void main(String[] args) {
        OverridingPArent obj1 = new OverridingChild();

        obj1.method1();
        obj1.method2();
    }
}
