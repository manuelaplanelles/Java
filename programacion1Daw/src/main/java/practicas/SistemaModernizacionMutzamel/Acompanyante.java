package practicas.SistemaModernizacionMutzamel;

public class Acompanyante extends MutxamelFC {
     Jugador integrante;
     String parentesco;

     public Acompanyante(Jugador integrante,String parentesco){
         super(String nombre, int edad);
         this.integrante=integrante;
         this.parentesco=parentesco;
     }
     public void animarEquipo(){

     }
}
