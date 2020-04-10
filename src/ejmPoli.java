public class ejmPoli {
    public static void main(String[] args) {
        Alquiler alquiler   =   new Alquiler(10);

        Peliculas   peliculas   =   new Peliculas();
        System.out.println(peliculas.calcularImporte(alquiler));

        Equipo equipo   =   new Equipo();
        System.out.println(equipo.calcularImporte(alquiler));

        Juego juego =   new Juego("Nintendo");
        System.out.println(juego.calcularImporte(alquiler));

        Libro libro =   new Libro();
        System.out.println(libro.calcularImporte(alquiler));

    }
}
