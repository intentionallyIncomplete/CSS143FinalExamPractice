public class RandomAF {
    public static void main(String args[]) {
       
      int[] list = {16, 12, 25, 44};
      System.out.println(findMin(list));
    }
    
    public static int findMin(int[] list){
        int min = list[0];
            for(int i=1;i<list.length;i++){
                if(list[i] < min){
                    min = list[i];
                }
        }
        return min;
    }
}