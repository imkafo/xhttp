package org.xwww.html;

import java.io.File;

import org.apache.log4j.Logger;

public class DefaultHTMLFactory implements IHTMLFactory {

    private HTMLDeployer deployer = null;
    
    private Logger log = Logger.getLogger( DefaultHTMLFactory.class );
    
    public void writeHTML( String s ) {
        
        if ( deployer == null ) {
            
        	// TODO: The www/output.js has to be set up in a config file
            File file = new File("www/output.js");
            
            deployer = new HTMLDeployer( file );
        }
        
        deployer.write( s );
        
    }

}
