
public class MergeSort{
	public static void main(String a[]){

		int array[] = {12,9,3,30,-9,4,99,120,1,3,10,34,-2};
		
		System.out.println("Values after the sort: ");
		mergeSort(array,0, array.length-1);
		
		for(int i = 0; i <array.length; i++)
			System.out.print(array[i]+"  ");
		System.out.println();
	}

	public static void mergeSort(int array[],int low, int high){
		if (low >= high) {
			return;
		}
		int middle = (low + high) / 2;
		mergeSort(array, low, middle);
		mergeSort(array, middle + 1, high);
		int end_low = middle;
		int start_high = middle + 1;
		while ((low <= end_low) && (start_high <= high)) {
			if (array[low] < array[start_high]) {
				low++;
			} else {
				int Temp = array[start_high];
				for (int k = start_high- 1; k >= low; k--) {
					array[k+1] = array[k];
				}
				array[low] = Temp;
				low++;
				end_low++;
				start_high++;
			}
		}
	}  
}