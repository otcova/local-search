/*
 * Pr�ctica de IA (B�squeda)
 * FIB - UPC
 * Curso 2006-2007
 * Cuatrimestre de Oto�o
 *
 * Daniel Garc�a P�rez
 * Sergio Vico Marfil
 *
 *
 * DistribucionSuccessorFunction.java
 *
 */

package org.example.IA.Electricidad;

import java.util.ArrayList;
import java.util.List;

import org.example.aima.search.framework.Successor;
import org.example.aima.search.framework.SuccessorFunction;


public class DistribucionSuccessorFunction1 implements SuccessorFunction {    
    
    public List getSuccessors(Object estado) {
        ArrayList retVal= new ArrayList();
        Distribucion dist=(Distribucion) estado;
        Distribucion distAux;
        for (int i = 0; i < dist.getNumConsumidores(); i++) {
            for (int j = 0; j < dist.getNumPaquetes(); j++) {
                if (dist.puedeReasignar(i,j)) {
                    distAux = new Distribucion(dist);                    
                    distAux.reasignar(i,j);
                    retVal.add(new Successor("Asignacion Cons=" + String.valueOf(i) + " Paq=" + String.valueOf(j)+"\n", distAux));
                    
                }
            }
        }
        
        return retVal;        
    }
    
    
}
