package enumeraciones;

public enum Continentes {
    AFRICA(54, "1.2 Billones"),
    EUROPA(46, "746.4 Millones"),
    ASIA(51, "4.561 Billones"),
    AMERICA(35, "1.002 Billones"),
    OCEANIA(14, "41.117 Billones");
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }
    
    //Metodo Get
    public int getPaises() {
        return this.paises;
    }
    
    public String getHabitantes(){
        return this.habitantes;
    }
}
