package org.xwww.html;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLDeployer {

    private BufferedWriter out;
    
    public HTMLDeployer( File output ) {
        
        
        try {
            out = new BufferedWriter( new FileWriter(output, true) );
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
    }
    
    public void write( String s ) {
        if ( out != null) {
            try {
                out.write(s);
                out.flush();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
    
}
