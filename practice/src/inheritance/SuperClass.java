package src.inheritance;

public class SuperClass extends  Object{
    protected  double x ;
    protected  double y;

    public SuperClass() {
    }

    public SuperClass (double x, double y){
        System.out.println("from super class constructor ");
        x = 10.00;
        y = 12.00;
    }
}
