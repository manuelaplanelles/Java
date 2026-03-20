package ra90_proyectos_integradores.practicas.Mercadaw;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Pedido {
    private HashMap<Producto,Integer> pedido;
    private double importeTotal;

    public Pedido(){
        this.pedido = new HashMap<>();
        this.importeTotal = 0;
    }
    public void  aplicarPromo3x2(){
        for(Map.Entry<Producto, Integer> entry : pedido.entrySet()){
            Producto producto = entry.getKey();
            int cantidad = entry.getValue();
            if (cantidad % 3 == 0) {
                int unidadesGratis = cantidad / 3;
                double descuento = unidadesGratis * producto.getPrecio();
                importeTotal = importeTotal - descuento;
            }
        }
    }
    public void aplicarPromo10(){
        double descuento = importeTotal*0.10;
        importeTotal=importeTotal-descuento;
    }

    public HashMap<Producto, Integer> getPedido() {
        return pedido;
    }

    public void setPedido(HashMap<Producto, Integer> pedido) {
        this.pedido = pedido;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "pedido=" + pedido +
                ", importeTotal=" + importeTotal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Pedido pedido1 = (Pedido) o;
        return Double.compare(importeTotal, pedido1.importeTotal) == 0 && Objects.equals(pedido, pedido1.pedido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pedido, importeTotal);
    }

}