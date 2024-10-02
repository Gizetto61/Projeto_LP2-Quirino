package Classes;

public class Funcionario extends Pessoa
{
    private int IdFunc;
    private String DataContr;
    private String Cargo;
    private double Salario;
    private String Departamento;
    
    public Funcionario(int IdPessoa, String Nome, String DataNasc, String Genero, String CPF, String Endereco,
            String Telefone, String Email, String Senha, int idFunc, String dataContr, String cargo, double salario,
            String departamento) {
        super(IdPessoa, Nome, DataNasc, Genero, CPF, Endereco, Telefone, Email, Senha);
        IdFunc = idFunc;
        DataContr = dataContr;
        Cargo = cargo;
        Salario = salario;
        Departamento = departamento;
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
}
