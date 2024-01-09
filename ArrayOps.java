public class ArrayOps {
    public static void main(String[] args) {
        boolean x = isSorted(new int[] {7, 5, 4, 3, -12, 1});
		System.out.println (x);
    }
    
    public static int findMissingInt (int [] array) {
        int sum = 0;
		int arraySum=0;
		for (int i = 0; i <= array.length; i++)
		{
			sum = sum + i;
		}
		for(int j = 0; j < array.length; j++){
		arraySum = arraySum + array[j];
		}
		int missing = sum - arraySum;
        return missing;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
		int [] temp = new int[array.length - 1];
		int secondMaxValue;
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
		for(int j = 0; j < temp.length; j++){
			if (temp [j] >secondMaxValue)
				secondMaxValue = temp [j];
		}
		
        return secondMaxValue;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
	boolean sameSet = false;
		for (int i = 0; i < array1.length; i++){
		sameSet = false;
			for(int j = 0; j < array2.length; j++){
				if (array1[i] == array2 [j])
				sameSet = true;	
				
			}
			if (sameSet == false)
			return sameSet;	
		}
		for (int k = 0; k < array2.length; k++){
		sameSet = false;
			for(int l = 0; l < array1.length; l++){
				if (array2[k] == array1 [l])
				sameSet = true;	
				
			}
			if (sameSet == false)
			return sameSet;	
		}
        return sameSet;
    }

    public static boolean isSorted(int [] array) {
		boolean sortedMinMax = true;
		boolean sortedMaxMin = true;
		
		for (int i = 0; i < array.length - 1; i++){
			if (array [i] > array [i+1])
				sortedMinMax = false;
			if (array [i] < array [i+1])
				sortedMaxMin = false;
		}
		
		boolean sorted = sortedMinMax || sortedMaxMin;
		
        return sorted;
    }

}
