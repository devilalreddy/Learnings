package factorydesignpattern;

class FactoryOperatingSystem {
    OS getInstance(String osCall) {
        if (osCall.equalsIgnoreCase("Android")) {
            return new Android();
        }
        else if (osCall.equalsIgnoreCase("IOS")) {
            return new IOS();
        }
        else if (osCall.equalsIgnoreCase("Windows")) {
            return new Windows();
        }
        else
            return new DefaultOS();

    }
}
