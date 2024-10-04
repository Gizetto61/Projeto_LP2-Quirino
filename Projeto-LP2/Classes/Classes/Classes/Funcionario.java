package Classes;

public class Funcionario extends Pessoa
{
    private int IdFunc;
    private String DataContr;
    private String Cargo;
    private double Salario;
    private String Departamento;
    
    public Funcionario(Pessoa pessoa, int idFunc, String dataContr, String cargo, double salario,
            String departamento) {
        super(pessoa.getIdPessoa(), pessoa.getNome(), pessoa.getDataNasc(), pessoa.getGenero(), pessoa.getCPF(), pessoa.getEndereco(), pessoa.getTelefone(), pessoa.getEmail(), pessoa.getSenha());
        this.IdFunc = idFunc;
        this.DataContr = dataContr;
        this.Cargo = cargo;
        this.Salario = salario;
        this.Departamento = departamento;
    }

    public Funcionario(){
        
    }

    public int getIdFunc() {
        return IdFunc;
    }

    public void setIdFunc(int idFunc) {
        IdFunc = idFunc;
    }

    public String getDataContr() {
        return DataContr;
    }

    public void setDataContr(String dataContr) {
        DataContr = dataContr;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String departamento) {
        Departamento = departamento;
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
                + "\"IdFunc\":\"" + IdFunc + "\","
                + "\"DataContr\":\"" + DataContr + "\","
                + "\"Cargo\":\"" + Cargo + "\","
                + "\"Salario\":\"" + Salario + "\","
                + "\"Depertamento\":\"" + Departamento + "\","
        + "}";
    }
}