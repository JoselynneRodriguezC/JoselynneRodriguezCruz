public class Desigualdad {

    private int edad;
    private int antiguedad;
    private double resultado;
    private int jubilacion1;
    private int jubilacion2;
    private int jubilacion3;


    public Desigualdad(int edad, int antiguedad) {
        this.edad = edad;
        this.antiguedad = antiguedad;
        this.Desiguald();
        this.jubilacionn1();
        this.jubilacionn2();
        this.jubilacionn3();
    }

    public int getEdad() {return edad;}
    public void setEdad(int edad) {this.edad = edad;}

    public int getAntiguedad() {return antiguedad;}

    public void setAntiguedad(int antiguedad) {this.antiguedad = antiguedad;}

    public double getResultado(){
        return resultado;
    }

    public void setResultado(double resultado) {this.resultado = resultado;}


    public int getJubilacion1() {return jubilacion1;}

    public void setJubilacion1(int jubilacion1) {this.jubilacion1 = jubilacion1;}

    public int getJubilacion2(){return jubilacion2;}

    public void setJubilacion2(int jubilacion2) {this.jubilacion2 = jubilacion2;}

    public int getJubilacion3(){return jubilacion3;}

    public void setJubilacion3(int jubilacion3) {this.jubilacion3 = jubilacion3;}

    public void jubilacionn1(){this.jubilacion1 = 1;}
    public void  jubilacionn2(){ this.jubilacion2 = 2;}
    public void jubilacionn3(){ this.jubilacion3 = 3;}


    public void Desiguald() {
        if (this.edad < 60 & this.antiguedad > 25) {
          this.resultado  = 1;

        } else if (this.edad > 60 & this.antiguedad < 25) {
            this.resultado  = 2;

        } else if (this.edad > 60 & this.antiguedad > 25) {
           this.resultado  = 3;
        }
    }

    public static  void main(String[]args){
        Desigualdad desigualdad = new Desigualdad(14,26);
        System.out.println(desigualdad.getResultado());
    }



}
