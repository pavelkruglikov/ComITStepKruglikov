package DZ_2_1107;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
    static class Digit {
        String[] lines;

        public Digit(String... lines) {
            this.lines = lines;
        }

        /**
         * ������� ��� �������� �������� ������� Digit[] �� �������� ������
         * �������� ������ � ������������� ��������,
         * ������ �������������� �������� ������ (�� ���� ��������� `lines`) ������ ������������� ���, ���������� �������
         *
         * @param lines �������� ������ � ���� ����� � �������� ������� 0-9, ����� ��������� ��������
         * @return ������ ����� 10
         */
        public static Digit[] createDigits(String... lines) {
            int height = lines.length;
            int width = (lines[0].length() - 9 /* ������ ���� => ������ �������� */) / 10;
            return IntStream
                    .range(0, 10)  // Stream �� ���� 0-9
                    .mapToObj(digit ->
                            new Digit(Stream
                                    .of(lines)
                                    // ����� � line ���� ��������� �������:
                                    // `width` �������� ����� `0`, ������,
                                    // `width` �������� ����� `1`, ������,
                                    // ...
                                    .map(line -> line.substring(digit * (width + 1), (digit + 1) * (width + 1) - 1))
                                    .toArray(String[]::new))
                    ).toArray(Digit[]::new);
        }
    }

    public static void main(String[] args) {
        Digit[] digits = Digit.createDigits(
                "  ###      #     #####   #####  #       #######  #####  #######  #####   ##### ",
                " #   #    ##    #     # #     # #    #  #       #     # #    #  #     # #     #",
                "#     #  # #          #       # #    #  #       #           #   #     # #     #",
                "#     #    #     #####   #####  #    #  ######  ######     #     #####   ######",
                "#     #    #    #             # #######       # #     #   #     #     #       #",
                " #   #     #    #       #     #      #  #     # #     #   #     #     # #     #",
                "  ###    #####  #######  #####       #   #####   #####    #      #####   ##### "
        );
        int height = digits[0].lines.length;

        // ����� 5781, ��� �������� ��� �������� �� �����
        int[] number = {1, 2, 8, 8};
        for (int i = 0; i < height; i++) {
            for (int digit : number) {
                System.out.print(digits[digit].lines[i] + " ");
            }
            System.out.println();
        }
    }
}
