import java.util.Scanner;

public class TransactionTarget {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Number of Days Shop was Open");
        int days = sc.nextInt();

        int[] revenue = new int[days];

        for (int i = 0; i < revenue.length; i++) {
            System.out.println("Please Enter the Collection for Each Day " + (i + 1));
            revenue[i] = sc.nextInt();
        }

        System.out.println("Please Enter Number of Targets");
        int totalTarget = sc.nextInt();
        int target, targetAchieved;

        for (int i = 1; i <= totalTarget; i++) {
            System.out.println("Please Enter Value of Target " + i);
            target = sc.nextInt();
            targetAchieved = totalTargetAchieved(revenue, target);
            System.out.println((targetAchieved > 0)
                    ? "Target Achieved on day " + targetAchieved
                    : "Target Not Achieved");
        }
    }

    private static int totalTargetAchieved(int[] revenue, int target) {
        int sum = 0;
        for (int j = 0; j < revenue.length; j++) {
            sum += revenue[j];
            if (sum >= target)
                return (j + 1);

        }
        return 0;
    }
}
