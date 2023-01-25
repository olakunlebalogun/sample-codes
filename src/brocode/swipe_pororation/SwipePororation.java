package src.brocode.swipe_pororation;

import java.util.ArrayList;
import java.util.List;

public class SwipePororation {


    /**
     * What this class intends to do is to calculate the amount of money that will be paid back by merchants
     * that borrows money from Swipe and the payment plan depending on the period(number of month) the borrower intends on
     * paying back.
     * If the amount is #60 000, the borrower must pay back 30% at the point on transaction before the
     * transaction can hold.
     * The period must not exceed 6 i.e. six months
     * The charge rate for each month will be:
     * - 1 month : 8%
     * - 2 months : 7.5%
     * - 3 months : 7%
     * - 4 months : 6%
     * - 5 months : 6%
     * - 6 months : 5%
     * @author Olakunle Balogun
     *
     */



    public static void main(String[] args) {

        System.out.println(
        paymentPlan(48000.00, 0.05, 6));
    }





    private static RepaymentPlanResponse paymentPlan ( Double  amount, Double rate, Integer period) {
        Double charges = amount * rate * period;
        Double totalAmount = charges + amount;

        List<MonthlyPayment> ls = new ArrayList<>();
        // Breakdown of the payment
        Double currentAmountLeft = totalAmount;
        for (int i = 1; i <= period; i++ ) {

            MonthlyPayment monthlyPayment = new MonthlyPayment();
            monthlyPayment.setTotalAmount(totalAmount);
            monthlyPayment.setNthMonth(i);

            Double presentAmt = (amount/period) + (charges/period);
            monthlyPayment.setPresentAmount(presentAmt);
            monthlyPayment.setAmountLeft(currentAmountLeft - monthlyPayment.getPresentAmount() );

            currentAmountLeft = monthlyPayment.getAmountLeft();
            ls.add(monthlyPayment);
        }
        RepaymentPlanResponse repaymentPlanResponse = new RepaymentPlanResponse();
        repaymentPlanResponse.setCharges(charges);
        repaymentPlanResponse.setDataList(ls);

        return repaymentPlanResponse;

    }
}
