import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public  static  List<String> uzupelnij(List<String> lista, int ilosc)
    {
        System.out.println("*Uzupełnianie listy*");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < ilosc; i++)
        {
            System.out.printf("Wpisz %d. zwierzę: ", i+1);
            lista.add(scan.next());
        }
        return lista;
    }

    public  static  Set<Integer> uzupelnij(Set<Integer> set, int ilosc)
    {
        System.out.println("*Uzupełnianie Set-a*");
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < ilosc; i++)
        {
            System.out.printf("Wpisz %d. liczbę: ", i+1);
            set.add(scan.nextInt());
        }
        return set;
    }

    public static void wypisz(List<String> list)
    {
        System.out.println("\n*Wypisanie listy*");
        for (String el : list)
        {
            System.out.printf("%s, ", el);
        }
        System.out.println("");
    }

    public static void wypisz(Set<Integer> set)
    {
        System.out.println("\n*Wypisanie Set-a*");
        for (int el : set)
        {
            System.out.printf("%d, ", el);
        }
        System.out.println("");
    }

    public static void usun(List<String> list, int ilosc)
    {
        int x = list.size();
        System.out.printf("\n*Usuwanie %d elementów od końca*\n", ilosc);
        for (int i = 0; i < ilosc; i++)
        {
            list.remove(x-1);
            x--;
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        /* ćw_6 Listy */

        /* zad.1 a) Napisać program który stworzy listę ArrayList<String> (lista tablicowa),
                Proszę dane wprowadzać z klawiatury (można użyć pętli), lista ma mieć przynajmniej 5
                elementów i elementami mają być nazwy zwierząt.
                b) proszę stworzyć metodę która będzie miała pętle forEach i będzie wyświetlała elementy Listy
                -- podpowiedź: for(String zmienna : List<String>)
                c) proszę usunąć 2 ostatnie elementy listy i dodać do niej 3 inne elementy,
                następnie wyświetlić listę i wielkość listy,
                d) następnie proszę wykonać odwrotne sortowanie i znów użyć metody z punktu b) do wyświetlenia
                elementów listy
          */

        System.out.println("zad 1");

        List<String> zwierzeta = new ArrayList<>();

        uzupelnij(zwierzeta, 5);
        wypisz(zwierzeta);

        usun(zwierzeta, 2);
        uzupelnij(zwierzeta, 3);
        wypisz(zwierzeta);
        System.out.println("Wielkość listy = " + zwierzeta.size());

        System.out.println("\n*Odwrotne sortowanie*");
        Collections.sort(zwierzeta, Collections.reverseOrder());
        wypisz(zwierzeta);


         /* zad.2 Napisać program który stworzy Set<Integer> i wprowadzamy 10 liczb z klawiatury
                niech liczby się powtarzają, proszę posortować a następnie wyświetlić zawartość set-a w konsoli
                 a następnie przeiterować i wyświetlić forEach-em (jak wyżej)
         */

        System.out.println("\nzad 2");

        Set<Integer> liczby = new TreeSet<>();
        uzupelnij(liczby, 10);

        System.out.println("*Wypisanie wyświetleniem Set-a*");
        System.out.println(liczby);

        System.out.println("\n*Wypisanie za pomoca forEach-em*");
        wypisz(liczby);

        //Z moich obserwacji wynika, że TreeSet sam sortuje elementy
    }

}
