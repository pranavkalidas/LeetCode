package TopInterview150;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {1, 2, 3, 4, 5};
        int[] cost = {3, 4, 5, 1, 2};
        long startTime = System.nanoTime();
        System.out.println(canCompleteCircuit2(gas, cost));
        long stopTime = System.nanoTime();
        System.out.println((stopTime - startTime) / 100 + "ms");

    }

    public static int canCompleteCircuit2(int[] gas, int[] cost) {
        int n = gas.length;
        int total_surplus = 0;
        int surplus = 0;
        int start = 0;

        for(int i = 0; i < n; i++){
            total_surplus += gas[i] - cost[i];
            surplus += gas[i] - cost[i];
            if(surplus < 0){
                surplus = 0;
                start = i + 1;
            }
        }
        return (total_surplus < 0) ? -1 : start;
        /*
        0 + 1 - 3 = -2
        -2 + 2 - 4 = -4
        -4 + 3 - 5 -6
        -6 + 4 - 1 = -3
        - 3 + 5 - 2 = 0
        if < 0 then no possible way
        if > 0 then the possible way starts where the surplus is > 0
         */
    }

    //BruteForce
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int index = 0;
        int n = gas.length;
        int m = cost.length;
        for (int i = 0; i < n; i++) {
            int tank = gas[i];
            int count = 0;
            for (int j = 0; j < m; j++) {
                int temp = (i + j) % m;
                if (tank < cost[temp]) {
                    i = i + j;
                    break;
                }
                tank = tank - cost[temp] + gas[(i + j + 1) % m];
                count++;
                if (count == m) {
                    return i;
                }
            }
        }
        return -1;
    }
}


