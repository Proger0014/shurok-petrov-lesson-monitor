package task1.solution1;

public abstract class AbstractSolutionTemplate {
    public void run(int[] frank, int[] sam, int[] tom) {
        boolean result = game(frank, sam, tom);

        System.out.println(result);
        System.out.println();
    }

    protected abstract boolean game(int[] frank, int[] sam, int[] tom);
}
