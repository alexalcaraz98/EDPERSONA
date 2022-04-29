
public class Alumno extends Persona {

    private double notamedia;

    private Modulo[] matricula;

   
    //Metodo que emite un certificado con las competencias completadas.
    public void emitirCertificado() {
    }
    
     //Metodo que calcula la nota media
    public double calcularNotaMedia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    //Metodo que matricula al alumno.
    
    public void matricular() {
    }

     /**
      * @return notamedia
      */
     public double getNotamedia()
       {
          return notamedia;
       }

     /**
      *  notamedia set @param notamedia 
      */
     public void setNotamedia(double notamedia)
       {
          this.notamedia = notamedia;
       }

     /**
      * @return the matricula
      */
     public Modulo[] getMatricula()
       {
          return matricula;
       }

     /**
      * the matricula to set @param matricula 
      */
     public void setMatricula(Modulo[] matricula)
       {
          this.matricula = matricula;
       }
}
