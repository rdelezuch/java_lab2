import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    //Metody do zadania 1

    public static int[] uzupelnij(int ilosc)
    {
        System.out.println("*Uzupełnianie tablicy*");
        int[] tab = new int[20];
        for (int i = 0; i < 20; i++)
        {
            tab[i] = ilosc;
            ilosc--;
        }
        return tab;
    }


    public static void wypisz(int[] tab)
    {
        System.out.println("*Wypisanie tablicy*");
        for (int el : tab)
        {
            System.out.printf("%d, ", el);
        }
        System.out.println("");
    }

    //Metody do zadania 2

    public  static  String[] uzupelnij2()
    {
        System.out.println("*Uzupełnianie tablicy*");
        Scanner scan = new Scanner(System.in);
        String[] tab2 = new  String[6];
        for (int i = 0; i < 6; i++)
        {
            System.out.printf("Wpisz %d. słowo: ", i+1);
            tab2[i] = scan.next();
        }
        return tab2;
    }

    public static void wypisz2(String[] tab)
    {
        System.out.println("*Wypisanie tablicy od tyłu*");
        for (int i = tab.length; i > 0; i--)
        {
            System.out.printf("%s, ", tab[i-1]);
        }
        System.out.println("");
    }

    // Metody do zadania 3

    public static void dane(String imie)
    {
        System.out.println(imie);
    }

    public static void dane(String imie, String nazwisko)
    {
        System.out.println(imie + " " + nazwisko);
    }

    public static void dane(String imie, String nazwisko, int wiek)
    {
        System.out.println(imie + " " + nazwisko + " " + wiek + " lat");
    }

    // Metody do zadania 4

    public static int suma(int a, int b)
    {
        return a+b;
    }

    public static int suma(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String[] args) {
        /* ćwiczenie 5 Metody */

        /* zad.1
        a) stworzyć tablicę typu int[20],
        b) napisać metodę która będzie uzupełniała tablicę wartościami od 40 do 20,
        c) napisać metodę, która wypisze otrzymane wartości,
        d) wstawić wywołanie metody do metody main
        */
        System.out.println("Zad 1");

        int[] tab = new int[20];
        tab = uzupelnij(40);
        wypisz(tab);

        /* zad.2
        a) stworzyc tablicę typu String[6],
        b) napisać metodę która uzupełni tablicę wartościami podawanymi z klawiatury
            (użyć do tego pętli i klasy Scanner),
        c) napisać metodę która wyświetli elementy tablicy od ostatniego elementu do elementu o indeksie 0,
        */

        System.out.println("\nZad 2");

        String[] tab2 = new String[6];
        tab2 = uzupelnij2();
        wypisz2(tab2);

        /* zad.3
        a) napisać metodę która przyjmuje 1 parametr typu String, metoda nic nie zwraca, tylko
            wyświetla w konsoli string który ma być waszym imieniem,
        b) napisać metodę o tej samej nazwie jak w punkcie a) z 2-oma parametrami typu String, która wyświetli
            wasze imie i nazwisko,
        c) napisać metodę o tej samej nazwie jak w punkcie a) i b) która przyjmuje wasze imie,
            nazwisko i wiek (int), a następnie wszystko wyświetli,
        */

        System.out.println("\nZad 3");

        String imie = "Robert";
        String nazwisko = "Deleżuch";
        int wiek = 25;

        dane(imie);
        dane(imie, nazwisko);
        dane(imie, nazwisko, wiek);


        /* zad.4
        a) napisać metodę która przyjmuje 2 parametry typu int i zwraca ich sumę, którą przypiszemy do zmiennej,
            coś takiego:                                    zmiennaA = metoda(1, 2); <-- wywołanie metody
        b) napisać metodę (nazwa ta sama co w punkcie a) która przyjmuje 3 parametry typu int i zwraca ich sumę,
            którą przypiszemy do zmiennej, coś takiego:     zmiennaB = metoda(7, 8, 9); <-- wywołanie metody
        c) wyświetlić sumę wywołań obu metod ---> print("wynik: " + (metoda(8, 9) + metoda(2, 3, 4));
        */

        System.out.println("\nZad 4");

        int A = suma(10, 23);
        System.out.println("Wynik metody dwuskładnikowej: " + A);
        int B = suma(1, 45, 7);
        System.out.println("Wynik metody trzyskładnikowej: " + B);
        System.out.println("Suma obu metod: " + (suma(10, 23) + suma(1, 45, 7)));
    }
}
