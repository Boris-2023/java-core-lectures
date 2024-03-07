import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions {
    public static void main(String[] args) {
        System.out.println(div0(4, 1));
        System.out.println(div0(4, 2));

        methodB();

        TestStream ts = new TestStream();
        try {
            int i = ts.read();
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }

        System.out.println();
        TestStream1 ts1 = null;
        try {
            ts1 = new TestStream1();
            int a = ts1.read();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (ts1 != null) {
                try {
                    ts1.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        // class implements Closeable
        System.out.println("\nwith Closeable:");
        try (TestStream2 ts2 = new TestStream2()) {
            int a = ts2.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static int div0(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("parameter error!\n");
        }
        return a / b;
    }

    // checked
    public static void methodB() {
        try {
            throw new IOException("aaa");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    static class TestStream {
        int read() throws FileNotFoundException {
            new FileInputStream("file.txt");
            return 1;
        }
    }

    static class TestStream1 {
        public TestStream1() throws IOException {
            System.out.println("Construct OK");
            throw new IOException();
        }

        static int read() throws FileNotFoundException {
            new FileInputStream("file.txt");
            System.out.println("Read OK");
            return 1;
        }

        public static void close() throws IOException {
            System.out.println("Close OK");
            throw new IOException();
        }
    }

    static class TestStream2 implements Closeable {
        public TestStream2() throws IOException {
            System.out.println("Construct OK");
            //throw new IOException();
        }

        static int read() throws FileNotFoundException {
            new FileInputStream("file.txt");
            System.out.println("Read OK");
            return 1;
        }

        public void close() throws IOException {
            System.out.println("Close OK");
            throw new IOException();
        }
    }

}
