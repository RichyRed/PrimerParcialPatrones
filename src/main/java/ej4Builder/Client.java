package ej4Builder;

public class Client {
    public static void main(String[] args){
        Usuario us = new Usuario();
        ContratoAmazon amazon = new ContratoAmazon();
        ContratoHBO hbo = new ContratoHBO();
        ContratoNETFILX netflix = new ContratoNETFILX();


        us.setBuilder(amazon);
        us.buildProduct();
        Contrato contrato1 = us.getProductBuilder();
        contrato1.showInfo();

        us.setBuilder(netflix);
        us.buildProduct();
        Contrato contrato2 = us.getProductBuilder();
        contrato2.showInfo();

        us.setBuilder(hbo);
        us.buildProduct();
        Contrato contrato3 = us.getProductBuilder();
        contrato3.showInfo();
    }
}
