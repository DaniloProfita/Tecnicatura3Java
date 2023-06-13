package ar.com.system2023.mundopc;

public class Orden {
    private final int idOrden;
    private Computadora computadora[]; //Arreglo de objetos
    private static int contadorOrdenes;
    private static final int max_computadoras = 10;
    private int contadorComputadora;
    
    //Constructor vacio
    public Orden(){
        this.idOrden = ++contadorOrdenes;
        this.computadora = new Computadora[Orden.max_computadoras];
    }
    
    //Metodo para agregar una nueva computadora al arreglo
    public void agregarComputadora(Computadora computadora){
        if(this.contadorComputadora < Orden.max_computadoras){
            this.computadora[this.contadorComputadora++] = computadora;
        }
        else {
            System.out.println("Has superado el limite = " +Orden.max_computadoras);
        }
    }
    
    //Mostrar orden
    public void mosstrarOrden(){
        System.out.println("Orden #"+this.idOrden);
        System.out.println("Computadoras de la orden #"+this.idOrden);
        for(int i = 0; i < this.contadorComputadora; i++){
            System.out.println(this.computadora[i]);
        }
    }
}