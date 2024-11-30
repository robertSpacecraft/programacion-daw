package programacionProblemas;

//import java.util.Scanner; 

public class UT1Problema2 {
    public static void main(String[] args){
    
        //Empezamos declarando las variables que vamos a necesitar
        float nacimientosPs = 1.0f/7;
        float muertesPs = 1.0f/13;
        float inmigraPs = 1.0f/45;
        int poblacionActual = 312032486;
        final int YEAR = 365;
        final int HOUR = 24;
        final int SECMIN = 60;
        
        //Calculamos la tasa neta de cambio de población: los que llegan - los que se van
        float tasaNetaCp = (nacimientosPs + inmigraPs) - muertesPs;
        
        //Realizamos los calculos necesarios para trabajar con las misma unidades
        int segundosYear = YEAR * HOUR * SECMIN * SECMIN;
        
        //Proyecciones a años deseados.
        //Scanner s = new Scanner(System.in);
        //System.out.println("Por favor, introduzca a cuanto años desea hacer su proyección");
        //int proyectYears = s.nextInt();
        //double growth = proyectYears * segundosYear * tasaNetaCp;
        double yearGrowth = segundosYear * tasaNetaCp;
        
        //Pasamos el crecimiento (growth) de segundos a 
        //double totalGrowth = poblacionActual + growth;
        
       System.out.println("PROYECIÓN DE LA POBLACIÓN DE LOS EUA");
       System.out.println("- - - - - - - - - - - - - - - - - - - -");
       System.out.print("\tAño actual: " + poblacionActual + " personas");
       System.out.printf("\n\tAño: 2025 %.2f personas ", yearGrowth + poblacionActual);
       System.out.printf("\n\tAño: 2026 %.2f personas ", yearGrowth*2 + poblacionActual);
       System.out.printf("\n\tAño: 2027 %.2f personas ", yearGrowth*3 + poblacionActual);
       System.out.printf("\n\tAño: 2028 %.2f personas ", yearGrowth*4 + poblacionActual);
       System.out.printf("\n\tAño: 2029 %.2f personas ", yearGrowth*5 + poblacionActual);
       
          
    }
    
}
