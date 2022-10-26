package task2.solution2;

public abstract class AbstractSolutionTemplate {
    public void run(String dna) {
        String result = makeComplement(dna);
        System.out.println(result);
        System.out.println();
    }

    protected abstract String makeComplement(String dna);
}
