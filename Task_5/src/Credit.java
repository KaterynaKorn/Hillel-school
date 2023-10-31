public class Credit {
    private int monthNumber;
    private int loanAmount;
    private float rateCredit;

    public Credit(int monthNumber, int loanAmount, float rateCredit) {
        this.monthNumber = monthNumber;
        this.loanAmount = loanAmount;
        this.rateCredit = rateCredit;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public void setLoanAmount(int loanAmount) {
        this.loanAmount = loanAmount;
    }

    public void setRateCredit(float rateCredit) {
        this.rateCredit = rateCredit;
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public int getLoanAmount() {
        return loanAmount;
    }

    public float getRateCredit() {
        return rateCredit;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "monthNumber=" + monthNumber +
                ", loanAmount=" + loanAmount +
                ", rateCredit=" + rateCredit +
                '}';
    }
}
