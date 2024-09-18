package Classes;

public class Funcionario 
{
    private int IdFunc;
    private String DataContr;
    private String Cargo;
    private double Salario;
    private String Departamento;
    
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
