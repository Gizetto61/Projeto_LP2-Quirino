package Classes;

public class Adotante extends Pessoa
{
    private int IdAdot;
    private String Especie;
    private String Raca;
    private String Tipo;
    private int Idade;
    private String Sexo;

    public Adotante(Pessoa pessoa, int idAdot, String especie, String raca, String tipo, int idade, String sexo) {
        super(pessoa.getIdPessoa(), pessoa.getNome(), pessoa.getDataNasc(), pessoa.getGenero(), pessoa.getCPF(), pessoa.getEndereco(), pessoa.getTelefone(), pessoa.getEmail(), pessoa.getSenha());
        IdAdot = idAdot;
        Especie = especie;
        Raca = raca;
        Tipo = tipo;
        Idade = idade;
        Sexo = sexo;
    }

    public Adotante(){
        
    }

    public int getIdAdot() {
        return IdAdot;
    }

    public void setIdAdot(int idAdot) {
        IdAdot = idAdot;
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

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
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

    @Override
    public String toString() {
        return "{"
                + "\"IdPessoa\":" + IdPessoa + ",\n"
                + "\"Nome\":\"" + Nome + "\",\n"
                + "\"DataNasc\":\"" + DataNasc + "\",\n"
                + "\"Gênero\":\"" + Genero + "\",\n"
                + "\"CPF\":\"" + CPF + "\",\n"
                + "\"Endereço\":\"" + Endereco + "\",\n"
                + "\"Telefone\":\"" + Telefone + "\",\n"
                + "\"Email\":\"" + Email + "\",\n"
                + "\"Senha\":\"" + Senha + "\",\n"
                + "\"IdAdot\":\"" + IdAdot + "\",\n"
                + "\"Especie\":\"" + Especie + "\",\n"
                + "\"Raca\":\"" + Raca + "\",\n"
                + "\"Tipo\":\"" + Tipo + "\",\n"
                + "\"Idade\":\"" + Idade + "\",\n"
                + "\"Sexo\":\"" + Sexo + "\""
        + "}";
    }
}


