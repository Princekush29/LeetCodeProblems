package leetCode;
import java.util.HashSet;
import java.util.Set;

public class MinimumCommonValue2540 {

	public static void main(String[] args) {
		int nums1[] = { 2, 4 }, nums2[] = { 1, 2 };
		System.out.println(getCommon(nums1, nums2));
		System.out.println(getCommon1(nums1, nums2));
	}

	public static int getCommon(int[] nums1, int[] nums2) {

		// Method1
		Set<Integer> s = new HashSet<Integer>();
		for (Integer e : nums1) {
			s.add(e);
		}
		for (Integer e2 : nums2) {
			if (s.contains(e2))
				return e2;
		}
		return -1;
	}

	public static int getCommon1(int[] nums1, int[] nums2) {

		// Method2
		for (int i = 0; i < nums1.length; i++) {
			for (int j = 0; j < nums2.length; j++) {
				if (nums1[i] < nums2[j])
					break;
				if (nums1[i] == nums2[j]) {
					return nums1[i];
				}
			}
		}
		return -1;

	}
}