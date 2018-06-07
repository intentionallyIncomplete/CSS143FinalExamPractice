import java.util.ArrayList;

public class RandomAF {
	public static void main(String args[]) {

		ArrayList<String> list = new ArrayList<>();
//		list.add("one");
//		list.add("fourfivesix");
//		list.add("two");
//		list.add("three");
		System.out.println(maxLength(list));

	}

	public static int maxLength(ArrayList<String> list){

		//ArrayList<Integer> strLengths = new ArrayList<>();
		int maxLengthStr = 0;
		if(list.size() == 1){
			maxLengthStr = list.get(0).length();
		}
		for(int i=0;i<list.size()-1;i++){
			if(list.get(i).length() > maxLengthStr){
				maxLengthStr = list.get(i).length();
			}
		}
		
		
//		for(String s : list){
//			strLengths.add(s.length());
//		}
//		
//		for(int i : strLengths){
//			if(i > strLengths.indexOf(i)){
//				maxLengthStr = i;
//			}else{
//				maxLengthStr = strLengths.indexOf(i);
//			}
//		}
		return maxLengthStr;
	}
}