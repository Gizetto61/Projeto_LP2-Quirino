package Classes;

public class Adotante extends Pessoa
{
    private int IdAdot;
    private String EspecieA;
    private String RacaA;
    private String TipoA;
    private int IdadeA;
    private String SexoA;

    public Adotante(Pessoa pessoa, int idAdot, String especieA, String racaA, String tipoA, int idadeA, String sexoA) {
        super(pessoa.getIdPessoa(), pessoa.getNome(), pessoa.getDataNasc(), pessoa.getGenero(), pessoa.getCPF(), pessoa.getEndereco(), pessoa.getTelefone(), pessoa.getEmail(), pessoa.getSenha());
        IdAdot = idAdot;
        EspecieA = especieA;
        RacaA = racaA;
        TipoA = tipoA;
        IdadeA = idadeA;
        SexoA = sexoA;
    }

    public Adotante(){
        
    }

    public int getIdAdot() {
        return IdAdot;
    }

    public void setIdAdot(int idAdot) {
        IdAdot = idAdot;
    }

    public String getEspecieA() {
        return EspecieA;
    }

    public void setEspecieA(String especieA) {
        EspecieA = especieA;
    }

    public String getRacaA() {
        return RacaA;
    }

    public void setRacaA(String racaA) {
        RacaA = racaA;
    }

    public String getTipoA() {
        return TipoA;
    }

    public void setTipoA(String tipoA) {
        TipoA = tipoA;
    }

    public int getIdadeA() {
        return IdadeA;
    }

    public void setIdadeA(int idadeA) {
        IdadeA = idadeA;
    }

    public String getSexoA() {
        return SexoA;
    }

    public void setSexoA(String sexoA) {
        SexoA = sexoA;
    }

    @Override
    public String toString() {
        return "{"
                + "\"IdPessoa\":" + IdPessoa + ","
                + "\"Nome\":\"" + Nome + "\","
                + "\"DataNasc\":\"" + DataNasc + "\","
                + "\"Gênero\":\"" + Genero + "\","
                + "\"CPF\":\"" + CPF + "\","
                + "\"Endereço\":\"" + Endereco + "\","
                + "\"Telefone\":\"" + Telefone + "\","
                + "\"Email\":\"" + Email + "\","
                + "\"Senha\":\"" + Senha + "\","
                + "\"IdAdot\":\"" + IdAdot + "\","
                + "\"EspecieA\":\"" + EspecieA + "\","
                + "\"RacaA\":\"" + RacaA + "\","
                + "\"TipoA\":\"" + TipoA + "\","
                + "\"IdadeA\":\"" + IdadeA + "\","
                + "\"SexoA\":\"" + SexoA + "\","
        + "}";
    }
}


