package task3.solution1;

public abstract class AbstractSolutionTemplate {
    public void run(String input) {
        String result = camelCase(input);
        System.out.println(result);
        System.out.println();
    }

    protected abstract String camelCase(String input);
}
