package ej2Prototype;

public class Celular implements  ICelular{

    private String modelo;
    private String tamaño;
    private int peso;
    private int foco;
    private String lente;
    private String origen;
    private int imei;

    public Celular(){}

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getLente() {
        return lente;
    }

    public void setLente(String lente) {
        this.lente = lente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    public int getFoco() {
        return foco;
    }

    public void setFoco(int foco) {
        this.foco = foco;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public Object clone() {
        Celular celular = new Celular();
        celular.setModelo(this.modelo);
        celular.setTamaño(this.tamaño);
        celular.setPeso(this.peso);
        celular.setFoco(this.foco);
        celular.setImei(this.imei);
        celular.setOrigen(this.origen);
        return  celular;
    }

    public void showInfo(){
        System.out.println("Info de los celulares ");

    }
}
