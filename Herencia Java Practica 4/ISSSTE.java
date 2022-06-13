package Herencia;

public class ISSSTE extends ClasePadre{

    private int edad;
    private  int antiguedad;

    public  ISSSTE(int edad, int antiguedad){
        if(edad < 0 || antiguedad < 0 ){
            this.edad = 0;
            this.antiguedad = 0;
        }else{
            this.edad = edad;
            this.antiguedad = antiguedad;
        }
        this.evaluarDesiguadades();
    }

    @Override
    public boolean evaluarDesiguadades() {
        if (this.edad <= 60 & this.antiguedad > 25) {
            System.out.println("Corresponde a la Jubilacion 1");

        } else if (this.edad > 60 & this.antiguedad < 25) {
            System.out.println("Corresponde a la Jubilacion 2");

        } else if (this.edad <= 60 & this.antiguedad <= 25) {
            System.out.println("Corresponde a la Jubilacion 3");

        }
        final var elResultado = getElResultado();
        return elResultado;

    }
}
