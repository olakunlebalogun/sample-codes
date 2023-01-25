package src.brocode.swipe_pororation;

import java.util.ArrayList;
import java.util.List;

public class RepaymentPlanResponse {
    private Double charges;
    private List<MonthlyPayment> dataList = new ArrayList<>();

    public RepaymentPlanResponse(Double charges, List<MonthlyPayment> dataList) {
        this.charges = charges;
        this.dataList = dataList;
    }

    public RepaymentPlanResponse() {
    }

    public void setCharges(Double charges) {
        this.charges = charges;
    }

    public void setDataList(List<MonthlyPayment> dataList) {
        this.dataList = dataList;
    }

    @Override
    public String toString() {
        return "RepaymentPlanResponse{" +
                "charges=" + charges +
                ", dataList=" + dataList +
                '}';
    }
}
