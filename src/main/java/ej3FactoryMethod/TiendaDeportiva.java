package ej3FactoryMethod;

public class TiendaDeportiva implements  IElemento{

    private PelotaFutbol pelota;
    private String camiseta;
    private String shorts;
    private String medias;
    private String tenis;

    public TiendaDeportiva(){}

    public PelotaFutbol getPelota() {
        return pelota;
    }

    public void setPelota(PelotaFutbol pelota) {
        this.pelota = pelota;
    }

    public String getCamiseta() {
        return camiseta;
    }

    public void setCamiseta(String camiseta) {
        this.camiseta = camiseta;
    }

    public String getShorts() {
        return shorts;
    }

    public void setShorts(String shorts) {
        this.shorts = shorts;
    }

    public String getMedias() {
        return medias;
    }

    public void setMedias(String medias) {
        this.medias = medias;
    }

    public String getTenis() {
        return tenis;
    }

    public void setTenis(String tenis) {
        this.tenis = tenis;
    }

    @Override
    public void showInfo() {
        System.out.println("********* Elementos de la tienda deportiva ************");
        System.out.println("Detalles de la pelota... ");
        System.out.println("Tamaño del balon: " + pelota.getTamaño());
        System.out.println("Color del balon: " + pelota.getColor());
        System.out.println("Duracion de la garantia: " + pelota.getGarantia());
        System.out.println("Otros productos.........");
        System.out.println("Camiseta:" + camiseta);
        System.out.println("Shorts: " + shorts);
        System.out.println("Medias: " + medias);
        System.out.println("Tenis: " + tenis);
    }
}
