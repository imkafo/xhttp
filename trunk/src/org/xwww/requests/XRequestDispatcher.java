package org.xwww.requests;

import org.apache.log4j.Logger;

public class XRequestDispatcher {

	private static Logger log = Logger.getLogger( XRequestDispatcher.class );
	
	public static XRequest createRequest( Integer opt ) {
		
		switch ( opt ) {
			case 1: 	return new CreateWindowRequest();
			case 74: 	return new PolyText8Request();
		}
		
		log.debug("Request not implemented " + opt );
		return null;
		
	}
	
  public static String traduceName(int i) {

	  String result = "(Name not found)";
	  
	  switch (i) {
		  case 1: result = "Creating window"; break;
		  case 2: result = "Change Window Attributes"; break;
		  case 3: result = "Get Window Attributes"; break;
		  case 4: result = "XWeb,  Destroy Window"; break;
		  case 5: result = "XWeb,  Destroy Subwindows"; break;
		  case 6: result = "XWeb,  Change Save Set"; break;
		  case 7: result = "Reparent Window"; break;
		  case 8: result = "Map Window"; break;
		  case 9: result = "Map Sub Windows"; break;
		  case 10: result = "Unmap Window"; break;
		  case 11: result = "Unmap Sub Windows"; break;
		  case 12: result = "Configure Windows"; break;
		  case 13: result = "Circulate Window"; break;
		  case 14: result = "Get Geometry"; break;
		  case 15: result = "Query Tree"; break;
		  case 16: result = "Intern Atom"; break;
		  case 17: result = "Get Atom Name"; break;
		  case 18: result = "Change Property"; break;
		  case 19: result = "Delete Property"; break;
		  case 20: result = "Get Property"; break;
		  case 21: result = "List Properties"; break;
		  case 22: result = "Set Selection Owner"; break;
		  case 23: result = "Get Selection Owner"; break;
		  case 24: result = "Convert Selection"; break;
		  case 25: result = "Send Event"; break;
		  case 26: result = "Grab Pointer"; break;
		  case 27: result = "Ungrab Pointer"; break;
		  case 28: result = "Grab Button"; break;
		  case 29: result = "Ungrab Button"; break;
		  case 30: result = "真 optcod 30 ??"; break;
		  case 31: result = "Grab Keyboard"; break;
		  case 32: result = "真 optcod 32 ??"; break;
		  case 33: result = "真 optcod 33 ??"; break;
		  case 34: result = "真 34 ??"; break;
		  case 35: result = "Allow Events"; break;
		  case 36: result = "Grab Server"; break;
		  case 37: result = "Ungrab Server"; break;
		  case 38: result = "Query Pointer"; break;
		  case 39: result = "Get Motion Events"; break;
		  case 40: result = "Translate Coordinates"; break;
		  case 41: result = "真 41 ??"; break;
		  case 42: result = "Set Input Focus"; break;
		  case 43: result = "Get Input Focus"; break;
		  case 44: result = "Query Keymap"; break;
		  case 45: result = "Open Font"; break;
		  case 46: result = "Close Font"; break;
		  case 47: result = "Query Font"; break;
		  case 48: result = "Query Text Extents"; break;
		  case 49: result = "List Fonts"; break;
		  case 50: result = "List Font With Info"; break;
		  case 51: result = "Set Font Path"; break;
		  case 52: result = "Get Font Path"; break;
		  case 53: result = "Create Pixmap"; break;
		  case 54: result = "Free Pixmap"; break;
		  case 55: result = "Create GC"; break;
		  case 56: result = "Change GC"; break;
		  case 57: result = "Copy GC"; break;
		  case 58: result = "Set Dashes"; break;
		  case 59: result = "Set Clip Rectangles"; break;
		  case 60: result = "Free GC"; break;
		  case 61: result = "Clear Area"; break;
		  case 62: result = "Copy Area"; break;
		  case 63: result = "Copy Plane"; break;
		  case 64: result = "Poly Point"; break;
		  case 65: result = "Poly Line"; break;
		  case 66: result = "Poly Segment"; break;
		  case 67: result = "Poly Rectangle"; break;
		  case 68: result = "Poly Arc"; break;
		  case 69: result = "Fill Poly"; break;
		  case 70: result = "Poly Fill Rectangle"; break;
		  case 71: result = "Fill Poly Arc"; break;
		  case 74: result = "Fill Poly Text 8"; break;
		  case 75: result = "Fill Poly Text 16"; break;
		  case 76: result = "Image Text 8"; break;
		  case 77: result = "Image Text 16"; break;
		  case 72: result = "Put Image"; break;
		  case 73: result = "Get Image"; break;
		  case 78: result = "Create Colormap"; break;
		  case 79: result = "真v79v??"; break;
		  case 80: result = "真 80 ??"; break;
		  case 81: result = "Install Colormap"; break;
		  case 82: result = "Uninstall Colormap"; break;
		  case 83: result = "List Installed Colormaps"; break;
		  case 84: result = "Alloc Color"; break;
		  case 85: result = "Alloc Named Color"; break;
		  case 86: result = "Alloc Color Cells"; break;
		  case 87: result = "Alloc Color Planes"; break;
		  case 88: result = "Free Colors"; break;
		  case 89: result = "Store Colors"; break;
		  case 90: result = "Store Named Color"; break;
		  case 91: result = "Query Colors"; break;
		  case 92: result = "Lookup Color"; break;
		  case 93: result = "Create Cursor"; break;
		  case 94: result = "Crate Glyph Cursor"; break;
		  case 95: result = "Free Cursor"; break;
		  case 96: result = "Recolor Cursor"; break;
		  case 97: result = "Query Best Size"; break;
		  case 98: result = "Query Extension"; break;
		  case 99: result = "List Extensions"; break;
		  case 100: result = "Change Keyboard Mapping"; break;
		  case 101: result = "Get Keyboard Mapping"; break;
		  case 102: result = "真 102 ??"; break;
		  case 103: result = "Get Keyboard Control"; break;
		  case 104: result = "Default Toolkit"; break;
		  case 105: result = "真 105 ??"; break;
		  case 106: result = "Get Pointer Control"; break;
		  case 107: result = "真 107 ??"; break;
		  case 108: result = "Get Screen Saver"; break;
		  case 109: result = "Change Hosts"; break;
		  case 110: result = "List Hosts"; break;
		  case 111: result = "Set Access Control"; break;
		  case 112: result = ""; break;
		  case 113: result = "XWeb,  Kill Client"; break;
		  case 114: result = "Rotate Properties"; break;
		  case 115: result = "真 115 ?? "; break;
		  case 116: result = "Set Pointer Mapping"; break;
		  case 117: result = "Get Pointer Mapping"; break;
		  case 118: result = "Set Modifier Mapping"; break;
		  case 119: result = "GetModifier Mapping"; break; 
		  case 127: result = "真 127 ??"; break;
	  }
	  
	  return result;
  }
	
}
