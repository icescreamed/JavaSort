package Sort;
//¿ìÅÅ
public class Quicksort {
    public static void sort(int[] array){
    	sort(array,0,array.length-1);
    }
    private static void sort(int[] array,int low,int high){
    	if(low>=high)
    		return;
    	int pos = partition(array,low,high);
    	sort(array,low,pos-1);
    	sort(array,pos+1,high);
    	
    }
    private static int partition(int[] array,int low,int high){
    	int i = low,j=high+1;
    	int v = array[low];
    	int temp;
    	while(true){
    		while(array[++i]>v)
    			if(i==high)
    				break;
    		while(v>array[--j])
    			if(j==low)
    				break;
    		if(i>=j)
    			break;
    		temp = array[i];
    		array[i] = array[j];
    		array[j] = temp;
    		}
    	temp = array[low];
    	array[low]  =array[j];
    	array[j] = temp;
    	return j;
    }
	public static void main(String[] args) {
		int[] array = {45,22,11,66,54,3,2,90};
		ShowArray.show(array);
		sort(array);
		ShowArray.show(array);
		}

	}


