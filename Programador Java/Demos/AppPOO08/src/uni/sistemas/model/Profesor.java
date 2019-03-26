package uni.sistemas.model;

public class Profesor extends Persona {

    //atributos
    private char categoria;
    private double sueldo;
    //constructor

    public Profesor() {
    }

    public Profesor(String codigo, String nombre, char sexo, char categoria) {
        super(codigo, nombre, sexo);
        this.categoria = categoria;
    }
    //metodos get y set

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public double getSueldo() {
        switch (this.categoria) {
            case 'A':
                sueldo = 4000;
                break;
            case 'B':
                sueldo = 3000;
                break;
            case 'C':
                sueldo = 1500;
                break;
            default:
                sueldo = 750;
                break;
        }
        return sueldo;
    }

    @Override
    public String toString() {
        return super.toString()+ "\ncategoria : " + categoria + "\nsueldo : " + getSueldo();
    }
    
    

}
