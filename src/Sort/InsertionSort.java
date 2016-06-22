package Sort;

public class InsertionSort {
    public static void sort(int[] array){
    	int len  = array.length;
    	int temp;
    	for(int i=1;i<len;i++){
    		for(int j=i;j>0;j--){
    			if(array[j]>array[j-1]){
    				temp = array[j];
    				array[j]=array[j-1];
    				array[j-1]=temp;
    			}
    		}
    	}
    }
	public static void main(String[] args) {
		int[] array = {45,22,11,66,54,3,2,90};
		ShowArray.show(array);
		sort(array);
		ShowArray.show(array);
		}

}
