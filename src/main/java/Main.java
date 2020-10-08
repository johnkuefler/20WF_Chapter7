
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnk
 */
public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int arraySize = rand.nextInt();
        // make sure arraySIze is positive
        if (arraySize < 0) {
            arraySize *= -1;
        }
        String[] myStrings = new String[arraySize];
        System.out.println(myStrings.length);

        int[] myNumbers = new int[10];

        myNumbers[0] = 1;
        myNumbers[1] = 50;
        myNumbers[1] *= 3;
        myNumbers[1]--;
        myNumbers[1] += 5;

        PrintArray(myNumbers);

        // How not to copy an array
//        float[] myFloats = {3.4F, 4.5F, 10.0F, 1F};
//        float[] myFloats2 = myFloats;
//
//        System.out.println(myFloats);
//        System.out.println(myFloats2);
//
//        myFloats2[0] = 0;
//
//        PrintArray(myFloats);
//        PrintArray(myFloats2);

// How to copy an array correctly
        float[] myFloats = {3.4F, 4.5F, 10.0F, 1F};
        float[] myFloats2 = CopyArray(myFloats);
        myFloats2[0] = 0;
 
        PrintArray(myFloats);
        PrintArray(myFloats2);
        
        System.out.println(myFloats);
        System.out.println(myFloats2);
        
        boolean areEqual = ArrayIsEqualToOtherArray(myFloats, myFloats2);
        
        
        Rectangle[] myRooms = new Rectangle[4];
        myRooms[0] = new Rectangle(10,10);
//        myRooms[1] = new Rectangle(9,12);
//        myRooms[2] = new Rectangle(11,28);
//        myRooms[3] = new Rectangle(9,10);
//
//        double totalArea = 0;
//        for (Rectangle room : myRooms) {
//            totalArea += room.getArea();
//        }
//        System.out.println(totalArea);

        ArrayList<String> names = new ArrayList<String>();
        names.add("John");
        names.add("Bob");
        names.add("Suzy");
        
        //names.remove(0);
        names.add(2, "Test Person");
        
        System.out.println(names.toString());

        
        ArrayList<Rectangle> house = new ArrayList<Rectangle>();
        house.add(new Rectangle(10,10));
        house.add(new Rectangle(11,10));
        house.add(new Rectangle(15,10));
        house.add(new Rectangle(16,10));

        System.out.println(house.size());
        
        double totalArea = 0;
        for (Rectangle room : house) {
            totalArea += room.getArea();
        }
        
//        for (int i=0; i<house.size(); i++) {
//            Rectangle rect = house.get(i);
//        }
    }

    public static float[] CopyArray(float[] arrayToCopy) {
        float[] output = new float[arrayToCopy.length];

        for (int i = 0; i < arrayToCopy.length; i++) {
            output[i] = arrayToCopy[i];
        }

        return output;
    }
    
    public static boolean ArrayIsEqualToOtherArray(float[] array1, float[] array2) {
        
        if (array1.length != array2.length) {
            return false;
        }
        
        boolean arraysAreEqual = true;
        for (int i=0; i<array1.length; i++) {
            if (array1[i] != array2[i]) {
                arraysAreEqual = false;
            }
        }
        
        return arraysAreEqual;
    }

    public static void PrintArray(int[] arrayToPrint) {
        for (int value : arrayToPrint) {
            System.out.println(value);
        }
    }

    public static void PrintArray(float[] arrayToPrint) {
        for (int i = 0; i < arrayToPrint.length; i++) {
            System.out.println(arrayToPrint[i]);
        }
    }
}
