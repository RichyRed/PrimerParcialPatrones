package ej4Builder;

public class ContratoAmazon extends BuilderContrato{
    @Override
    public void buildCosto(){
        contrato.setCosto("50 Bs");
    }

    @Override
    public void buildEmpresa(){
        contrato.setEmpresa("aws");
    }

    @Override
    public void buildListaDeCanales() {
        contrato.setListaDeCanales("El lobo de WallStrett, Proyecto X");
    }


}
