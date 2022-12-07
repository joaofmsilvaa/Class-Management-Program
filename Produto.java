package estudo;

public class Produto {
    private int productID;
    private String productName;
    private double value;
    private int iva;
    private String fornecedor;
    private int quantidade;


    public Produto(int productID,String productName,double value,int iva,String fornecedor,int quantidade) {

        this.productID = productID;
        this.productName = productName;
        this.value = value;
        this.iva = iva;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
    }

    public int getProductID(){
        return this.productID;
    }
    public String getProductName(){
        return productName;
    }
    public double getValue(){
        return this.value;
    }
    public int getIva(){
        return this.iva;
    }
    public String getFornecedor(){
        return this.fornecedor;
    }
    public int getQuantidade(){
        return  this.quantidade;
    }
}
