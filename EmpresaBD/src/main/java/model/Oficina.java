package model;

public class Oficina {
    private int oficina;
    private String ciutat;
    private int superficie;
    private double vendes;

    public Oficina(int oficina, String ciutat, int superficie, double vendes) {
        this.oficina = oficina;
        this.ciutat = ciutat;
        this.superficie = superficie;
        this.vendes = vendes;
    }
    
    public Oficina(int oficina, int superficie, double vendes){
        this.oficina = oficina;
        this.superficie = superficie;
        this.vendes = vendes;
    }
    
    @Override
    public String toString(){
        return this.oficina + " - " 
                + this.ciutat + " - "
                + this.superficie + " - "
                + this.vendes;
    }

    public String getCiutat() {
        return ciutat;
    }
    
    
        
}
