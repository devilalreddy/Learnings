package factorydesignpattern;

public class MainDesign {
    public static void main(String[] args) {
        FactoryOperatingSystem operatingSystem = new FactoryOperatingSystem();
       OS osType = operatingSystem.getInstance("Android");
        osType.spec();
        OS iOS = operatingSystem.getInstance("IOS");
        iOS.spec();
        OS windowsOs = operatingSystem.getInstance("Windows");
        windowsOs.spec();
        OS otherOS = operatingSystem.getInstance("IsThereSomeDifferent");
        otherOS.spec();

    }
}
