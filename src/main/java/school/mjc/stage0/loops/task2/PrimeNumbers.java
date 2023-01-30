package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while (i < printToInclusive) {
            if (i == 2 || i == 3) {
                System.out.println(i);
                i++;
                continue;
            }
            int j = 2;
            while (j <= i) {
                if (i % j == 0 && j != i )
                    break;
                if (i % j == 0 && j == i)
                    System.out.println(j);
                j++;
            }
            i++;
        }
    }
}
