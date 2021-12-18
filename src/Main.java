import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        /* ćw.2 pętle for */

        /* zad.1 Napisz program który będzie iterował od 100 do 0,
         *  i wyświetlał liczby które są podzielne przez ostatnią cyfrę waszego indeksu
         * (jesli tą liczbą jest 0 to przez 2 ostatnie) */

        System.out.println("Zad 1");
        //Nr indeksu : 56106
        for (int i = 100; i > 0; i--)
        {
            if (i % 6 == 0)
            {
                System.out.printf("Liczba %s jest podzielna przez 6\n", i);
            }
        }


        /* zad.2 Napisz program który będzie uzupełniał tablicę 5-cio elementową int[] liczbami
         * wprowadzanymi z klawiatury (użyć klasy Scanner), a następnie będzie wyświetlał elementy tablicy
         * za pomocą pętli forEach powiększone o 11 */

        System.out.println("\nZad 2");

        Scanner scan = new Scanner(System.in);
        int[] tab = new int[5];

        for(int i = 0; i<tab.length; i++)
        {
            tab[i] = scan.nextInt();
        }

        for (int el : tab)
        {
            System.out.printf("%s, ", el+11);
        }


    }
}
