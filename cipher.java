import java.util.Scanner;
public class cipher
{
    public static void main (String[]args){
       
       String replaced;
      
       Scanner sc=new Scanner(System.in);
       String [] n = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L","M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
       String [] n2 = {"X", "Y", "Z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W"};
       System.out.println ("encrypt or decrypt?");
       String input = sc.nextLine();
       if (input.equalsIgnoreCase("encrypt")){
       System.out.println ("Type what you want to encrypt.");
       String v1 = sc.nextLine(); 
      

   System.out.println(v1.replace (n[0], n2[0]).replace (n[1], n2[1]).replace (n[2], n2[2])
   .replace (n[3], n2[3]).replace (n[4], n2[4]).replace (n[5], n2[5]).replace (n[6], n2[6])
   .replace (n[7], n2[7]).replace (n[8], n2[8]).replace (n[9], n2[9]).replace (n[10], n2[10])
   .replace (n[11], n2[12]).replace (n[13], n2[13]).replace (n[14], n2[14]).replace (n[15], n2[15])
   .replace (n[16], n2[16]).replace (n[17], n2[17]).replace (n[18], n2[18]).replace (n[19], n2[19])
   .replace (n[20], n2[20]).replace (n[21], n2[21]).replace (n[22], n2[22]).replace (n[23], n2[23])
   .replace (n[24], n2[24]).replace (n[25], n2[25]));
   
   
  
   
  
    } 
}  }
     

