public class Peliculas {
    protected float calcularImporte(Alquiler contrato){
        int importe =   2*contrato.getDias();
        return importe;
    }
}
