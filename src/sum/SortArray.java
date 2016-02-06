package sum;

public class SortArray {
    public class MatrixTraversal {
        public int[] print(int[][] input) {
            int h = input.length;
            int w = input[0].length;

            int top = 0, right = w - 1, left = 0, bottom = h - 1;
            int[] array = new int[w * h];
            int[] row = input[top];

            int k = 0;
            for (int i = left; i <= right; i++) {
                array[k] = row[i];
                k++;
            }
            for (int i = top; i <= bottom; i++) {
                array[k] = row[i];
                k++;
            }
            return array;
        }
    }

}

/*
        1. Слева направо
          от input[0] до input[3]

        2. Сверху вниз
          от input[7] до input[15]

        3. Справа налево
          от input[15] до input[13]

        4. пройти от 9 до 5
          от input[0] до input[3]
        */