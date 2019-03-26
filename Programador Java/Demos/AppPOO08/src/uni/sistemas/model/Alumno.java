package uni.sistemas.model;

public class Alumno extends Persona {
    //atributos

    private float nota;
    private String estado;

    //constructor
    public Alumno() {
    }

    public Alumno(String codigo, String nombre, char sexo, float nota) {
        super(codigo, nombre, sexo);
        this.nota = nota;
    }

    //metodos get y set
    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public String getEstado() {
        if (this.nota > 14) {
            estado = "Aprobado";
        } else if (this.nota >= 10 && this.nota < 14) {
            estado = "Sustitutorio";
        } else {
            estado = "Desaprobado";
        }
        return estado;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nnota : " + nota + "\nestado : " + getEstado();
    }
    
    

}
