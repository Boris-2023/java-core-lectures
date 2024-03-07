import java.io.*;
import java.util.Arrays;
import java.util.stream.Stream;

public class Bytes {
    public static void main(String[] args) {

        // Byte Input / OutputStream
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        out.write(1);
        out.write(-1);
        out.write(0);

        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
        int value = in.read();
        System.out.println("\n1st element: " + value);

        value = in.read();
        System.out.println("2nd element: " + value + ". If (byte) value: " + (byte) value);

        value = in.read();
        System.out.println("3rd element: " + value);


        //file I/O streams
        byte[] bytesToWrite = {0, 10, 12, 13, 14, 55, 13, 23};
        byte[] bytesToRead = new byte[10];
        File file = new File("bytes.txt");

        try {
            System.out.println("\nBegin file I/O");

            FileOutputStream outFile = new FileOutputStream(file);
            outFile.write(bytesToWrite);
            outFile.close();
            System.out.println("Bytes written!");

            FileInputStream inFile = new FileInputStream(file);
            int bytesAvailable = inFile.available();
            System.out.println("Ready to read " + bytesAvailable + " bytes");

            int cnt = inFile.read(bytesToRead, 0, bytesAvailable);
            for (int i = 0; i < cnt; i++) {
                System.out.print(bytesToRead[i] + " ");
            }

//            System.out.println();
//            bytesToRead = inFile.readAllBytes();
//            Stream.of(bytesToRead)
//                    .map(e -> e.toString() + " ")
//                    .forEach(System.out::print);

            inFile.close();


        } catch (FileNotFoundException e) {
            System.out.println("Unable to open file - " + file.getName());
        } catch (IOException e){
            System.out.println("Error I/O: " + e.toString());
        }

    }
}
