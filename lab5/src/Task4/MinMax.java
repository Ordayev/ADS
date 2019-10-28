package Task4;

public class MinMax{
	static class Min{
		public static int getMin(int[] inputArray){
			int minValue = inputArray[0];
			for(int i=1;i<inputArray.length;i++){
		        if(inputArray[i] < minValue){
		        	minValue = inputArray[i];
		       	}
		     }
		    return minValue;
		}
		
	}
	static class Max{
		public static int getMax(int[] inputArray){
			int maxValue = inputArray[0];
		    for(int i=1; i < inputArray.length; i++){
		    	if(inputArray[i] > maxValue){
		    		maxValue = inputArray[i];
		    	}
		    }
		    return maxValue;
		}
	}
	
	
	private int[] iArray;
	int[] minmax = new int[2];
	public MinMax(int[] a){
		this.iArray = a;
	}
	public int[] minmax(){
		minmax[0] = Min.getMin(iArray);
		minmax[1] = Max.getMax(iArray);
		return minmax;
	}
	
	
	
	


}
