// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.


        // Press Shift+F10 or click the green arrow button in the gutter to run the code.


            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.

        // Here is a more complex part of the homework of  08.06.2023.
        //First of all, - finding the minimum value of the massive.
            findingLesserInt ();
            // then - the sorting. I've decided that the Quick Sorting will be the best variant,
        // because in the best case the complexity of this algorhythm equals to the O(n log n), where n - is a quantity of elements.
        // But, the worst case for this algorhythm will be O(n^2).
        int[] array = {12, 22, -23, -1, 0, 5, 56, 23, 12, 45, -67, 78, -345, 34, 1};
        int low = 12;
        int high = 345345;


      //   quicksorting ();



        }
        public static void findingLesserInt () {
        //Here is a method which finds and prints out the minimum value of the massive:
            int someBigNumber = 45353412;
            int[] someMassive = new int[]{2, 22, 12, -12, -3, 34, 54, -1, 4, 34, -56, 12, -1, 67, -78, 78, 98, 12,};
            boolean Compare = true;
            for (int i = 0; i < someMassive.length; i++) {
                // it worked with one "for" cycle and a Math. method
                int compared = Math.min(someBigNumber, someMassive[i]);
                someBigNumber = compared;
               // System.out.println(someBigNumber);


                }
            int smallestNumber = someBigNumber;
            System.out.println("The smallest number in the massive is: " + smallestNumber);
            }

    public void quicksorting(int[] array, int low, int high) {
        // here is a part where I ccould not call a method from other method to sort an array
        if (low >= high) return;
        int pivot = array[low + (high - low) / 2];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j) quicksorting(array, low, j);
        if (high > i) quicksorting(array, i, high);

        }



    }











       // System.out.println (someBigNumber);


