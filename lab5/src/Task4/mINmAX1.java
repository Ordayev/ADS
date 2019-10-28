package Task4;

public class mINmAX1 {
    class Pair{
    	int a, b;
    	public Pair(int a, int b){
    		this.a = a;
    		this.b = b;
    	}
	}
    
    public Pair minmax(int[] iArray){
    	Pair minMax = new Pair(getMin(iArray), getMax(iArray));
    	return minMax;
    }
    
    
	public static int getMin(int[] inputArray){
		int minValue = inputArray[0];
		for(int i=1;i<inputArray.length;i++){
	        if(inputArray[i] < minValue){
	        	minValue = inputArray[i];
	       	}
	     }
	    return minValue;
	}
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
