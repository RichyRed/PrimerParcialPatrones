package ej4Builder;

public abstract class BuilderContrato {
    protected Contrato contrato;

    public Contrato getProduct(){
        return contrato;
    }

    public void createProduct(){
        this.contrato = new Contrato();
    }

    public abstract void buildCosto();
    public abstract void buildEmpresa();
    public abstract void buildListaDeCanales();

}
