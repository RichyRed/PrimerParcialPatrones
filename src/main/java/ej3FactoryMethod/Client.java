package ej3FactoryMethod;

public class Client {
    public static void main(String[] args) {
        TiendaDeportiva tienda = (TiendaDeportiva) new CreateTiendaDeportiva().createElemento();

        tienda.showInfo();

    }
}
