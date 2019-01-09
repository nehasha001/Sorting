package Assignment6;

public class SortingNumbers {

        static void printSorted(int a, int b, int c)
        {
            // Find maximum element
            int get_max = Math.max(a, Math.max(b, c));

            // Find minimum element
            int get_min = -Math.max(-a, Math.max(-b, -c));

            int get_mid = (a + b + c)
                    - (get_max + get_min);

            System.out.print(get_min + " " + get_mid
                    + " " + get_max);
        }

        // Driver code
        public static void main(String[] args)
        {

            int a = 7, b = 3, c = 28;

            printSorted(a, b, c);
        }
    }
