package project.unittests;

public class BinarySearch {
    public static void main(final String args[]) {
        int c, first, last, middle;
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8 };

        for (c = 0; c < array.length; c++) {
            System.out.println(array[c]);
        }

        int search = 7;
        first = 0;
        last = array.length - 1;
        middle = (first + last) / 2;

        while (first <= last) {
            if (array[middle] < search)
                first = middle + 1;
            else if (array[middle] == search) {
                System.out.println(search + " found at location " + (middle + 1) + ".");
                break;
            } else
                last = middle - 1;

            middle = (first + last) / 2;
        }
        if (first > last)
            System.out.println(search + " isn't present in the list.\n");
    }
}
