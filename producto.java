package proyect.colaborativoprogra.producto;

       public class producto {
    // Atributos de la clase Producto
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;

            // Constructor por defecto
                 public producto() {
                   this("", "", 0.0, 0);
        }

           // Constructor con parámetros
        public producto(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        setPrecio(precio); // Usar setters para validar
        setCantidad(cantidad);
    }

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio no puede ser negativo.");
        }
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad no puede ser negativa.");
        }
    }

           // aqui para mostrar la información del producto
         public void mostrarInformacion() {
              System.out.println("Código: " + codigo);
                 System.out.println("Nombre: " + nombre);
                    System.out.printf("Precio: $%.2f\n", precio);
                        System.out.println("Cantidad disponible: " + cantidad);
          }

    /// aqui el metoodo para actualizar el stock del producto
    public void actualizarStock(int cantidadVendida) {
            if (cantidadVendida > 0 && cantidadVendida <= cantidad) {
            cantidad -= cantidadVendida;
            System.out.println("Stock actualizado. Nueva cantidad: " + cantidad);
            } else {
                 System.out.println("Cantidad vendida no válida o insuficiente.");
        }
    }
}
