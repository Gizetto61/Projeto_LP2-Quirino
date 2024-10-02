package Classes;

public class Adotante extends Pessoa
{
    private int IdAdot;
    private String EspecieA;
    private String RacaA;
    private String TipoA;
    private int IdadeA;
    private String SexoA;

    public Adotante(int IdPessoa, String Nome, String DataNasc, String Genero, String CPF, String Endereco,
            String Telefone, String Email, String Senha, int idAdot, String especieA, String racaA, String tipoA,
            int idadeA, String sexoA) {
        super(IdPessoa, Nome, DataNasc, Genero, CPF, Endereco, Telefone, Email, Senha);
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
}
