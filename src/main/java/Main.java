
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
    }

    public static float[] CopyArray(float[] arrayToCopy) {
        float[] output = new float[arrayToCopy.length];

        for (int i = 0; i < arrayToCopy.length; i++) {
            output[i] = arrayToCopy[i];
        }

        return output;
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
