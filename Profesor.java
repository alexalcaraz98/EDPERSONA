public class Profesor extends Persona {

     /**
      * @return the NRP
      */
     public String getNRP()
       {
          return NRP;
       }

     /**
      * @param NRP the NRP to set
      */
     public void setNRP(String NRP)
       {
          this.NRP = NRP;
       }

     /**
      * @return the docencia
      */
     public Modulo[] getDocencia()
       {
          return docencia;
       }

     /**
      * @param docencia the docencia to set
      */
     public void setDocencia(Modulo[] docencia)
       {
          this.docencia = docencia;
       }

    private String NRP;

    private Modulo[] docencia;

    //Funcion que añade modulo a profesor
    public void anadirmodulo() {
    }

    //Funcion que saca el NRP
    public void setNRP() {
    }
}
