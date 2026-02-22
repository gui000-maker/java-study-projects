package MagicSquare;

public class Program {

    public static void main(String[] args) {
        MagicSquareFactory msFactory = new MagicSquareFactory();
        MagicSquare ms = msFactory.createMagicSquare(3);
        System.out.println(ms);

        System.out.println(ms.sumsOfColumns());
        System.out.println(ms.sumsOfRows());
        System.out.println(ms.sumsOfDiagonals());
    }
}
