package main.java.irtokarkki;

public class IrtokarkkiDecoupled {
    public static void main(String... args) {
        PoemRenderer poemRenderer = new IrtokarkkiPoemRenderer();
        PoemProvider poemProvider = new IrtokarkkiPoemProvider();

        poemRenderer.setPoemProvider(poemProvider);
        poemRenderer.render();
    }
}

