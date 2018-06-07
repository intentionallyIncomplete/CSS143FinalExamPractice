import java.util.ArrayList;

public class RandomAF {
	public static void main(String args[]) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(14);
		list.add(29);
		list.add(12);
		list.add(7);
		list.add(25);
		list.add(18);
		System.out.println(range(list));

	}

	public static int range(ArrayList<Integer> list){
	    int smallest = list.get(0); 
	    int largest = 0;
	    
	    if(list.size() == 1){
	        return 0;
	    }
	    for(int i=0;i<list.size();i++){
			if(list.get(i).intValue() > largest){
				largest = list.get(i).intValue();
			}
		}
	    for(int i=0;i<list.size();i++){
			if(list.get(i).intValue() < smallest){
				smallest = list.get(i).intValue();
			}
		}
	    int range = largest-smallest;
	    return range+1;
	}
}