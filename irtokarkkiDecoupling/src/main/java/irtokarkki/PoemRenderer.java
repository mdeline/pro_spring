package main.java.irtokarkki;

public interface PoemRenderer {
    void render();
    void setPoemProvider(PoemProvider provider);
    PoemProvider getPoemProvider();
}
