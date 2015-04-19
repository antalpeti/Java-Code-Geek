package examples.heapspace;

public class HeapSizeExample {

  public static void main(String[] args) {
    System.out.println("Total Memory (in bytes): " + Runtime.getRuntime().totalMemory());
    System.out.println("Free Memory (in bytes): " + Runtime.getRuntime().freeMemory());
    System.out.println("Max Memory (in bytes): " + Runtime.getRuntime().maxMemory());
  }
}
