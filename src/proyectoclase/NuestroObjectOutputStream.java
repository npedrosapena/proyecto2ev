/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectoclase;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 *
 * @author findag
 */
public class NuestroObjectOutputStream extends ObjectOutputStream {
// creamos a nosa clase extendida da superclase ObjectOutputStream para poder sobreescribir o
// método writeStreamHeader 
    
    @Override
    protected void writeStreamHeader() throws IOException
{
  // este método evita que apareza o encabezado cada vez que engadimos un rexistro no ficheiro
}

 public NuestroObjectOutputStream(OutputStream o) throws IOException{
     super(o);
 }

    
}
