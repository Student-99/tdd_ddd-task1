import java.math.BigDecimal;
import java.math.RoundingMode;

public class CreditCalculator {


    private static Double monthlyRate(Double interestRate) {
        return interestRate / 12 / 100;
    }

    private static Double totalBid(Double interestRate, int term) {
        Double result = Math.pow(1 + monthlyRate(interestRate), term);
        return new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }


    public static Double monthlyPayment(Integer sum, int term, Double interestRate) {
        Double totalBid = totalBid(interestRate, term);
        Double result = sum * monthlyRate(interestRate) * totalBid / (totalBid - 1);
        return new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }

    public static Double calculationOfTotalAmountToBeRefundedToBank(Integer sum, int term,
                                                                    Double interestRate) {
        Double result = monthlyPayment(sum, term, interestRate) * term;
        return new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN).doubleValue();

    }

    public static Double calculationOfOverpaymentForEntirePeriod(Integer sum, int term, Double interestRat) {
        Double result = monthlyPayment(sum, term, interestRat) * term - sum;
        return new BigDecimal(result).setScale(2, RoundingMode.HALF_EVEN).doubleValue();
    }
}
