public class Main {

    public static void main(String[] args)
    {

        /* cw.1 pętle while */

        System.out.println("Ćw.1");
        int i =0;
        while (i<=5)
        {
        System.out.println(i);
        i++;
        }

        /* zad 1 - Napisać za pomocą pętli do-while kod który będzie iterował od liczby 1000 w dół do 0.
          Jeśli liczba będzie podzielna przez 2 ostatnie cyfry waszego indeksu (podać nr indesu z uczelni)
          to dać komunikat "liczba XX podzielna przez YY" (XX-liczba podzielna YY-podzielnik)
        */

        System.out.println("\n");
        //Nr indeksu: 56106, na potrzeby zadania wezmę środkowe liczby indeksu czyli "61"
        System.out.println("Zad.1");
        i = 1000;
        do
        {
            if (i%61==0)
            {
                System.out.printf("Liczba %s jest podzielna przez 61\n", i);
            }
        }while(--i > 0);


        /* zad 2
        a) stworzyć tablicę typu int wielkosci 5, przypisac jej dowolne wartości,
          przeiterować tablicę po elementach i wyswietlić, użyć pętli while
        b) jak wyżej tylko dla tablicy typu double[],
        c) jak wyżej dla tablicy String[], przeiterować i wyświetlić od ostatniego elementu
        */

        System.out.println("\n");
        System.out.println("Zad2");
        System.out.println("a)");
        int[] tab = new int[]{43, 234, 54, 3, 1};
        i = 0;

        while (i < tab.length)
        {
           System.out.print(tab[i] + ", ");
           i++;
        }

        System.out.println("\nb)");
        double[] tab2 = new double[]{12.3, 23.5, 1.2, 56.106, 3};
        i = 0;

        while (i < tab2.length)
        {
            System.out.print(tab2[i] + ", ");
            i++;
        }

        System.out.println("\nc)");
        String[] tab3 = new String[]{"Ala", "Ela", "Ola", "Ula", "Jola"};
        i = tab3.length;

        while (i-- > 0)
        {
            System.out.print(tab3[i] + ", ");
        }

        /* zad.3
        a) sprawdzić jak zachowuje się pętla while gdy w jej warunku damy true --> while(true)
        b) a jak gdy damy false --> while(false)
        */

        System.out.println("\n");
        System.out.println("Zad3");
        System.out.println("a)");
        /*
        //Nieskończona pętla
        while(true)
        {
            System.out.println("True");
        }

        //Program nie pozwala mi odpalić kodu dalej ze wzgledu na nieskończoną pętle
        System.out.println("\nb)");

        //Pętla nigdy się nie wykona i również program nie pozwala mi odpalić kodu
        while(false)
        {
            System.out.println("False");
        }
        */
    }
}
