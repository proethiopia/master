public class fizzBuzz {
  public static void main(String[] args) throws Exception {
    for (int x = 1; x < 100; x++) {
      if (x % 3 == 0) {
        System.out.println("fizz");
      } else if (x % 5 == 0) {
        System.out.println("buzz");
      } else if (x % 5 == 0 && x % 3 == 0) {
        System.out.println("buzzfizz");
      } else {
        System.out.println(x + "this number");
      }
    }
  }
}
