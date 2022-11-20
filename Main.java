public class Main {
    private static java.lang.String String;
    private static Object cout;

    public static void main(String[] args) {
        //Nama : Zesica Fitriani
        //NPM : 22552011217
        // Kelas : TIFPK22
        /// soal no 1
        /////0  1  2 3 4  5  6
        int[] intArray = {10,35,-15,7,45,1,-22,110,-80,20,120,87,5,4,13};

        for(int lastUnsortedIndex = intArray.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i + 1]){
                    swap(intArray, i , i+ 1);
                }
            }
        }
        for( int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void swap (int[] array, int i, int j){
        if(i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}