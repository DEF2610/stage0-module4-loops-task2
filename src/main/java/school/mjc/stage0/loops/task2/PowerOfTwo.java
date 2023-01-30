package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int i = 0;
        while (i<=power){
            int j=1;
            int result=1;
            while (j<=i){
                result=result*2;
                j++;
            }
            System.out.println(result);
            i++;
        }
    }
}
