package easy;

import java.util.Arrays;

public class AvgSalary1491 {

    public double averageWithoutSorting(int[] salary) {
        int minSalIndex = 0;
        int maxSalIndex = 0;
        double sum = 0;
        for (int i = 0; i < salary.length; ++i) {
            if (salary[minSalIndex] > salary[i]) {
                minSalIndex = i;
            }
            if (salary[maxSalIndex] < salary[i]) {
                maxSalIndex = i;
            }
            sum = sum + salary[i];
        }
        return (sum-salary[minSalIndex]-salary[maxSalIndex]) / (salary.length - 2);
    }

    public double averageWithSort(int[] salary) {
        double avg = 0;
        Arrays.sort(salary);
        for (int i = 1; i < salary.length - 1; ++i) {
            avg += salary[i];
        }
        return avg / (salary.length - 2);
    }


}
