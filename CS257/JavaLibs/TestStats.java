public class TestStats {
    
    /**
     * Unit tests {@code StdStats}.
     * Convert command-line arguments to array of doubles and call various methods.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {
	System.out.println("Enter an array of floating-point numbers\nFirst enter the length of the array, then that many double values...\n");
        double[] a = StdArrayIO.readDouble1D();
        System.out.printf("       min %10.3f\n", StdStats.min(a));
        System.out.printf("      mean %10.3f\n", StdStats.mean(a));
        System.out.printf("       max %10.3f\n", StdStats.max(a));
        System.out.printf("    stddev %10.3f\n", StdStats.stddev(a));
        System.out.printf("       var %10.3f\n", StdStats.var(a));
        System.out.printf("   stddevp %10.3f\n", StdStats.stddevp(a));
        System.out.printf("      varp %10.3f\n", StdStats.varp(a));
    }
}
