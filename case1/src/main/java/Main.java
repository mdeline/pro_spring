public class Main {
    public static void main(String... args) {
        CandyRenderer candyRenderer = new ChocoCandyRenderer();
        CandyProvider candyProvider = new ChocoCandyProvider();

        candyRenderer.setCandyProvider(candyProvider);
        candyRenderer.render();
    }
}
