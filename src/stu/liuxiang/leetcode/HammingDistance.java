package stu.liuxiang.leetcode;

/**
 * º∆À„∫∫√˜æ‡¿Î
 * @author liu2xiang
 *
 */
public class HammingDistance {
	
	
	public static void main(String[] args) {
		int a = 1;
		int b = 127;
		HammingDistance hm = new HammingDistance();
		// hm.test();
		System.out.println("result======" + hm.getHammingDistance1(a, b));
		System.out.println("result======" + hm.getHammingDistance2(a, b));
	}

	private int getHammingDistance1(int a, int b) {
		int z = a ^ b;
		int count = 0;
		System.out.println("a^b ==" + z);
		for(int i = 0; i < 32 ; i++){
			int z2 = z>>i;
			count += z2&1;
		}
		return count;
	}
	private int getHammingDistance2(int a,int b){
		int max = a >= b ? a : b;
		int count = 0;
		while(max!=0){
			if(a%2 != b%2){
				count ++;
			}
			a = a>>1;
			b = b>>1;
			max = max >>1;
		}
		return count;
	}
}
