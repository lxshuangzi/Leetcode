package stu.liuxiang.leetcode;

public class NumberComplement {

	public static void main(String[] args) {
		result1(22);
	}
	
	private static void result1(int a){
		int result = 0;
		String str = Integer.toBinaryString(a);
		System.out.println(str);
		for(int i = str.length();i > 0 ;i--){
			if("0".equals(String.valueOf(str.charAt(i-1)))){
				result += Math.pow(2, str.length()- 1 -(i-1));
			}
		}
		System.out.println("0" + Integer.toBinaryString(result));
	}
}
