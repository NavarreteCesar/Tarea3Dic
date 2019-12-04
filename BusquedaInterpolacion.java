/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TiposBusqueda;

/**
 *
 * @author CT7-PC10
 */
public class BusquedaInterpolacion {
    public static int busquedaInterpolacion(int[] Vector, int ElementoABuscar) {
    int IniciarIndice = 0;
    int IndiceFinal = (Vector.length - 1);
    while ((IniciarIndice <= IndiceFinal) && (ElementoABuscar >= Vector[IniciarIndice]) &&
           (ElementoABuscar <= Vector[IndiceFinal])) {
        // using interpolation formulae to find the best probable position for this element to exist
        int pos = IniciarIndice + (((IndiceFinal-IniciarIndice) /
          (Vector[IndiceFinal]-Vector[IniciarIndice]))*
                        (ElementoABuscar - Vector[IniciarIndice]));
        if (Vector[pos] == ElementoABuscar)
            return pos;
        if (Vector[pos] < ElementoABuscar)
            IniciarIndice = pos + 1;
        else
            IndiceFinal = pos - 1;
    }
    return -1;
}
    
}
