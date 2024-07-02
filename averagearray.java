public class averagearray {
    
        public static void main(String[] args) {
            int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
            double average = calculateAverage(numbers);
    
            System.out.println("Average of array elements: " + average);
        }
    
        public static double calculateAverage(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return (double) sum / array.length;
        }
    }
    
//output:
/*
 
  Average of array elements: 5.555555555555555  
 */
