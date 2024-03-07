public class Cat_NestedStatic {
    public class Cat {
        private String name, color;
        private int age;

        public Cat() {
        }

        public Cat(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        static class Voice {
            private final int volume;

            public Voice(int volume) {
                this.volume = volume;
            }

            public void sayMur() {
                System.out.printf("A cat purrs with volume %d\n", volume);
            }
        }

    }

    public static void main(String[] args) {
        Cat.Voice voice = new Cat.Voice(5);
        voice.sayMur();

        // Many voices - no one cat !!!
        for (int i = 0; i < 4; i++) {
            Cat.Voice voice1 = new Cat.Voice(100 + i);
            voice1.sayMur();
        }
    }
}
