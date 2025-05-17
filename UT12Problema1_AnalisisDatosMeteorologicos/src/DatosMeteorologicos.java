/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Robert
 */
public class DatosMeteorologicos {
    private double maxTemp;
    private double minTemp;
    private String maxHora;
    private String minHora;
    private double precipitaciones;
    
    public DatosMeteorologicos(double maxTemp, double minTemp, String maxHora, String minHora, double precipitaciones){
    this.maxTemp = maxTemp;
    this.minTemp = minTemp;
    this.maxHora = maxHora;
    this.minHora = minHora;
    this.precipitaciones = precipitaciones;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public double getMinTemp() {
        return minTemp;
    }

    public String getMaxHora() {
        return maxHora;
    }

    public String getMinHora() {
        return minHora;
    }

    public double getPrecipitaciones() {
        return precipitaciones;
    }
    
    @Override
    public String toString(){
        return "Temperatura máxima: " + this.maxTemp
                + "\nTemperatura mínima: " + this.minTemp
                + "\nHora máxima: " + this.maxHora
                + "\nHora mínima: " + this.minHora
                + "\nPrecipitaciones: " + this.precipitaciones + "m3";
    }
    
}
