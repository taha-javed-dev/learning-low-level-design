package designPatterns.creational;

public class JABillPugh {
    
    private JABillPugh() {

    }

    private static class Holder {
        private static final JABillPugh INSTANCE = new JABillPugh(); 
    }

    public static JABillPugh getInstance(){
        return Holder.INSTANCE;
    }
}
