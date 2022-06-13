import java.io.*;
import java.util.ArrayList;

public class pruebaArchivos {

    private ArrayList<String> contenidoArchivo = new ArrayList<>();
    private ArrayList<Desigualdad> listaEntradas = new ArrayList<>();
    private final String rutaWindows = "C:\\Users\\Joserc\\IdeaProjects\\JoselynneCodigo\\src\\datos.txt";
    private final String rutaLinux = "/C:/Users/Joserc/IdeaProjects/JoselynneCodigo/src/datos.txt";

    public ArrayList<String> getContenidoArchivo() {
        return contenidoArchivo;
    }

    public ArrayList<Desigualdad> getListaEntrada() {
        return listaEntradas;
    }

    public void leerArchivo(){
        LeerArchivo leer = new LeerArchivo();
        this.contenidoArchivo =
                leer.leerArchivo(this.rutaLinux);
        for (int i=0; i < this.contenidoArchivo.size();i++){
            String linea = this.contenidoArchivo.get(i);
            String elementosLinea[] = linea.split("#");
            try {
                int Edad = Integer.parseInt(elementosLinea[0]);
                int Antiguedad = Integer.parseInt(elementosLinea[1]);
                listaEntradas.add(new Desigualdad(Edad,Antiguedad));
            } catch (NumberFormatException ex){
                ex.printStackTrace();
                listaEntradas.add(new Desigualdad(0,0));
            }
        }
    }

    public void escribirArchivo(ArrayList<Desigualdad> lista){
        String archivo = "resultados.csv";
        File f = new File(archivo);
        //Escritura
        try{
            FileWriter w = new FileWriter(f);
            BufferedWriter bw = new BufferedWriter(w);
            PrintWriter wr = new PrintWriter(bw);
            wr.write("");
            wr.append("EDAD,ANTIGUEAD, RESULTADO\n");
            for (int i=0; i < lista.size(); i++){
                wr.append(lista.get(i).getEdad() +
                        "," + lista.get(i).getAntiguedad()+ "," +
                        lista.get(i).getResultado() + "\n");
            }
            wr.close();
            bw.close();
        }catch(IOException e){

        }
    }

    public static void main (String args[]){
        pruebaArchivos prueba = new pruebaArchivos();
        prueba.leerArchivo();
        for (int i=0; i < prueba.getListaEntrada().size(); i++){
            System.out.println(prueba.getListaEntrada().get(i).getEdad() +
                    "\t" + prueba.getListaEntrada().get(i).getAntiguedad() +
                    "\t"+  prueba.getListaEntrada().get(i).getResultado());
        }
        prueba.escribirArchivo(prueba.getListaEntrada());

    }
}
