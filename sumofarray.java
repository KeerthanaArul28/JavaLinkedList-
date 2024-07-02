public class sumofarray {
    
        public static void main(String[] args) {
            int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
            int sum = calculateSum(numbers);
    
            System.out.println("Sum of array elements: " + sum);
        }
    
        public static int calculateSum(int[] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }
    }
    //output:
    /*
     Sum of array elements: 50
     */
