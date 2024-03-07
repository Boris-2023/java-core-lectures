public class Animal_MethodLocal_IC {
    void performBehavior(boolean state){
        class Brain{
            void sleep(){
                if(state){
                    System.out.println("Sleeping...");
                } else{
                    System.out.println("Not sleeping...");
                }
            }
        }
        Brain brain = new Brain();
        brain.sleep();
    }

    public static void main(String[] args) {
        Animal_MethodLocal_IC animal = new Animal_MethodLocal_IC();
        animal.performBehavior(false);
    }
}
