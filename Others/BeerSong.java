public class BeerSong {
  static void main(String[] args) {
    int BeerNum = 99;
    String word = "bottles";

    while (BeerNum > 0) {
      if (BeerNum == 1)
        word = "bottle";

      System.out.print(BeerNum + " " + word + " " + "of bear on the wall, ");
      System.out.println(BeerNum + " " + word + " " + "of bear.");
      System.out.print("Take one down ");
      System.out.print("and pass it around, ");
      BeerNum = BeerNum - 1;

      if (BeerNum > 0) {
        System.out.println(BeerNum + " " + word + " " + "of bear on the wall.\n");
      } else {
        System.out.println("no more bottles of beer on the wall, ");
        System.out.print("\nNo more bottles of beer on the wall, ");
        System.out.println("no more bottles of beer.");
        System.out.print("Go to the store and buy some more, ");
        System.out.println("99 bottles of beer on the wall.");
      }
    }
  }
}