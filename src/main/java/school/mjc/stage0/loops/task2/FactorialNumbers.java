package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int i = 0;
        while (i <= printToInclusive) {
            int j = 1;
            int result = 1;
            while (j <= i) {
                result *= j;
                j++;
            }
            System.out.println(result);
            i++;
        }
    }
}
