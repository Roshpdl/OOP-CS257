public class TestRandom {
    /**
     * Unit tests the methods in StdStats.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
	if (args.length == 0) {
	    System.out.println("Usage: java TestStats iterations [seed]");
	    return;
	}
	
        int n = Integer.parseInt(args[0]);
	
        if (args.length == 2) {
	   StdRandom.setSeed(Long.parseLong(args[1]));
	}
	
        double[] probabilities = { 0.5, 0.3, 0.1, 0.1 };
        int[] frequencies = { 5, 3, 1, 1 };
        String[] a = "A B C D E F G".split(" ");

        System.out.println("seed = " + StdRandom.getSeed());
        for (int i = 0; i < n; i++) {
            System.out.printf("%2d ",   StdRandom.uniformInt(100));
            System.out.printf("%8.5f ", StdRandom.uniformDouble(10.0, 99.0));
            System.out.printf("%5b ",   StdRandom.bernoulli(0.5));
            System.out.printf("%7.5f ", StdRandom.gaussian(9.0, 0.2));
            System.out.printf("%1d ",   StdRandom.discrete(probabilities));
            System.out.printf("%1d ",   StdRandom.discrete(frequencies));
            System.out.printf("%11d ",  StdRandom.uniformLong(100000000000L));
            StdRandom.shuffle(a);
            for (String s : a)
                System.out.print(s);
            System.out.println();
        }
    }
}
