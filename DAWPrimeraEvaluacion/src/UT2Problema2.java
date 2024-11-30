package programacionProblemas;

//Roberto Amorós Linares

import java.util.Scanner;


public class UT2Problema2 {
    public static void main(String[] args){
    
    int year;
    int horoscopeYear;
    
    Scanner input = new Scanner(System.in);
    
        System.out.print("Introduzca el año para conocer su horóscopo chino: ");
        year = input.nextInt();
        
        horoscopeYear = (year - 4) % 12;
        System.out.println("Resuldado de la operación " + horoscopeYear );
       
        if(year <= 0){
            
            System.out.println("ERROR");
            main(args);
            
        }else if(year > 0){
                  
             switch(horoscopeYear){
                case 0: 
                    System.out.println("Tu horoscopo chino corresponde a: Rata");
                    break;
                 case 1:
                    System.out.println("Tu horoscopo chino corresponde a: Buey");
                    break;
                 case 2:
                     System.out.println("Tu horoscopo chino corresponde a: Tigre");
                     break;
                 case 3:
                     System.out.println("Tu horoscopo chino corresponde a: Conejo");
                     break;
                 case 4:
                     System.out.println("Tu horoscopo chino corresponde a: Dragón");
                     break;
                 case 5:
                     System.out.println("Tu horoscopo chino corresponde a: Serpucho");
                     break;
                 case 6:
                     System.out.println("Tu horoscopo chino corresponde a: Caballo");
                     break;
                 case 7:
                     System.out.println("Tu horoscopo chino corresponde a: Cabra");
                     break;
                 case 8:
                     System.out.println("Tu horoscopo chino corresponde a: Mono");
                     break;
                 case 9:
                     System.out.println("Tu horoscopo chino corresponde a: Gallo");
                     break;
                 case 10:
                     System.out.println("Tu horoscopo chino corresponde a: Perro");
                     break;
                 case 11:
                     System.out.println("Tu horoscopo chino corresponde a: Cerdo");
                     break;
                  
            }
        }
    
    }
}
