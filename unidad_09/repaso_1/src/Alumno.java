public class Alumno {
    private String nombre;
    private String matricula;
    private int edad;
    private double promedio;
    boolean estado;

    public Alumno(String nombre, String matricula, int edad, float promedio, boolean estado) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
        this.promedio = promedio;
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: " + promedio);
        System.out.println("Estado: " + (estado ? "Activo" : "Inactivo"));
    }

    public boolean estaAprobado() {
        if(promedio >= 5.0) {
            return true;
        }else{
            return false;
        }
    }
}
