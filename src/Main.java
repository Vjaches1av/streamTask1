import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static List<Integer> choosePositiveInteger(final List<Integer> list) {
        List<Integer> positiveInteger = new ArrayList<>();
        for (Integer number : list) {
            if (number.compareTo(0) > 0) {
                positiveInteger.add(number);
            }
        }
        return positiveInteger;
    }

    public static List<Integer> chooseEvenInteger(final List<Integer> list) {
        List<Integer> evenInteger = new ArrayList<>();
        for (Integer number : list) {
            if (number % 2 == 0) {
                evenInteger.add(number);
            }
        }
        return evenInteger;
    }

    public static List<Integer> sortInteger(final List<Integer> list) {
        List<Integer> sortedInteger = new ArrayList<>(list);
        sortedInteger.sort(Comparator.naturalOrder());
        return sortedInteger;
    }

    public static <T> void printCollection(final List<T> list) {
        for (T e : list) {
            System.out.print(e + " ");
        }
    }

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        printCollection(sortInteger(chooseEvenInteger(choosePositiveInteger(intList))));
    }
}