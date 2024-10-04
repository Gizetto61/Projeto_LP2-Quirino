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
                + "\"IdPessoa\":" + IdPessoa + ","
                + "\"Nome\":\"" + Nome + "\","
                + "\"DataNasc\":\"" + DataNasc + "\","
                + "\"Gênero\":\"" + Genero + "\","
                + "\"CPF\":\"" + CPF + "\","
                + "\"Endereço\":\"" + Endereco + "\","
                + "\"Telefone\":\"" + Telefone + "\","
                + "\"Email\":\"" + Email + "\","
                + "\"Senha\":\"" + Senha + "\","
                + "\"IdTutor\":\"" + IdTutor + "\","
                + "\"NumAnimal\":\"" + NumAnimal + "\","
                + "\"HistAdocao\":\"" + HistAdocao + "\","
        + "}";
    }
}
