package io.app.fiztec;

import java.util.Arrays;

public class BinarySearchDemo {

    static boolean exists(int[] arrayNumber, int numberSearch) {
        boolean existData=false;
        for (int i = 0; i < arrayNumber.length; i++) {
            if(arrayNumber[i]==numberSearch){
                existData=true;
            }
        }
        return existData;
    }

    /*
    The solution uses the J2SE API to perform the binary searc
    The solution works in a reasonable time with one million items
     */
    static boolean existsBinarySearch(int[] arrayNumber, int numberSearch) {
        boolean existData=false;
        int indextDataResult= Arrays.binarySearch(arrayNumber,numberSearch);
        if (indextDataResult>=0){
            if(numberSearch==arrayNumber[indextDataResult]){
                existData=true;
            }
        }
        return existData;
    }

}
