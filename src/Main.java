public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */

        System.out.println("Zad 1");
        System.out.println("\na)");

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.print(i + " ");
        }
        // continue powoduje przerwanie obecnego obiegu pętli i kontynuuje ją dalej zaczynając od kolejnego obiegu.

        System.out.println("\nb)");

        for (int i = 0; i <= 10; i++) {
            if (i == 5)
                break;
            System.out.print(i + " ");
        }
        // break całkowicie zatrzymuje pętle i z niej wychodzi, nie jest ona dalej wykonywana,
        // ale nie wychodzi z metody i wykonuje dalej kod.

        System.out.println("\nc)");

        for (int i = 0; i <= 10; i++) {
            if (i == 7)
                return;
            System.out.print(i + " ");
        }
        // return również kończy pętle i w niech wychodzi, ale dodatkowo kończy działanie metody.
        // np. gdybyśmy ten przykład dali jako b) to c) nigdy byśmy nie zobaczyli
    }
}
