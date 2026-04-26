package MagicSquare;

public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);

            int number = 1;
            int row = 0;
            int col = size / 2;

            while (number <= size * size) {
                square.square[row][col] = number;

                if (number % size == 0) {
                    row++;
                } else {
                    row--;
                    col++;
                }

                if (row < 0) {
                    row = size - 1;
                }

                if (col == size) {
                    col = 0;
                }

                number++;
            }
        return square;
    }

}
