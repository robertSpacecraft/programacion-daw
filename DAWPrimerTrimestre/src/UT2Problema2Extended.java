package programacionProblemas;

//Roberto Amorós Linares

import java.util.Scanner;


public class UT2Problema2Extended {
    public static void main(String[] args){
    // Declaramos variables y le asignamos el valor con Scanner
    int year;
    int horoscopeYear;
    
    Scanner input = new Scanner(System.in);
    
        System.out.print("Introduzca el año para conocer su horóscopo chino: ");
        year = input.nextInt();
      //calculamos el valor que corresponderá al animal  
        horoscopeYear = (year - 4) % 12;
        
     //controlamos que no se introduzca el año 0  
        if(year == 0){           
            System.out.println("ERROR");
            main(args);            
        }
       //Si el resultado es negativo le sumamos 12 para que corresponda a su valor animal 
        if(horoscopeYear < 0){
            horoscopeYear += 12;
            System.out.println("Resuldado de la NUEVA operación " + horoscopeYear );
        
        }
        // asignamos el animal al valor calculado
        if(year !=  0 ){
                  
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
             main(args);
             input.close();
        }
    
    }
}
