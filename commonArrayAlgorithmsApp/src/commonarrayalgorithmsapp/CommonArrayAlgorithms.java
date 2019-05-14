
/**
 *
 * @author ggear
 */
package commonarrayalgorithmsapp;


/*
* a class that contains array working algorthms for future use
*/
public class CommonArrayAlgorithms {
    
/*  **For Testing**  
    public static void main(String[] args)
    {
        int[] intArray = {1, 2, 3, 4};
        System.out.println(arrayToString(intArray));
    }
*/  
        //Array sum methods
        public static String arrayToString(int[] intArray)
        {
            String finalString = "";
                for (int index = 0; index < intArray.length; index++){
                String strIndex = Integer.toString(intArray[index]);
                finalString += strIndex + "|";
                                
                    }
            return finalString;
                    
        }
        
        
        public static Integer arraySum(int[] intArray)
        {
            int sum = 0;
            for (int index = 0; index < intArray.length; index++)
            {
                sum += intArray[index];    
            }
            return sum;
            
        }
        
        public static Integer arrayAvg(int[] intArray)
        {
            int avg = 0;
            int sum = 0;
            for (int index = 0; index < intArray.length; index++)
            {
                sum += intArray[index];    
            }
            avg = sum/intArray.length;
            return avg;
        }
        
        public static Integer arrayMax(int[] intArray)
        {
            int max = 0;
            for (int index = 0; index < intArray.length; index++)
            {
                if (intArray[index] > max) {max = intArray[index];}    
            }
            return max;
        }
        
        public static Integer arraySearch(int[] intArray, int value)
        {
            int index1 = -1;
            boolean search = false;
            for (int index = 0; index < intArray.length; index++)
            {
                if (intArray[index] == value) 
                {
                    index1 = intArray[index];
                        
                }    
                
            }
            return index1;
        }
        
        
        public static boolean arraySwap(int[] intArray, int index1, int index2)
        {
            
            if ((index1 < 0)||(index2 < 0)||(index1 > intArray.length)||(index1 > intArray.length))
            {
                return false;
            }
            else {
                intArray[index1] = intArray[index2];
                intArray[index2] = intArray[index1];
                return true;
            }
        }
        
            public static int[] arrayGrowDouble(int[] intArray)
            {
                int[] newIntArray = new int[intArray.length * 2];
                for (int index = 0; index < intArray.length; index++)
                {
                    newIntArray[index] = intArray[index];
                    
                }
                for (int index = intArray.length - 1; index < 2 * intArray.length; index++)
                {
                    newIntArray[index] = 0;
                    
                }
                return newIntArray;
            }
        
    
}

