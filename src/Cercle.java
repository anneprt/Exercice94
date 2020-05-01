import java.util.Scanner;

public class Cercle {
    public final static int TAILLE_ECRAN = 600;
    private int x;
    private int y;
    private int r;

    public Cercle() {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Position en x :  ");
        x = lectureClavier.nextInt();
        System.out.print("Position en y :  ");
        y = lectureClavier.nextInt();
        r = rayonVérifié();
    }

    public Cercle(int centrex, int centrey) {
        x = centrex;
        y = centrey;
    }

    public Cercle(int centrex, int centrey, int rayon) {
        this(centrex, centrey);
        r = rayonVérifié(rayon);
    }

    public void agrandir(int nr) {
        r = rayonVérifié(r + nr);
    }

    private int rayonVérifié() {
        Scanner lectureClavier = new Scanner(System.in);
        int tmp;
        do {
            System.out.print("Rayon            :  ");
            tmp = lectureClavier.nextInt();
        } while (tmp < 0 || tmp > TAILLE_ECRAN);
        return tmp;
    }

    private int rayonVérifié(int tmp) {
        if (tmp < 0) return 0;
        else if (tmp > TAILLE_ECRAN) return TAILLE_ECRAN;
        else return tmp;
    }

    public void échangerAvec(Cercle autre) {
        int tmp;
        tmp = x;
        x = autre.x;
        autre.x = tmp;
        tmp = y;
        y = autre.y;
        autre.y = tmp;
    }

    public void afficher() {
        System.out.println("Centre en " + x + ", " + y);
        System.out.println("Rayon : " + r);
    }

    public double périmètre() {
        return 2 * Math.PI * r;
    }

    public void déplacer(int nx, int ny) {
        x = nx;
        y = ny;
    }
}
