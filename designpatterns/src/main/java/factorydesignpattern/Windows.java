package factorydesignpattern;

public class Windows implements OS {

    @Override
    public void spec() {
        System.out.println("Windows os is installed sucessfully ....");
    }
}
