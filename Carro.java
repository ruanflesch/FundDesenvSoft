public class Carro implements Veiculo{
    private int codigo;
    private String cor;
    private String marca;
    private String valor;
    

    @Override
    public int getCodigo(){
        return codigo;
    };

    @Override
    public String getCor(){
        return cor;
    };

    @Override
    public String getMarca(){
        return marca;
    };

    @Override
    public double getValor(){
        return valor;
    };

    @Override
    public void setCor(String cor){
        this.cor = cor;
    };

    @Override
    public void setMarca(String marca){
        this.marca = marca;
    };

    @Override
    public void setValor(){
        this.valor = valor;
    };

}