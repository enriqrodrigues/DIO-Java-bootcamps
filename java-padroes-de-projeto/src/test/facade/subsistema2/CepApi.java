package test.facade.subsistema2;

public class CepApi {

    private static CepApi instancia = new CepApi();

    public CepApi() {
        super();
    }

    public static CepApi getInstance() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Olinda";
    }

    public String recuperarEstado(String cep) {
        return "PE";
    }

}
