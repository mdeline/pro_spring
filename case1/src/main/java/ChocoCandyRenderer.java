public class ChocoCandyRenderer implements CandyRenderer {
    private CandyProvider candyProvider;

    @Override
    public void render() {
        if (candyProvider == null) {
            throw new RuntimeException(
                "You must set the property candyProvider of class:" + CandyRenderer.class.getName());
        }
        System.out.println(candyProvider.getCandy());
    }

    @Override
    public void setCandyProvider(CandyProvider candyProvider) {
        this.candyProvider = candyProvider;
    }

    @Override
    public CandyProvider getCandyProvider() {
        return this.candyProvider;
    }
}
