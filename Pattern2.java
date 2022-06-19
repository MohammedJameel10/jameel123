public class Pattern2 {
    public static void main(String[] args) {
        int i, j;
        // pattern for I
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 5; j++) {
                if (j == 5 / 2 || i == 0 || i == 7 - 1) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        // Pattern for N
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 7; j++) {
                if (j == 0 || j == (7 - 1) || i == j) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        // Pattern for E
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 5; j++) {
                if (i % 3 == 0 || j == 0) {
                    System.out.print("*" + " ");

                } else {
                    System.out.print("");
                }
            }
            System.out.println();
        }
        // Pattern for U
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 7; j++) {
                if ((j == 0 || j == 6) && i < 5 || i - j == 4 || i + j == 10 || i * j == 18) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        // Pattern for R
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 7 / 2 + 1; j++) {
                if (j == 0 || j == i + 1 || i + j == 7 / 2 + 2 || i == (j + 7 / 2)) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
        // Pattern for O
        for (i = 1; i < 8; i++) {
            for (j = 1; j < 8; j++) {
                if (i + j == 4 || i * j == 4 || j - i == 4 || i - j == 4 || j * j == 28 || i + j == 12) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }

            }
            System.out.println();
        }
        // Pattern for N
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 7; j++) {
                if (j == 0 || j == (7 - 1) || i == j) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
