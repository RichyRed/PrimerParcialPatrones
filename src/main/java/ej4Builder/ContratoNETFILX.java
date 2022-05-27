package ej4Builder;

public class ContratoNETFILX extends BuilderContrato{
    @Override
    public void buildCosto(){
        contrato.setCosto("150 Bs");
    }

    @Override
    public void buildEmpresa(){
        contrato.setEmpresa("NETFLIX");
    }

    @Override
    public void buildListaDeCanales() {
        contrato.setListaDeCanales("Sonic, Juegos del hambre");
    }


}
