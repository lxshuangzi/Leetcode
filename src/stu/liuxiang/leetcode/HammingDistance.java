package stu.liuxiang.leetcode;

public class HammingDistance {
	public static void main(String[] args) {
		int a = 9;
		int b = 4;
		HammingDistance hm = new HammingDistance();
		// hm.test();
		System.out.println("result======" + hm.getHammingDistance1(a, b));
	}

	private int getHammingDistance1(int a, int b) {
		int z = a ^ b;
		int count = 0;
		while (true) {
			if (z / 2 > 1) {
				z = z / 2;
				count++;
			} else {
				count++;
				break;
			}
		}
		return z;
	}
}
