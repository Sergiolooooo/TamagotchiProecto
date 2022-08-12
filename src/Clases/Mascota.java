
package Clases;

/**
 *
 * @author ADMIN
 */
public class Mascota {
    private String nombre;
    private String estado;
    private int hambre;
    private int sinHambre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getHambre() {
        return hambre;
    }

    public void setHambre(int hambre) {
        this.hambre = hambre;
    }

    public int getSinHambre() {
        return sinHambre;
    }

    public void setSinHambre(int sinHambre) {
        this.sinHambre = sinHambre;
    }
    
 
    public Mascota() {
        this.nombre="";
        this.estado="esperando";
        this.hambre=50;
        this.sinHambre=100;
    }

    public Mascota(String nombre, String estado, int hambre, int sinHambre) {
        this.nombre = nombre;
        this.estado = estado;
        this.hambre = hambre;
        this.sinHambre= sinHambre;
    }
    
    public void alimentara(int comida){
        if(this.getEstado().equals("esperando") && this.getHambre() < this.getSinHambre()){
            this.setHambre(this.getHambre()+comida);
            this.setEstado("comiendo");  
        }else{
            System.out.println("Estoy lleno o haciendo alguna otra activudad");
        }
        
    }
}
