public class Credit {
    private int monthNumber;
    private int loanAmount;
    private float rateCredit;
    private int id;

    public Credit(int monthNumber, int loanAmount, float rateCredit, int id) {
        this.monthNumber = monthNumber;
        this.loanAmount = loanAmount;
        this.rateCredit = rateCredit;
        this.id = id;
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

    public void setId(int id) {
        this.id = id;
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

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Credit{" +
                "monthNumber=" + monthNumber +
                ", loanAmount=" + loanAmount +
                ", rateCredit=" + rateCredit +
                ", id=" + id +
                '}';
    }
}
