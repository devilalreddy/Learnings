package src.inheritance;

public class ChildClass extends SuperClass {
    protected  double z;
    public ChildClass() {
        System.out.println("from child class constructor");
        x = 0.0;
        y = 5.00;
        z = 15.00;
    }


    public ChildClass(double x, double y, double z) {
        System.out.println("from child class constructor special");
        this.x = 10.00;
        this.y = 9.00;
        this.z = 5.00;
    }
}
