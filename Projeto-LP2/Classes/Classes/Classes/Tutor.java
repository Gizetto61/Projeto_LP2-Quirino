package Classes;

public class Tutor extends Pessoa
{
    private int IdTutor;
    private int NumAnimal;
    private String HistAdocao;


    public Tutor() {
    }
    public Tutor(Pessoa pessoa, int idTutor, int numAnimal, String histAdocao) {
        super(pessoa.getIdPessoa(), pessoa.getNome(), pessoa.getDataNasc(), pessoa.getGenero(), pessoa.getCPF(), pessoa.getEndereco(), pessoa.getTelefone(), pessoa.getEmail(), pessoa.getSenha());
        this.IdTutor = idTutor;
        this.NumAnimal = numAnimal;
        this.HistAdocao = histAdocao;
    }


    public int getIdTutor() {
        return IdTutor;
    }

    public void setIdTutor(int idTutor) {
        IdTutor = idTutor;
    }

    public int getNumAnimal() {
        return NumAnimal;
    }

    public void setNumAnimal(int numAnimal) {
        NumAnimal = numAnimal;
    }
    public String getHistAdocao() {
        return HistAdocao;
    }

    public void setHistAdocao(String histAdocao) {
        HistAdocao = histAdocao;
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
                + "\"Email\":\"" + Email + "\"\n"
                + "\"Senha\":\"" + Senha + "\",\n"
                + "\"IdTutor\":\"" + IdTutor + "\",\n"
                + "\"NumAnimal\":\"" + NumAnimal + "\",\n"
                + "\"HistAdocao\":\"" + HistAdocao + "\""
        + "}";
    }
}
