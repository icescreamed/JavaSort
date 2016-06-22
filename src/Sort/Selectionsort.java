package Sort;

public class Selectionsort {
    public static void sort(int[] array){
    	int temp;
    	int max;
    	int len = array.length;
    	temp = 0;
    	for(int i=0;i<len;i++){
    		max = i;
    		for(int j = i+1;j<len;j++){
    			if(array[j]>array[max])
    				max = j;
    		}
    		temp = array[max];
    		array[max] = array[i];
    		array[i] = temp;
    	}
    }
	public static void main(String[] args) {
		int[] array = {45,22,11,66,54,3,2,90};
		ShowArray.show(array);
		sort(array);
		ShowArray.show(array);
	}

}
