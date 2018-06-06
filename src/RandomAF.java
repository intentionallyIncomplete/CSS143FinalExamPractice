public class RandomAF {
	public static void main(String args[]) {

		int[] list = {16, 12, 25, 44};
		System.out.println(rotateRight(list));
	}

	public static int[] rotateRight(int[] list){
	    
	    for(int i=list.length-1;i>0;i--){
	        list[0] = list[i];
	    }
	    return list;
	}
}