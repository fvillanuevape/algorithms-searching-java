package io.app.fiztec;

public class TestBinarySearchDemo {
    public static void main(String[] args) {

        int[] arrayNumbers = {-9, 14, 37, 102,34,344,332,2234,22,1542,124,7,678};
        int numberSearch=100;

        //boolean resultbinarySearch= BinarySearchDemo.existsBinarySearch(arrayNumbers,numberSearch);
        boolean resultbinarySearch= BinarySearchDemo.exists(arrayNumbers,numberSearch);

        System.out.println("The result is:" + resultbinarySearch);
    }
}
