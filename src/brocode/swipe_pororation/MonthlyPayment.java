package src.brocode.swipe_pororation;

public class MonthlyPayment {

    private Double presentAmount;
    private Integer nthMonth;

    private Double totalAmount;
    private Double amountLeft;

    public MonthlyPayment () {

    }

    public MonthlyPayment(Double presentAmount, Integer nthMonth, Double totalAmount, Double amountLeft) {
        this.presentAmount = presentAmount;
        this.nthMonth = nthMonth;
        this.totalAmount = totalAmount;
        this.amountLeft = amountLeft;
    }

    @Override
    public String toString() {
        return "MonthlyPayment{" +
                "presentAmount=" + presentAmount +
                ", nthMonth=" + nthMonth +
                ", totalAmount=" + totalAmount +
                ", amountLeft=" + amountLeft +
                '}';
    }

    public Double getPresentAmount() {
        return presentAmount;
    }

    public void setPresentAmount(Double presentAmount) {
        this.presentAmount = presentAmount;
    }

    public Integer getNthMonth() {
        return nthMonth;
    }

    public void setNthMonth(Integer nthMonth) {
        this.nthMonth = nthMonth;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Double getAmountLeft() {
        return amountLeft;
    }

    public void setAmountLeft(Double amountLeft) {
        this.amountLeft = amountLeft;
    }
}
