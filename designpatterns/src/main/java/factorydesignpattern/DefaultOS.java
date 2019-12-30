package factorydesignpattern;

public class DefaultOS implements OS {
    @Override
    public void spec() {
        System.out.println("No Other OS available for now....");
    }
}
