package ImpostoDeRenda;
public class Pessoa {
    private String matricula;
    private String nomeCompleto;
    private Double salarioB;
    private Double salarioL;
    private Double inss;

    public void Matricula(String matricula){
        this.matricula = matricula;
    }
    public void Nome(String nomeCompleto){
        this.nomeCompleto = nomeCompleto;
    }
    public void Bruto (Double salarioB){
        this.salarioB = salarioB;
    }
    public void Liquido(Double salarioL){
        this.salarioL = salarioL;
    }
    public void INSS(Double inss){
        this.inss = inss;
    }
    public String devolverMatricula(){
        return this.matricula;
    }
    public String devolverNome(){
        return this.nomeCompleto;
    }
    public Double devolverBruto(){
        return this.salarioB;
    }
    public Double devolverLiquido(){
        return this.salarioL;
    }
    public Double devolverINSS(){
        return this.inss;
    }
}