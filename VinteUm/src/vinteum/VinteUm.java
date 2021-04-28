package vinteum;

import javax.swing.JOptionPane;

public class VinteUm {
        public static void main(String[] args){
            String text;
            int resposta;
            String texto = "1 2 3 4 5 6 7 8 9 10 10 10 10";
            String texto2 = "espadas \u2660-paus \u2663-copas \u2665-ouros \u2666";
            String[] num,np,nipe;
            int numero[];
            
            num = texto.split(" ");
            numero = new int[num.length];
            
            np = texto2.split("-");
            nipe = new String[np.length];
        
            for(int i = 0; i < num.length; i++){
                numero[i] = Integer.parseInt(num[i]);
            }
            
            for(int i = 0; i < np.length; i++){
                nipe[i] = np[i];
            }
            int resultado=0,valor=0;
            
            //Humano jogando
            do{
                int j=0, n=0;
                text = JOptionPane.showInputDialog(null,"Deseja uma carta?(1-sim/2-não)");
                resposta = Integer.parseInt(text);
                if(resposta==1){
                    double div = 0.0192307692;
                    double carta = Math.random();
                    
                    for(int i=0; i<=52; i++){
                        if(carta>=div * i && carta<=div * (i+1)){
                            valor = numero[j];
                            resultado = resultado + valor;
                            JOptionPane.showMessageDialog(null,"carta: "+numero[j]+" "+nipe[n]+"\n"+"Total: "+resultado);
                        }
                        j++;
                        if(j == 13){
                            j = 0;
                            if(n < 3){
                                n++;
                            }
                        }
                    }
                }
            }while(resposta == 1 && resultado < 21);
            JOptionPane.showMessageDialog(null,"Seu total foi: " + resultado);
            
            //Maquina jogando
            int resultadomaq = 0, valor2;
            do{
                int j=0, n=0;   
                double div=0.0192307692;
                double carta = Math.random();
                for(int i=0; i<=52; i++){
                    if(carta>=div * i && carta<=div * (i+1)){
                        valor2 = numero[j];
                        resultadomaq = resultadomaq + valor2;
                        JOptionPane.showMessageDialog(null,"carta: "+numero[j]+" "+nipe[n]+"\n"+"Total: "+resultadomaq);
                        break;
                    }
                    j++; 
                    if(j == 13){
                        j = 0;
                        if(n < 3){
                            n++;
                        }  
                    }   
                }
            }while(resultadomaq <= resultado);
                if(resultado < resultadomaq && resultadomaq <= 21){
                    JOptionPane.showMessageDialog(null,"Jogador: "+resultado+"\n"+"Máquina: "+resultadomaq);
                    JOptionPane.showMessageDialog(null,"Você perdeu!!");
                }
                else if(resultado > 21 && resultadomaq > 21){
                    JOptionPane.showMessageDialog(null,"Jogador: "+resultado+"\n"+"Máquina: "+resultadomaq);
                    JOptionPane.showMessageDialog(null,"Ninguem ganhou!!");
                }
                else if(resultado < resultadomaq && resultado <= 21 && resultadomaq > 21){
                    JOptionPane.showMessageDialog(null,"Jogador: "+resultado+"\n"+"Máquina: "+resultadomaq);
                    JOptionPane.showMessageDialog(null,"Você ganhou!!");
                }
                else if(resultado == 21 && resultadomaq == 21){
                    JOptionPane.showMessageDialog(null,"Jogador: "+resultado+"\n"+"Máquina: "+resultadomaq);
                    JOptionPane.showMessageDialog(null,"Deu empate!!");
                }
            }
        }