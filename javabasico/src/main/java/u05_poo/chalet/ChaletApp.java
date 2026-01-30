package u05_poo.chalet;


    public class ChaletApp {

        static void main() {

            Casa pisito = new Casa("Calle Falsa 123");

            pisito.crearHabitacion("cocina",12.5);
            pisito.crearHabitacion("terraza",4);
            pisito.crearHabitacion("despacho",13);
            pisito.crearHabitacion("despacho",5);

            pisito.borrarHabitacion("despacho");
            pisito.mostrarHabitaciones();

            System.out.println("La habitación más grande es " + pisito.getHabitacionMasGrande().getNombre());




        }


    }
