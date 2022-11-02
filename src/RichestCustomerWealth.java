
//1672. Richest Customer Wealth
public class RichestCustomerWealth {
    public static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;

        for (int i = 0; i < accounts.length; i++) {
            int temp = 0;

            for (int j = 0; j < accounts[i].length; j++) {
                temp += accounts[i][j];
            }

            if (temp > maxWealth) maxWealth = temp;
        }

        return maxWealth;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};

        int ret = maximumWealth(accounts);

        System.out.println(ret);
    }
}
