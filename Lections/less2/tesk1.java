package Lections.less2;

public class tesk1 {
    public static void main(String[] args) {
        // Обработайте возможные исключительные ситуации.
        // "Битые" значения в исходном массиве считайте нулями.
        // Можно внести в вод правки, которые считаете необходимыми
        String[][] arr = { { null, "0", "d" }, { "1", "0", "2" }, { "ш", "0", "2" } };
        System.out.println(sum2d(arr));
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        int val = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                try {
                    val = Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    val = 0;
                }
                if (arr[i][j] == null) {
                    val = 0;
                }

                sum += val;
            }
        }
        return sum;
    }
}
