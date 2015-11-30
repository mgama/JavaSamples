import java.util.Arrays;

public class BiggestElementInArrayLessThanX {

	int[] ArrayOfIntegers =  {10,7,5,6,1,9}; 
	int x = 2;
	
	public static void main(String[] args){
		BiggestElementInArrayLessThanX test = new BiggestElementInArrayLessThanX(); 
//		test.sortArray();
		test.result(); 
	}
	
	public int result(){
		int result = 0; 
		Arrays.sort(ArrayOfIntegers);
		boolean foundResult = false; 
		System.out.println("The length of the array is " + ArrayOfIntegers.length);
		
		for (int i = 0; foundResult != true; i++){
			if(i == ArrayOfIntegers.length){
				System.out.println("Array element position is greater than Array length");
				result = this.ArrayOfIntegers[i-1];
				foundResult = true;
			}
			else{
				System.out.println("The value from the array is " + this.ArrayOfIntegers[i]);
				if(this.ArrayOfIntegers[i] < this.x){
					System.out.println("value of current element of array is less than x");
					result = this.ArrayOfIntegers[i];
				}
				if(this.ArrayOfIntegers[i] > this.x){
					System.out.println("value of current element of array is greater than x");
					foundResult = true; 
				}
				if(this.x == this.ArrayOfIntegers[i]){
					System.out.println("value of current element of array is equal to x");
					result = this.ArrayOfIntegers[i-1];
					foundResult = true; 
				}
			}
		}
		
		System.out.println("the biggest array element that is less than x is " + result);
		return result; 
	}
	
	public int[] sortArray(){
		int[] sortedArray = new int[ArrayOfIntegers.length]; 
		boolean finishedSorting = false;
		int pivot = ArrayOfIntegers[(ArrayOfIntegers.length/2)];
		System.out.println("The pivot is " + pivot);
		int leftEnd = ArrayOfIntegers[0]; 
		int rightEnd = ArrayOfIntegers[ArrayOfIntegers.length-1];
				
			for (int i = 0; finishedSorting != true; i++){
				if (leftEnd > pivot){
					sortedArray[sortedArray.length-1] = leftEnd; 
				}
				finishedSorting = true;
			}
		
		return sortedArray;
	}
}
