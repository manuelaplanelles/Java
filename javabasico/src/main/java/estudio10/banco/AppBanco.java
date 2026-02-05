package estudio10.banco;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AppBanco {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in)
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        ArrayList<Cuenta> listaCuentas = new ArrayList<>();

        String opcion = menuPrincipal();
        switch (opcion){
            case  1:
                String opcionCliente = menuClientes();
                switch (opcionCliente){
                    case 1:
                        Cliente c1 = new Cliente();
                        listaClientes.add (c1);
                    case 2:
                        System.out.println("Introduce Nombre: ");
                        String nombre = teclado.next();
                        System.out.println("Introduce Apellidos: ");
                        String apellidos = teclado.next();
                        bajas(nombre, apellidos, listaClientes);
                    case 3: //modificar
                                listado(listaClientes);
                    case 4: //lista cliente
                        listado (listaClientes);
                        System.out.println("¿Qué cliente quiere modificar?");
                }
            case 2:
                String opcionCuenta = menuCuentas();
            default:
                menuPrincipal();
        }
    }
    public static String menuPrincipal(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("MENÚ PRINCIPAL: ");
        System.out.println("[1] Mantenimiento de Clientes.");
        System.out.println("[2] Mantenimiento de Cuentas.");
        System.out.println("[x] Salida.");
        String primerMenu = teclado.next();
        return primerMenu;
    }
    public static String menuClientes (){
        System.out.println("CLIENTES: ");
        System.out.println("[1] Alta.");
        System.out.println("[2] Baja.");
        System.out.println("[3] Modificaciones.");
        System.out.println("[4] Listado de clientes.");
        System.out.println("[x] Volver al menú principal.");
        return menuClientes();
    }
    public static String menuCuentas (){
        System.out.println("CUENTAS: ");
        System.out.println("[1] Consultar cuentas clientes.");
        System.out.println("[2] Ver todas las cuentas.");
        System.out.println("[x] Volver al menú principal.");
        return menuCuentas();
    }
    public static String bajas (String nombre, String apellidos, ArrayList listaClientes){
        Iterator<Cliente> it = listaClientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            if (c.getNombre().equals(nombre) && c.getApellidos().equals(apellidos)) {
                it.remove();
                break;
            }
        }
    }
    public static String listado (ArrayList listaClientes){
        Iterator<Cliente> it = listaClientes.iterator();
        while (it.hasNext()) {
            Cliente c = it.next();
            System.out.println("Listado de clientes (" +listaClientes.size() + ")");
            System.out.println( c.getId() + ". " + c.getNombre() + " " + c.getApellidos() );

    }
}
