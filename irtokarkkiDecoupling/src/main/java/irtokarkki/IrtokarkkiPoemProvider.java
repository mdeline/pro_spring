package main.java.irtokarkki;

public class IrtokarkkiPoemProvider implements PoemProvider {
    @Override
    public String getPoem() {
        return "Oon pelkkä irtokarkki kauhaistuna sekaan erilaatuisten\n" +
                "Onnekas jos kohtaan\n" +
                "Toisen samankaltaisen";
    }
}
