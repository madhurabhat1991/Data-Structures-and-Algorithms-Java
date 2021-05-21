import java.util.Arrays;

class _01_findNemo1 {
  public static void main(String[] args) {
    String[] nemo = new String[]{"nemo"};
    String[] everyone = new String[]{"frew", "nemo", "iiem", "vyec", "mejcu", "vswqf", "ortn", "ztewn", "ptptn", "dmke"};
    String[] large = new String[10000];
    Arrays.fill(large, "nemo");

    findNemo(large);
  }

  public static void findNemo(String[] nemo){
    long t0 = System.nanoTime();
    for (String each : nemo){   // O(n)
      if (each.equals("nemo"))
      System.out.println("Found NEMO!");
    }
    long t1 = System.nanoTime();
    System.out.println("Time took: " + (t1-t0) + " nanoseconds");
    System.out.println("Time took: " + (t1-t0)/1000000 + " milliseconds");
  }
}