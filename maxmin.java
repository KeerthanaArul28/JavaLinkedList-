public class maxmin {
    
        public static void main(String[] args) {
            int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};
            int max = findMax(numbers);
            int min = findMin(numbers);
    
            System.out.println("Maximum element: " + max);
            System.out.println("Minimum element: " + min);
        }
    
        public static int findMax(int[] array) {
            int max = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
    
        public static int findMin(int[] array) {
            int min = array[0];
            for (int i = 1; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }
    }
    //output:
    /*
     Maximum element: 12
     Minimum element: -1
     */


