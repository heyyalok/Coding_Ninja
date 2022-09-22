package lecture_03;

 class solution1 {
	public static void mergeSort (int [] array , int startIndex, int endIndex) 
	{
		int mid = (startIndex+endIndex)/2;
		mergeSort (array, startIndex, mid);
		mergeSort (array, mid+1,endIndex);
		merge(array, startIndex, endIndex);
	}
	private static void merge (int array[],int startIndex, int endIndex ) 
	{
		if (array.length<=1) 
		{
			return ;
		}
		int mid = (startIndex + endIndex)/2;
		int j = mid+1;
		int finalarray[] = new int [array.length];
		int k = 0;
		while (startIndex<=mid && j<=array.length-1) 
		{
			if (array[startIndex]<array[j]) 
			{
				finalarray[k]= array[startIndex];
				k++;
				startIndex++;
			}
			else 
			{
				finalarray[k]= array[j];
				j++;
				k++;
			}
		}
		while (startIndex<=mid) 
		{
			finalarray[k] = array[startIndex];
			k++;
			startIndex++;
		}
		while (j<=array.length-1) 
		{
			finalarray[k] = array[j];
			k++;
			j++;
		}
		for (int g = 0; g< array.length;g++) 
		{
			array[g] = finalarray[g];
		}
	}
}