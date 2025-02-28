/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Robert
 * @param <T>
 */
public interface AlmacenamientoVideoconsola<T extends Videoconsola> {
    void addConsola(T consola);
    void eraseConsola(T consola);
    int numTotalConsolas();
    void copiarEn(T<? super T> destino);
    Videoconsola<T> obtenerElementos();
}
