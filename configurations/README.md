# Configuring the Spring Beans
Esimerkit eri tavoista konffata Springin papuja.

### XML-konfigurointi
Tyypillinen pre-Spring3 -konffaustapa. Hyödyllinen jos halutaan keskittää kaikki papujen määrittelyt yhteen paikkaan.

* ClassPathXmlApplicationContext -rajapinta
* GenericXmlApplicationContext -rajapinta

### XML-konfigurointi annotaatiotuella
app-context.xml hakee papujen määrittelyt component-scan -tagin avulla.

* ClassPathXmlApplicationContext -rajapinta
* GenericXmlApplicationContext -rajapinta

### Annotaatio-konfigurointi (ts. Java-lähtöinen konffaus)
* AnnotationConfigApplicationContext -rajapinta

Riippuvuudet voidaan lisäksi injektoida joko konstruktorissa tai setterissä (konstruktoritapa on suositumpi, mutta setterilähtöisessä injektoinnissa on myös omat puolensa)

### Hybridi
Beansit annotaatioilla ja XML-vääntö @ImportResource dekoraattorilla
