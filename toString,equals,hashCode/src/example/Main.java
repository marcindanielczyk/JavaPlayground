package example;

//sprobuj uzyc importu statycznego dla wybranej metody/pola



public class Main {

    public static void main(String[] args) {

        //tworzenie nowego obiektu, jest tez instancja danej klasy, w tym wypadku Karton
        Karton czerwony = new Karton();
        czerwony.nazwa = "Pilos";
        czerwony.ilosc = 2;
        czerwony.coto = "Mleko";

        Karton czarny = new Karton();
        czarny.nazwa = "Top Cola";
        czarny.ilosc = 1;
        czarny.coto = "Coca-Cola";


        //dla Karton
        //metoda klasy Karton wywolana na obiekcie czerwony albo czarny
        czerwony.wypij(true);
        czarny.wypij(false);
        czerwony.wypij(false);

        //jak mam pole statyczne w klasie, to sprawdzam w całej klasie
        System.out.println("Wypili: " + Karton.ileRazyWypili() + " razy");

        //ale moge tez nie miec statycznego wtedy by było tak
        System.out.println("Wypili: " + czerwony.IleRazyBezStatic() + "razy");
        //no bo jak nie ma statycznego to nie ma dostepu do całej klasy tylko do danego obiektu to robimy


        System.out.println("-----------------");


        //tworzenie nowego obiektu
        Karton1 czerwony1 = new Karton1();
        //pola obiektów chyba
        czerwony1.nazwa = "Veroni";
        czerwony1.ilosc = 3;
        czerwony1.coto = "Woda";

        Karton1 czarny1 = new Karton1();
        czarny1.nazwa = "Top Lemon";
        czarny1.ilosc = 5;
        czarny1.coto = "Sprite";

        //dla Karton1
        //metody obiektu
        String przyklad = czerwony1.wypij1(false);
        System.out.println(przyklad);
        String przyklad1 = czarny1.wypij1(true);
        System.out.println(przyklad1);

        System.out.println("albo tak w sumie");

        System.out.println(czerwony1.wypij1(false));
        System.out.println(czarny1.wypij1(true));


        System.out.println("--------------------");


        Wazon wazonik = new Wazon();
        wazonik.color = "white";
        wazonik.height = 10;
        wazonik.width = 5;
        wazonik.eatable = false;

        int  a = 10,
             b = a;
        String name = "Maciek";
        Wazon example = wazonik;

        Wazon example2 = null;
        example2 = new Wazon();

        example.equals(czerwony); //false bo rozne klasy

        Wazon wazonik1 = new Wazon();
        wazonik1.color = "white";
        wazonik1.height = 10;
        wazonik1.width = 5;
        wazonik1.eatable = false;

        System.out.println(wazonik.toString());
        System.out.println(wazonik);

        //jakas tam metoda
        System.out.println(wazonik.kwadrat(10, 5));


        System.out.println("-----------");


        //equals() jakis inny
        //System.out.println(Objects.equals(wazonik.kwadrat(10, 5), wazonik));
        //zwykly equals()
        //System.out.println(wazonik.equals(wazonik1));
        //chyba pokazuje false,bo to sa dwa rozne obiekty o tych samych danych, ale wskazuja inne miejsce w pamieci czy cos


        //equals() jeszcze raz tylko jeszcze z ==
        System.out.println("test == test: " + ("test" == "test"));
        System.out.println("test equals test: " + ("test".equals("test")));

        System.out.println("wazonik == wazonik: " + (wazonik == wazonik));
        System.out.println("wazonik equals wazonik: " + (wazonik.equals(wazonik)));

        System.out.println("wazonik == wazonik1: " + (wazonik == wazonik1));
        System.out.println("wazonik equals wazonik1: " + (wazonik.equals(wazonik1)));

        System.out.println("wazonik == example: " + (wazonik == example));


        System.out.println("-----------");

        //hashCode()
        System.out.println("hashCode dla wazonika: " + wazonik.hashCode());
        System.out.println("hashCode dla wazonika1: " + wazonik1.hashCode());
        System.out.println("hashCode dla czerwony: " + czerwony.hashCode());
        System.out.println("hashCode dla czerwony1: " + czerwony1.hashCode());
        System.out.println("hashCode dla czarny: " + czarny.hashCode());
        System.out.println("hashCode dla czarny1: " + czarny1.hashCode());
        //jeszcze dla hashCode musze zrobic wlasna equals, zeby sie hashCode zgadzal z wlasnym equals


        System.out.println("-----------");

        //public,private
        // zostaw dwa rozne obiekty w jednym wartosci tylko przez konstruktor, w drugim pusty konstruktor i ustawic przez setery 4)
        Modyfikatory kwadrat = new Modyfikatory(5,5,5);
        kwadrat.setA(5);
        kwadrat.getA();

        Modyfikatory innafigura = new Modyfikatory();
        innafigura.setA(5);
//        Modyfikatory.getA();
//
//        Modyfikatory.setB(13);


        System.out.println(kwadrat.pomnoz1("kwadrat"));
        System.out.println(innafigura.pomnoz1("trapez"));

        System.out.println(kwadrat.poleKwadratu());


        //final, nawet jak zdeklarowalem G to tak to wyglada, ale chyba dlatego ze jest final
        Energia energia = new Energia(10, 20, 3);

        System.out.println(energia.oblEnePot());


//Do metod klasy mogę odwołać się poprzez obiekt. true czy false - false, bo Zgadza się, do metod klasy powinniśmy odwoływać się poprzez nazwę klasy.
//Metody egzemplarza mogą operować zarówno na polach egzemplarza jak i polach klasy. true czy false - true,
//Pola egzemplarza można inicjalizować już w momencie deklaracji. true czy false true, bo Tak, polą egzemplarza można przypisać wartość używając operatora przypisania “=”.


    }
}
