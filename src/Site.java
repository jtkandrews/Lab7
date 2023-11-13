public class Site {
    protected int units;
    protected int rate;
    public static final double TAX_RATE = 0.13;

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }
    public double getBaseAmount(){

    }

    public double getTaxAmount() {

    }
}
