import java.util.Collections;
import java.util.Arrays;

public class Numbers {
	public static void main(String[] args) {

        Sort<Integer> sortInt;

        Sort<String> sortString;

        String stringArr[] = { "claude", "Phil", "lois","joel", "clark", "Arthur", "Mera", "bruce","Joel" };
        Integer num[] = {10, 3, 4, 15, 7, 1, 21,20,1985};

        sortInt = (ArrayA, incDcs, next) -> {
            Collections.sort(Arrays.asList(ArrayA));
            if(incDcs == true) {
                return ArrayA;
            }else {
                Collections.reverse(Arrays.asList(ArrayA));
                return ArrayA;

            }
        };
        sortString = (ArrayA, incDcs, next) -> {
            if(next == true) {
                Collections.sort(Arrays.asList(ArrayA));
            }else {
                Collections.sort(Arrays.asList(ArrayA), String.CASE_INSENSITIVE_ORDER);
            }
            if(incDcs == true) {
                return ArrayA;
            }else {

                Collections.reverse(Arrays.asList(ArrayA));
                return ArrayA;

            }
        };

        System.out.print("Original: ");
        printnumay(num);
        System.out.print("ascending " );
        printnumay(sortInt.sort(num, true, false));
        System.out.print("Decending: " );
        printnumay(sortInt.sort(num, false, false));

        System.out.println();
        System.out.print("Orginal order of Names: ");
        
        StringArray(stringArr);
        System.out.print("Ascening: " );
      
        StringArray(sortString.sort(stringArr, true, true));
        System.out.print("Ascending: " );

        StringArray(sortString.sort(stringArr, true, false));
        System.out.print("Desending: " );

        StringArray(sortString.sort(stringArr, false, true));
        System.out.print("Descending: " );

        StringArray(sortString.sort(stringArr, false, false));
    }

    public static void printnumay(Integer[] array) {
        System.out.print("[ ");
        for(int i=0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array[array.length-1] + " ]");
    }

    public static void StringArray(String[] array) {
        System.out.print("[");
        for(int i=0; i < array.length - 1; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println(array[array.length-1] + "]");
    }
}