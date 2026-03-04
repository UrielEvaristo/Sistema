public class Alumno {
    private String nombre;
    private String matricula;
    private Double cal1;
    private Double cal2;
    private Double cal3;
    //constructor
    public Alumno(String nombre, String matricula){
        this.nombre = nombre;
        this.matricula = matricula;
        this.cal1 = cal1;
        this.cal2 = cal2;
        this.cal3 = cal3;
     }
     //metodo calcular promedio
     public void calcularpromedio(){
        Double promedio = (cal1 + cal2 + cal3)/3;
     }
     // metodo mostrar alumno
    public void Mostraralumno(){
        System.out.println("Alumno: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Promedio: " + (cal1 + cal2 + cal3)/3);
    }
   
}
