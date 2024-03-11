package personatge;
public class Point {
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public static Point puntoMedio(Point punt1, Point punt2) {
        double migX = (punt1.x + punt2.x) / 2;
        double migY = (punt1.y + punt2.y) / 2;
        return new Point(migX, migY);
    }
    public static double distanciaEntrePunts(Point punt1, Point punt2) {
        double distanciaX = punt2.x - punt1.x;
        double distanciaY = punt2.y - punt1.y;
        return Math.sqrt(distanciaX * distanciaX + distanciaY * distanciaY);
    }
    public static void main(String[] args) {
        // Crear tres punts
        Point puntA = new Point(1, 2);
        Point puntB = new Point(4, 6);
        Point puntC = new Point(7, 8);

        Point puntMitjAB = puntoMedio(puntA, puntB);
        Point puntMitjBC = puntoMedio(puntB, puntC);
        Point puntMitjCA = puntoMedio(puntC, puntA);

        System.out.println("Punt Mitjà AB: (" + puntMitjAB.x + ", " + puntMitjAB.y + ")");
        System.out.println("Punt Mitjà BC: (" + puntMitjBC.x + ", " + puntMitjBC.y + ")");
        System.out.println("Punt Mitjà CA: (" + puntMitjCA.x + ", " + puntMitjCA.y + ")");

        // Calcular i mostrar les distàncies
        double distanciaAB = distanciaEntrePunts(puntA, puntB);
        double distanciaBC = distanciaEntrePunts(puntB, puntC);
        double distanciaCA = distanciaEntrePunts(puntC, puntA);

        System.out.println("Distància entre A i B: " + distanciaAB);
        System.out.println("Distància entre B i C: " + distanciaBC);
        System.out.println("Distància entre C i A: " + distanciaCA);
    }
}
