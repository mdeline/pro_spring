/**
 * Demonstroi kuinka IoC:n Setter Dependency Injectionia on mahdollista käyttää. Tämä on siis vaihtoehto
 * konstruktorissa tapahtuvalle injektoinnille.
 *
 * Tässä ei nyt siis ole mitään sen kummempaa kuin että riippuvuus (tässä tapauksessa uuni, oven) määritellään
 * rajapinnan toteuttavassa luokassa 'MozzarellaPizza' sen sijaan, että riippuvuus määriteltäisiin jo ylemmällä
 * tasolla rajapinnassa 'Pizza'. Noin niin kuin yleisestikin ottaen ei kannata määritellä rajapinnassa mitään
 * muuta kuin bisneslogiikkaa ellei ole satavarma, että jokainen rajapinnan toteuttava luokka tarvitsee jotain
 * tiettyä riippuvuutta.
 *
 * **/
public class MozzarellaPizza implements Pizza {
    private Oven oven;
    /**
     * Konstruktorissa injektointia käytetään kun jokin riippuvuus on aivan pakko olla ennen
     * komponentin/luokan käyttöä.
     *
     * Tässä voidaan nyt miettiä onko uuni aivan pakollinen pizzanteon aloittamisen kannalta.
     * Itse sanoisin että ei (uunia ei tarvita ainesosien mittaamiseen tai sekoittamiseen), toisaalta
     * joku voisi väittää että pizzaa on mahdotonta valmistaa ilman uunia, joten se olisi hyvä määritellä
     * riippuvuudeksi alusta alkaen. Olen kuitenkin huomannut, että esim. Kotipizzan taikinapohjat toimittaa
     * lafkan keittiö, eikä pizzerian työntekijät tee pohjia itse.
     *
     * **/
    public void setOven(Oven oven) {
        this.oven = oven;
    }

    @Override
    public void measure() {
        /**
         * Mittaa
         *
         * 2 dl vettä
         * 5 dl jauhoja
         *
         * 150 g Mozzarella-juustoa
         * 400 g tomaattimurskaa
         * 2 valkosipulin kynttä
         *
         * **/

    }

    @Override
    public void mix() {
        /**
         *
         * 1. Sekoita jauhot ja vesi, veivaa letuksi
         * 2. Levitä tomaattimurska
         * 3. Viipaloi ja asettele juusto
         * 4. Murskaa valkosipuli, asettele päälle
         *
         * **/

    }

    @Override
    public void bake() {
        /**
         *
         * Paista 250 asteessa noin 10-12 minuuttia
         *
         * **/
    }
}
