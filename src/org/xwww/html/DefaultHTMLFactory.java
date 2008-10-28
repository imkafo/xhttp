package org.xwww.html;

import java.io.File;

import org.apache.log4j.Logger;

public class DefaultHTMLFactory implements IHTMLFactory {

    private HTMLDeployer deployer = null;
    
    private Logger log = Logger.getLogger( DefaultHTMLFactory.class );
    
    public void writeHTML( String s ) {
        
        if ( deployer == null ) {
            
            File file = new File("output.js");
            
            deployer = new HTMLDeployer( file );
        }
        
        deployer.write( s );
        
    }
    
    
    /**
     *  CREATE WINDOW
     * 
     * 
     */
    public void reqCreateWindow(int wid, int x, int y, int width, int height, int parentId) {
        
        log.debug("Xwww: Window id: " + wid);
        
        String out = 
            "win_"+wid+" = new Ext.Window({ \n" +
            "    id: " + wid + ", \n" +
            "        layout:'fit', \n" +
            "        width:"+width+", \n" +
            "        height:"+height+", \n" +
            "    x:"+x+", y:"+y+", \n" +
            "        closable: false, \n" +
            "        resizable: false, \n" +
            "        plain: false, \n" +
            "        border: false, \n" +
            "    shadow: false, \n" +
            "    html: 'Id:"+wid+"' \n" +
            "    }); \n" + 
            "win_"+wid+".show();\n" +
            "win_"+parentId+".add( win_"+wid+");\n\n";
       
        writeHTML( out );
        
        
        
    }



}
