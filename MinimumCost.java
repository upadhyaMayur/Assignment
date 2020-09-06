import java.util.*;

public class MinimumCost{

    public static int costCalculation(int arr[]) {
        Arrays.sort(arr);
        int cost = 0, i = arr.length - 1;
        while (i > 1) {
            if (i == 2) {
                cost = cost + arr[0] + arr[2];
            } else {
                int x = arr[i] + arr[0] + 2 * arr[1];
                int y = arr[i] + arr[i - 1] + 2 * arr[0];
                cost = cost + Math.min(x, y);
            }
            i = i - 2;
        }
        if (arr.length == 1) {
            cost = cost + arr[0];

        } else {
            cost = cost + arr[1];
        }
        return cost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of test Cases : ");
        int testCases = sc.nextInt();
        for (int i = 0; i < testCases; i++) {
            System.out.println("Enter no of person : ");
            int numOfpersons = sc.nextInt();
            int cost[] = new int[numOfpersons];
            for (int j = 0; j < numOfpersons; j++){
            System.out.println("Enter price");
                cost[j] = sc.nextInt();
            }
            int totalCost = costCalculation(cost);
            System.out.println(totalCost);

        }
        sc.close();
    }
   

}