public class ArrayOps {
    public static void main(String[] args) {
        boolean x = isSorted(new int[] {7, 5, 4, 3, -12, 1});
		System.out.println (x);
    }
    
    public static int findMissingInt (int [] array) {
        int sum = 0;
		int arraySum=0;
		//sum the numbers that expected to be in the array (include the missing)
		for (int i = 0; i <= array.length; i++)
		{
			sum = sum + i;
		}
		// sum the numbers that actually in the array.
		for(int j = 0; j < array.length; j++){
		arraySum = arraySum + array[j];
		}
		//find the missing number and return
		int missing = sum - arraySum;
        return missing;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
		int [] temp = new int[array.length - 1];
		int secondMaxValue;
		// Put in new array all numbers in the original except the max.
		for (int i = 1; i < array.length; i++){
			if (array [i] > max)
			{
				temp [i-1] = max;
				max = array [i];
			}
			else
			temp [i-1] = array [i];
		}
		secondMaxValue = temp [0];
		//check the max number in the new array, which is the secind max in the original array.
		for(int j = 0; j < temp.length; j++){
			if (temp [j] >secondMaxValue)
				secondMaxValue = temp [j];
		}
		
        return secondMaxValue;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
	boolean sameSet = false;
	//check that all elements in array 1 appear in array 2, if not rerurn false.
		for (int i = 0; i < array1.length; i++){
		sameSet = false;
			for(int j = 0; j < array2.length; j++){
				if (array1[i] == array2 [j])
				sameSet = true;	
				
			}
			if (sameSet == false)
			return sameSet;	
		}
		//check that all elements in array 2 appear in array 1, if not rerurn false.
		for (int k = 0; k < array2.length; k++){
		sameSet = false;
			for(int l = 0; l < array1.length; l++){
				if (array2[k] == array1 [l])
				sameSet = true;	
				
			}
			if (sameSet == false)
			return sameSet;	
		}
		//return true if 2 arrays contains The Same Elements
        return sameSet;
    }

    public static boolean isSorted(int [] array) {
		// dedine 2 boolean to check sorting , one for increase and one for decrease
		boolean sortedMinMax = true;
		boolean sortedMaxMin = true;
		// check if all elements is sorted increase or decrease. true if all elements sorted.
		for (int i = 0; i < array.length - 1; i++){
			if (array [i] > array [i+1])
				sortedMinMax = false;
			if (array [i] < array [i+1])
				sortedMaxMin = false;
		}
		// return true if it sorted (one of increase or decrease is true). 
		boolean sorted = sortedMinMax || sortedMaxMin;
		
        return sorted;
    }

}
