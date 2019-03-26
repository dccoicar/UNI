
package uni.sistemas.model;


public class Persona {
  //atributos
    private String codigo;
    private String nombre;
    private char sexo;
    //constructor

    public Persona() {
    }

    public Persona(String codigo, String nombre, char sexo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.sexo = sexo;
    }
    //metodos get y set

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "codigo : " + codigo +
               "\nnombre : " + nombre +
               "\nsexo : " + sexo;
    }
    
    
    
}
