package ej3FactoryMethod;

public class CreateTiendaDeportiva extends ElementoCreator{

    @Override
    public IElemento createElemento() {
        PelotaFutbol pelota = new PelotaFutbol();
        pelota.setColor("Negro y Blanco");
        pelota.setGarantia("Balon con 5 años de garantia");
        pelota.setTamaño("Balon normal para futbol 11");

        TiendaDeportiva elemento = new TiendaDeportiva();

        elemento.setPelota(pelota);

        elemento.setCamiseta("Real Madrid");
        elemento.setShorts("Shorts de color blanco");
        elemento.setMedias("Medias de color azul");
        elemento.setTenis("Zapatillas CR7 shiuuuu");


        return elemento;
    }
}
