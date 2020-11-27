/**
 * This bean depends on the CandyProvider interface for getting the message to render.
 *
 * If you are using XML configurations, the tag attribute p:candyProvider ref="provider" tells
 * Spring that the bean’s property, CandyProvider, should be injected with another bean
 * (a bean is what an instance of a class is called in Spring).
 *
 **/
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
