/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variabel.argument;

/**
 *
 * @author preec
 */
public class VariabelArgument {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        metodVarArgs(4, 5);
        metodVarArgs(7, 3, 8, 5);
        
        appendString("värde", "står","som", "står", "ovan");
    }
    public static int metodParam(int a, int b){
        //Normal metod med två parametrar av typ int
        return a+b;
    }
    public static int metodVarArgs(int...a){//...efter datatyp indikera att variabel argument är difinerad
        //Använder for loop för att få tillgång till värde
        //Använder VarArgs inte riktigt vet hur många typer argument som kommer att passera till metod
        //VarArg ta in så mycket parametrar som ges av typ int
       int total = 0;
        for (int i = 0; i<a.length; i++){
            total += a[i];    
        }
        //Summera alla värde som passera
        System.out.println("total=" +total);
        return total;
    }
 
    public static void appendString(String...s) {
       //skickar möjliga param utan restriktioner
       //Få tillgång till string värde appended till buffer och skriver ut appended värde
        StringBuffer sb = new StringBuffer();
        
        for (String x : s){
            sb.append(x);
            sb.append(" ");
        }
        System.out.println(sb);
    }
    
}

