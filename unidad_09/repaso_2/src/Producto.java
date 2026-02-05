public class Producto {
    String codProducto;
    String nombre;
    double precio;
    int stock;
    boolean disponible;
    String categoria;

    public Producto(String codProducto, String nombre, double precio, int stock, boolean disponible, String categoria) {
        this.codProducto = codProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.disponible = disponible;
        this.categoria = categoria;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void vender(int cantidad){

        if(this.stock <= 0 || this.stock-cantidad <= 0){
            disponible = false;
            System.out.println("No es posible vender");
        }else{
            this.stock -= cantidad;
            System.out.printf("Se ha vendido %d de %s", cantidad, this.nombre);
        }

    }

    public void reabastecer(int cantidad){
        this.stock += cantidad;
        this.disponible = true;
    }

    public void aplicarDescuento(double percent){
        this.precio *= (percent/100);
    }

    public void mostrarProducto(){
        //...
    }
}
