import javax.swing.*;

public class caso {
   
    public static void main(String[] entrada) {
     //declaração de variaveis
     int n1;
     String msg=" ",msgentr="digite 1 para impar/par,2 para positivo/negativo.\n";
     char op=0;
     
       //entrada de dados 
     n1= Integer.parseInt(JOptionPane.showInputDialog("digite um numero inteiro"));
     op= (JOptionPane.showInputDialog(msgentr)).charAt(0); 
     
     //procesamento
     switch(op)
       {
         case'1':
         {
           if(op % 2 == 0 )
           {
               msg=n1+"e um numero par";
           }
            else
            {
              msg=n1+"e um numero impar"; 
            }
           break;
           }
         case'2':
         {
             if(op>0)
             {
              msg=n1+"e um numero positivo";   
             }
             else
             {
              msg=n1+"e um numero negativo";  
             }
          break;   
         }
          default: JOptionPane.showMessageDialog(null,"por favor escolha uma das opções");
        }
     //saida de dados
     if(op=='1' || op=='2')
       {
        JOptionPane.showMessageDialog(null,msg);
       }
         System.exit(0);
     }
    }
    

