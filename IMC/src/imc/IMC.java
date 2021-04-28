package imc;
import javax.swing.JOptionPane;
public class IMC {
    public static void main(String[] args) {
        float peso;
        float altura;  
        float IMC;
        String texto;
        String sexoAluno;
        JOptionPane.showMessageDialog(null, "Programa IMC");
        texto = JOptionPane.showInputDialog("Digite a altura do aluno: (Exemplo: 1.73)");
        altura = Float.parseFloat(texto);
        texto =JOptionPane.showInputDialog("Digite o peso do aluno: "); 
        peso = Float.parseFloat(texto);
        
        IMC = (peso)/(altura*altura);
        //JOptionPane.showMessageDialog(null, resultadoIMC);
        sexoAluno = JOptionPane.showInputDialog("Digite a letra M se o aluno for masculino ou F se for feminino (M/F)");
        switch(sexoAluno){
            case "M":
                if(IMC < 20.7){
                    JOptionPane.showMessageDialog(null, "O seu IMC é " + IMC + "\n");
                    JOptionPane.showMessageDialog(null, "Você está abaixo do peso");
                }
                else if(IMC >= 20.7 && IMC < 26.4){
                    JOptionPane.showMessageDialog(null, "O seu IMC é " + IMC + "\n");
                    JOptionPane.showMessageDialog(null, "Você está no peso ideal");
                }
                else if(IMC >= 26.4 && IMC < 27.8){
                    JOptionPane.showMessageDialog(null, "O seu IMC é " + IMC + "\n");
                    JOptionPane.showMessageDialog(null, "Você está um pouco acima do peso");
                }
                else if(IMC >= 27.8 && IMC < 32.3){
                    JOptionPane.showMessageDialog(null, "O seu IMC é " + IMC + "\n");
                    JOptionPane.showMessageDialog(null, "Você está obeso");
                }
                break;
            case "F":
                if(IMC < 19.1){
                    JOptionPane.showMessageDialog(null, "O seu IMC é " + IMC + "\n");
                    JOptionPane.showMessageDialog(null, "Você está abaixo do peso");
                }
                else if(IMC >= 19.1 && IMC < 25.8){
                    JOptionPane.showMessageDialog(null, "O seu IMC é " + IMC + "\n");
                    JOptionPane.showMessageDialog(null, "Você está no peso ideal");
                }
                else if(IMC >= 25.8 && IMC < 27.3){
                    JOptionPane.showMessageDialog(null, "O seu IMC é " + IMC + "\n");
                    JOptionPane.showMessageDialog(null, "Você está um pouco acima do peso");
                }
                else if(IMC >= 27.3 && IMC < 31.1){
                    JOptionPane.showMessageDialog(null, "O seu IMC é " + IMC + "\n");
                    JOptionPane.showMessageDialog(null, "Você está obesa");
                }
                break;
                default:
                    JOptionPane.showMessageDialog(null, "Sexo não escolhido!");
                    break;
        }
    }
}
