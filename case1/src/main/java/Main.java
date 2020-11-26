public class Main {
    public static void main(String... args) {
        CandyRenderer chocoCandyRenderer = new ChocoCandyRenderer();
        CandyProvider chocoCandyProvider = new ChocoCandyProvider();

        chocoCandyRenderer.setCandyProvider(chocoCandyProvider);
        chocoCandyRenderer.render();
    }
}
