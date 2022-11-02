import java.util.ArrayList;
import java.util.List;

//442. Find All Duplicates in an Array
public class FindAllDuplicatesInAnArray {
    public static List<Integer> findDuplicates(int[] nums) {
        int[] map = new int[100001];
        List<Integer> ret = new ArrayList<>();

        for (int i : nums) {
            map[i]++;

            if (map[i] == 2) {
                ret.add(i);
            }
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> ret = findDuplicates(nums);

        ret.forEach(i -> System.out.printf(i +" "));
    }
}
