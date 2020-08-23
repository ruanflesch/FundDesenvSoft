import java.util.List;

public class Catalogo{
    private List<Veiculo> veiculos;

    public Catalogo(){
        veiculos = new ArrayList<>();
    }

    public List<Veiculo> getVeiculos(){
        return veiculos;
    }
}