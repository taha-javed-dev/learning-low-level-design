package designPatterns.creational;

public class JADoubleCheck {

    private static volatile JADoubleCheck jaDoubleCheck;
    
    private JADoubleCheck(){

    }

    public static JADoubleCheck getInstance() {
        if (jaDoubleCheck == null) {
            synchronized(JADoubleCheck.class) {
                if (jaDoubleCheck == null) {
                    jaDoubleCheck = new JADoubleCheck();
                }
            }
        }
        return jaDoubleCheck;
    }
}
