public class App {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//
//        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Shift+F9 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Ctrl+F8.
//            System.out.println("i = " + i);
        // }
//        arrayTask();
//        arrayTask2();
//        compareStringSize();
        palindromeString("MOM");
        palindromeString("TEST");



    }

    public static int[] arrayTask() {
        int[] array = {2, 3, 6, 711, 3, 9};
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array2[i] = array[i];
                System.out.println(array2[i]);
            }


        }

        return array2;


    }

    public static void arrayTask2() {
        int[] array = {2, 3, 6, 711, 3, 9};
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                array2[i] = array[i];
                System.out.println(array2[i]);
            }


        }

    }

    public static void compareStringSize() {
        String[] word = {"car", "ball", "this is more long word", "one more long long word", "monster truck"};
        String longest = "";

        for (int i = 0; i < word.length; i++) {

            if (word[i].length() > longest.length()) {
                longest = word[i];
            }


        }
        System.out.println(longest);


    }

    public static void fibonnaci(int n){
        int[] fibonnaci = new int[n];
        fibonnaci[0] = 0;
        fibonnaci[1]=1;
        for(int i=2;i<n;i++){
            fibonnaci[i]=fibonnaci[i-1]+fibonnaci[i-2];
        }
        for(int i=0;i<fibonnaci.length;i++){
            System.out.println(fibonnaci[i]);
        }
    }

    public static void palindromeString(String word){
        String wordReversed = new StringBuilder(word).reverse().toString();
        if(word.equals(wordReversed)){
            System.out.println("Word is palindrome "+word);
        }
        else{
            System.out.println("Word is NOT palindrome "+word);
        }

    }


}
