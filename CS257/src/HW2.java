public class HW2 {
    public static void main(String[] args) {
//        hailstone();
//        fibonacci();
    }
    static void hailstone(){
        int seed = 5;
        System.out.println("Starting value = " + seed);

        do {
            if (seed % 2 == 1) {
                seed = seed * 3 + 1;
            } else {
                seed = seed / 2;
            }
            System.out.println("Next value = " + seed);
        } while (seed != 1);

        System.out.println("STUCK!");
    }

    static void fibonacci() {
        int fib, newfib = 1, oldfib = 1;
        System.out.println(oldfib);
        System.out.println(newfib);

        for (int k = 1; k <= 16; k++){
            fib = newfib + oldfib;
            oldfib = newfib;
            newfib = fib;
            System.out.println(newfib);
        }
    }
}
