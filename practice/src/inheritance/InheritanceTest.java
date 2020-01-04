package src.inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        SuperClass superClass = new ChildClass();

        System.out.println(superClass.x);
        System.out.println(superClass.y);

        ChildClass childClass = new ChildClass();
        System.out.println(childClass.z);

        ChildClass childClass2 = new ChildClass(1.0,2.0,30);
        System.out.println(childClass2.z);



    }
}
