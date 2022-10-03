package lesson_07;

public class SalaryCalculator {

    public static void main(String[] args) {
        FTE fte = new FTE();
        Contractor contractor = new Contractor();

        int totalFtes = 3;
        int totalContractors = 2;

        // Total monthly salary
        int totalFteSalary = fte.Salary() * totalFtes;
        int totalContractorSalary = contractor.Salary() * totalContractors;
    }
}
