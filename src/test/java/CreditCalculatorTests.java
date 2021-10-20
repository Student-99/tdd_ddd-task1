import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CreditCalculatorTests {
    @Test
    void calculationOfMonthlyPaymentTest() {
        double monthlyPayment = CreditCalculator.monthlyPayment(5_000_000, 36, 5.99);
        Assertions.assertEquals(149750.0, monthlyPayment);
    }

    @Test
    void calculationOfOverpaymentForEntirePeriodTest() {
        double overpaymentForEntirePeriod = CreditCalculator.calculationOfOverpaymentForEntirePeriod(5_000_000, 36,
                5.99);
        Assertions.assertEquals(391000.0, overpaymentForEntirePeriod);
    }

    @Test
    void calculationOfTotalAmountToBeRefundedToBankTest() {
        double totalAmountToBeRefundedToBankTest =
                CreditCalculator.calculationOfTotalAmountToBeRefundedToBank(5_000_000, 36, 5.99);
        Assertions.assertEquals(5391000.0, totalAmountToBeRefundedToBankTest);
    }

}
