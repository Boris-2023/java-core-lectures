public class StringBuild {
    public static void main(String[] args) {

        String s = "Example";
        long timeStart = System.nanoTime();

        for (int i = 0; i < 50_000; i++) {
            s += i;
        }
        double deltaTime = (System.nanoTime() - timeStart) * .000000001;
        System.out.println("time elapsed String (sec): " + deltaTime);

        StringBuilder sb = new StringBuilder("Example");
        timeStart = System.nanoTime();

        for (int i = 0; i < 50_000; i++) {
            sb.append(i);
        }
        deltaTime = (System.nanoTime() - timeStart) * .000000001;
        System.out.println("time elapsed SBuilder (sec): " + deltaTime);

        System.out.println(s.equals(sb.toString()));


    }
}
