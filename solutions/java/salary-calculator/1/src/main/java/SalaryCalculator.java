public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        // Apply a 15% penalty if the employee skipped at least five days.
        return daysSkipped < 5 ? 1.0 : 0.85;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold < 20 ? 10 : 13;
    }

    public double bonusForProductsSold(int productsSold) {
        return productsSold * bonusMultiplier(productsSold);
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = (1000.00 * salaryMultiplier(daysSkipped)) + bonusForProductsSold(productsSold);
        return salary <= 2000.00 ? salary : 2000.00;
    } 
}
