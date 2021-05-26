package Collections.Arrays;

public class DynamicArray {
//create a dynamic array

    public static void main(String[] args) {

        IntArray intArray = new IntArray(5);
        intArray.add(5);
        intArray.add(10);
        intArray.add(12);
        intArray.add(13);
        intArray.add(15);

        System.out.println("Array:- "+intArray.toString());
        System.out.println("Size:- "+intArray.size());
        try {
            System.out.println("Element at index:- "+intArray.get(4));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        System.out.println("Reverse Array :- "+intArray.reverse());





    }

}
