package ej4Builder;

public class ContratoHBO extends BuilderContrato{
    @Override
    public void buildCosto(){
        contrato.setCosto("100 Bs");
    }

    @Override
    public void buildEmpresa(){
        contrato.setEmpresa("hbo");
    }

    @Override
    public void buildListaDeCanales() {
        contrato.setListaDeCanales("Dune, Batman");
    }


}
