package Classes;

public class Pessoa 
{
    protected int IdPessoa;
    protected String Nome;
    protected String DataNasc;
    protected String Genero;
    protected String CPF;
    protected String Endereco;
    protected String Telefone;
    protected String Email;
    protected String Senha;

    public Pessoa(){
        
    }

    public Pessoa(int IdPessoa, String Nome, String DataNasc, String Genero, String CPF, String Endereco, String Telefone, String Email, String Senha){
        this.IdPessoa = IdPessoa;
        this.Nome = Nome;
        this.DataNasc = DataNasc;
        this.Genero = Genero;
        this.CPF = CPF;
        this.Endereco = Endereco;
        this.Telefone = Telefone;
        this.Email = Email;
        this.Senha = Senha;
    }

    public int getIdPessoa() {
        return IdPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        IdPessoa = idPessoa;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDataNasc() {
        return DataNasc;
    }

    public void setDataNasc(String dataNasc) {
        DataNasc = dataNasc;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getEndereco() {
     
      return Endereco;
    }

    public void setEndereco(String endereco) {
        Endereco = endereco;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String telefone) {
        Telefone = telefone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String senha) {
        Senha = senha;
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
        + "}";
    }
}
