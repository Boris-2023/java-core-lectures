public class StringPool {
    public static void main(String[] args) {
        String cat0 = "BestCat";
        String cat1 = "BestCat";
        String cat2 = "Best" + "Cat";
        String cat30 = "Best";
        String cat3 = cat30 + "Cat";

        System.out.println("cat0 equals to cat1: " + (cat0 == cat1));
        System.out.println("cat0 equals to cat2: " + (cat0 == cat2));
        System.out.println("cat0 equals to cat3: " + (cat0 == cat3));

    }
}
