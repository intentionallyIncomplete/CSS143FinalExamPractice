import java.util.ArrayList;

public class RandomAF {
	public static void main(String args[]) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(0);
		System.out.println(minToFront(list));

	}

	public static ArrayList<Integer> minToFront(ArrayList<Integer> list){
		
		int min = list.get(0).intValue();
		
		if(list.size() == 1){
			return list;
		}else{
			for(int i=1;i<list.size();i++){
	        if(list.get(i).intValue() < min){
	        	min = list.get(i);
	        	list.remove(list.indexOf(min));
	            list.add(0,min);
	        }
	    }
	    //list.remove(list.size() - 1);
	    return list;
		}
	}
}