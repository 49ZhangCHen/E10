public class StoreOneA extends StoreToRent {
    private boolean specialCustomer;
    private double monthlyPayment;

    public StoreOneA(boolean loanRequired, double loanAmount, int loanPaymentTerm, boolean specialCustomer) {
        super(loanRequired, loanAmount, loanPaymentTerm);
        this.specialCustomer = specialCustomer;
    }

    public void showStoreInfo() {
        System.out.println(toString());
    }

    @Override
    public double calculateLoanFinancing() {
        monthlyPayment = super.calculateLoanFinancing();
        if (specialCustomer) {
            double DISCOUNT_RATE = 0.1;
            monthlyPayment -= monthlyPayment * DISCOUNT_RATE;
        }
        return monthlyPayment;
    }

    @Override
    public String toString() {
        return super.toString() + "\n"
                + "LOAN DETAILS:\n"
                + "Loan Amount: " + getLoanAmount() + "\n"
                + "Loan Payment Term: " + getLoanPaymentTerm() + "\n"
                + "Interest Rate: " + getINTEREST_RATE() + "\n"
                + "Special Customer: " + specialCustomer + "\n"
                + "Monthly Loan Payment: " + monthlyPayment;
    }
}    