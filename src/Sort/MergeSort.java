package Sort;

public class MergeSort {
	private static int[] aux;
	//自顶向下的归并排序
    public static void sort(int[] array){
    	aux = new int[array.length];
    	sort(array,0,array.length-1);
    	
    }
    
    private static void sort(int[] array ,int low,int high){
    	if(low>= high) 
    		return;
    	int mid  = (low+high)/2;
    	sort(array,low,mid);
    	sort(array,mid+1,high);
    	merge(array,low,mid,high);
    } 
    //自底而上的归并排序
    public static void sort2(int[] array){
    	int len = array.length;
    	aux = new int[len];
    	for(int sz = 1;sz<len;sz = sz+sz){
    		for(int low = 0;low<len-sz;low+=sz+sz){
    			merge(array,low,low+sz-1,Math.min(low+sz+sz, len-1));
    		}
    	}
    	
  }
    
    private static void merge(int[] array,int low,int mid,int high){
    	int i = low ,j=mid+1;
    	for(int k=low;k<=high;k++){
    		aux[k] = array[k];
    	}
    	for(int k =low;k<=high;k++){
    		if(i>mid){
    			array[k] = aux[j++];
    		}else if(j>high){
    			array[k] = aux[i++];
    		}else if(aux[j]>aux[i]){
    			array[k] = aux[j++];
    		}else{
    			array[k] = aux[i++];
    		}
    		
    	}
    }
	public static void main(String[] args) {
		int[] array = {45,22,11,66,54,3,2,90};
		ShowArray.show(array);
		sort2(array);
		ShowArray.show(array);
		}

}


