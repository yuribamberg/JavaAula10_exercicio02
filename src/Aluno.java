//Nome: Yiri Ivo Luiz Bamberg
//Matrícula: 1261948881
public class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;
    double media;
    
    public double CalcularMedia() {
        return media = (nota1 + nota2) / 2;
    }

    public String aprovado() {
        if (media >= 6.0) {
            return "APROVADO";
        } else {
            return "REPROVADO";
        }
            
    }
    public String exibirboletim() {
        return "Aluno: " + nome + " | " + "Matrícula: " + matricula + "\nNota 1: " + nota1 + " | " + "Nota 2: " + nota2 + "\nMédia: " + CalcularMedia() + "\nSituação: " + aprovado();   
    }

}
