package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        int i = 1;
        System.out.println(i);
        while (i < printToInclusive +1){
            factorial *=i;
            System.out.println(factorial);
            i+=1;
        }

    }
}
