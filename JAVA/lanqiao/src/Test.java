import java.util.*;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		List<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> list  = new ArrayList<Integer>();
		
		consist(res,list,arr);
		for(ArrayList<Integer> li:res) {
			System.out.println(li);
		}
	}
	
	public static void consist(List<ArrayList<Integer>> res,ArrayList<Integer> list,int[] arr) {
		if(list.size() == arr.length) {
			res.add(new ArrayList<>(list));
			return ;
		}
		
		for(int i = 0;i < arr.length;i++) {
			if(!list.contains(arr[i])) {
				list.add(arr[i]);
				consist(res,list,arr);
				list.remove(list.size()-1);
			}
		}
	}
}
