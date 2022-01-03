package M220103;

public class Lotto {
    public static void main(String[] args) {
        int lotto[] = new int[6];

        for (int i = 0; i < 6; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.print("로또 번호: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }
    }
}
