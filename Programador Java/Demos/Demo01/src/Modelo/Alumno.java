
package Modelo;
import java.util.Calendar;


public class Alumno {
  // atributos
    private String codigo;
    private String nombre;
    private int nota1=0;
    private int nota2=0;
    private int nota3=0;
    private double promedio;
    private String mensaje;
    private  static int N=0;
//metodos de lectura y escritura
    public String getCodigo() {
        return codigo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        GeneraCodigo();
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
        Procesar();
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
        Procesar();
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
        Procesar();
    }

    public double getPromedio() {
        return promedio;
    }
    
//constructor
    public Alumno() {
        
    }
    
// metodos para proceso de datos
  private void Procesar()
  {
      promedio=(nota1 +nota2 +nota3)/3;
      if (promedio>=14) 
          mensaje="Aprobado...";
       else if(promedio>=10 && promedio<14)
              mensaje="Sustitutorio...";
        else          
              mensaje="Desaprobado..." ;                        
  }
  
  private void GeneraCodigo()
  {
      N+=1;
      codigo="A00" + String.valueOf(N);
  }
  
  public String Fecha()
  {
      Calendar cal=Calendar.getInstance();
      String fecha=cal.get(Calendar.DATE)+"/"+cal.get(Calendar.MONTH) + "/"+cal.get(Calendar.YEAR);
      return fecha;
  }
  
  public String Hora()
  {
       Calendar cal=Calendar.getInstance();
       String hora=cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND);
       return hora;
  }
}
