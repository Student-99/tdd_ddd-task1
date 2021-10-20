public class Main {
    public static void main(String[] args) {
        int sumCredit = 5_000_000;
        int term = 36;
        double interestRat = 5.99;
        System.out.println(String.format("Ежемесячный платеж: %.2f", CreditCalculator.monthlyPayment(sumCredit, term,
                interestRat)));
        System.out.println(String.format("Расчет переплаты за весь период: %.2f",
                CreditCalculator.calculationOfOverpaymentForEntirePeriod(sumCredit, term, interestRat)));
        System.out.println(String.format("Общая сумма возврата: %.2f",
                CreditCalculator.calculationOfTotalAmountToBeRefundedToBank(sumCredit, term, interestRat)));
    }
}
