// Nested classes
public class Orange_InnerClass {
    private Juice juice;
    public Orange_InnerClass(){
        this.juice = new Juice();
    }
    public void squeezeJuice(){
        System.out.println("Squeeze juice...");
        juice.flow();
    }
    private class Juice{
        public void flow(){
            System.out.println("Juice dripped...");
        }
    }



    public static void main(String[] args) {
        Orange_InnerClass orange = new Orange_InnerClass();

        orange.squeezeJuice();

    }

}
