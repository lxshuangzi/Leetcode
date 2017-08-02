package stu.liuxiang.leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayPartitionI {

	/**
	 * 计算数组中，两两相减所有商的和的最小值
	 * @param arg0
	 */
	public static void main(String[] arg0){
		int[] a = new int[]{3,6,4,2,5,1};
//		int[] a = new int[]{1,4,3,2};
		
		paixu2(a);
		int totalCount = 0;
		int count = a.length/2;
		for(int i = 0; i < count;i++){
			totalCount += a[2*i];
		}
		System.out.println(totalCount);
		
	}
	
	private static void arrayPartition(int[] a){
		List<Integer> mList = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			mList.add(a[i]);
		}
		for (int i = 0; i < mList.size(); i++) {
			paixu1(mList, i);
		}
		System.out.println(mList.toString());
	}
	
	private static void paixu1(List<Integer> mList,int position){
		if(position==0){
			return;
		}
		if(mList.get(position) < mList.get(position - 1)){
			int tempInt = mList.get(position);
			mList.remove(position);
			mList.add(position-1,tempInt);
			paixu1(mList, position - 1);
		}else{
			return;
		}
	}
	
	private static void paixu2(int[] a){
		for(int i = 0; i<a.length-1;i++){
			int temp;
			for(int j = 0; j<a.length-1;j++){
				if(a[j+1] < a[j]){
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
	}
}
