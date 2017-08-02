package stu.liuxiang.leetcode;

public class NumberComplement {

	/**
	 *  给定一个正整数，对该数的二进制表示形式，从最高位的1开始向后按位取反
	 * @param args
	 */
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
