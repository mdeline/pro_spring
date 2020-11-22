package main.java.irtokarkki;

public class IrtokarkkiPoemRenderer implements PoemRenderer {
    private PoemProvider poemProvider;

    @Override
    public void render() {
        if (poemProvider == null) {
            throw new RuntimeException(
                    "You must set the property poemProvider of class:" +
                     IrtokarkkiPoemRenderer.class.getName());
        }
        System.out.println(poemProvider.getPoem());
    }

    @Override
    public void setPoemProvider(PoemProvider poemProvider) {
        this.poemProvider = poemProvider;
    }

    @Override
    public PoemProvider getPoemProvider() {
        return this.poemProvider;
    }
}
