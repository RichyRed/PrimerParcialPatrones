package ej4Builder;

public class Usuario {
    private BuilderContrato builder;

    public Contrato getProductBuilder(){
        return builder.getProduct();
    }

    public void setBuilder(BuilderContrato builder){
        this.builder=builder;
    }

    public void buildProduct(){
        this.builder.createProduct();
        this.builder.buildCosto();
        this.builder.buildEmpresa();
        this.builder.buildListaDeCanales();
    }
}
