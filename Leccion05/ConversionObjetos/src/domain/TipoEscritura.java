package domain;

public enum TipoEscritura {
    CLASICO ("escritura a mano"),
    MODERNO ("eSCRITURA DIGITAL");
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion) { //Constructor
        this.descripcion = descripcion;
    }
    
    //Metodo get
    public String getDescripcion(){
        return this.descripcion;
    }
}
