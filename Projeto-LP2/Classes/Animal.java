package Classes;

public class Animal 
{
    private String Nome;
    private String Especie;
    private String Raca;
    private int Idade;
    private String Sexo;
    private String HistMed;
    private String DtResgate;
    private String Status;

    public Animal(){

    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getEspecie() {
        return Especie;
    }

    public void setEspecie(String especie) {
        Especie = especie;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String raca) {
        Raca = raca;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String sexo) {
        Sexo = sexo;
    }

    public String getHistMed() {
        return HistMed;
    }

    public void setHistMed(String histMed) {
        HistMed = histMed;
    }

    public String getDtResgate() {
        return DtResgate;
    }

    public void setDtResgate(String dtResgate) {
        DtResgate = dtResgate;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
