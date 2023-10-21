package week1day5.P4IOPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
* Write a method to convert the given byte array back into a file:
* [104, 116, 116, 112, 115, 58, 47, 47, 119, 119, 119, 46, 121, 111, 117, 116, 117, 98, 101, 46, 99, 111, 109, 47, 119, 97, 116, 99, 104, 63, 118, 61, 100, 81, 119, 52, 119, 57, 87, 103, 88, 99, 81]
* */
public class IOByteArray {
    public static void main(String[] args) {
        try {
            // convert file to byte array
            byte[] byteArray = new byte[]{104, 116, 116, 112, 115, 58, 47, 47, 119, 119, 119, 46, 121, 111, 117, 116, 117, 98, 101, 46, 99, 111, 109, 47, 119, 97, 116, 99, 104, 63, 118, 61, 100, 81, 119, 52, 119, 57, 87, 103, 88, 99, 81};
            byte[] bytes = new byte[]{104, 101, 108, 108, 111};
            System.out.println(Arrays.toString(byteArray));
            writeToFile(bytes, "D:\\english\\beaconfire\\assignment\\src\\main\\java\\week1day5\\P4IOPractice\\P4Output1.txt");
            writeToFile(byteArray, "D:\\english\\beaconfire\\assignment\\src\\main\\java\\week1day5\\P4IOPractice\\P4Output2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static byte[] convertToByteArray(File file) throws IOException{
        // create an instance to read from a file
        FileInputStream fin = new FileInputStream(file);

        // create byte array of same length as file
        byte[] arr = new byte[(int)file.length()];

        // read bytes of data from the file input stream into an array of bytes
        fin.read(arr);

        fin.close();
        return arr;
    }

    public static void writeToFile(byte[] bytes, String outputFilePath) throws IOException {
        File outputFile = new File(outputFilePath);

        try (FileOutputStream fos = new FileOutputStream(outputFile)) {
            fos.write(bytes);
        } catch (IOException e) {
            throw new IOException("An error occurred while writing to the file", e);
        }
    }
}
