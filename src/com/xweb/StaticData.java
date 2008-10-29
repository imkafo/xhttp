package com.xweb;


public class StaticData {

    //static public List<GenericDataRequest> listRequests;

    static {

        // loadRequests();

    }

    
    
//    static public GenericDataRequest getGenericDataRequest( int opcode ) {
//        
//        GenericDataRequest result = null;;
//        
//        for (GenericDataRequest g:listRequests) {
//            if ( g.getOpcode() == opcode ) {
//                result = g;
//                break;
//            }
//        }
//        
//        return result;
//        
//    }
    
//    
//    /**
//     * Load all the Requests information
//     * 
//     */
//    static void loadRequests() {
//        
//        listRequests = new ArrayList<GenericDataRequest>();
//        listRequests.add( new GenericDataRequest( 1,  "Creating window"));
//        listRequests.add( new GenericDataRequest( 2,  "Change Window Attributes"));
//        listRequests.add( new GenericDataRequest( 3,  "Get Window Attributes"));
//        listRequests.add( new GenericDataRequest( 4,  "XWeb,  Destroy Window"));
//        listRequests.add( new GenericDataRequest( 5,  "XWeb,  Destroy Subwindows"));
//        listRequests.add( new GenericDataRequest( 6,  "XWeb,  Change Save Set"));
//        listRequests.add( new GenericDataRequest( 7,  "Reparent Window"));
//        listRequests.add( new GenericDataRequest( 8,  "Map Window"));
//        listRequests.add( new GenericDataRequest( 9,  "Map Sub Windows"));
//        listRequests.add( new GenericDataRequest( 10,  "Unmap Window"));
//        listRequests.add( new GenericDataRequest( 11,  "Unmap Sub Windows"));
//        listRequests.add( new GenericDataRequest( 12,  "Configure Windows"));
//        listRequests.add( new GenericDataRequest( 13,  "Circulate Window"));
//        listRequests.add( new GenericDataRequest( 14,  "Get Geometry"));
//        listRequests.add( new GenericDataRequest( 15,  "Query Tree"));
//        listRequests.add( new GenericDataRequest( 16,  "Intern Atom"));
//        listRequests.add( new GenericDataRequest( 17,  "Get Atom Name"));
//        listRequests.add( new GenericDataRequest( 18,  "Change Property"));
//        listRequests.add( new GenericDataRequest( 19,  "Delete Property"));
//        listRequests.add( new GenericDataRequest( 20,  "Get Property"));
//        listRequests.add( new GenericDataRequest( 21,  "List Properties"));
//        listRequests.add( new GenericDataRequest( 22,  "Set Selection Owner"));
//        listRequests.add( new GenericDataRequest( 23,  "Get Selection Owner"));
//        listRequests.add( new GenericDataRequest( 24,  "Convert Selection"));
//        listRequests.add( new GenericDataRequest( 25,  "Send Event"));
//        listRequests.add( new GenericDataRequest( 26,  "Grab Pointer"));
//        listRequests.add( new GenericDataRequest( 27,  "Ungrab Pointer"));
//        listRequests.add( new GenericDataRequest( 28,  "Grab Button"));
//        listRequests.add( new GenericDataRequest( 29,  "Ungrab Button"));
//        listRequests.add( new GenericDataRequest( 30,  "真 optcod 30 ??"));
//        listRequests.add( new GenericDataRequest( 31,  "Grab Keyboard"));
//        listRequests.add( new GenericDataRequest( 32,  "真 optcod 32 ??"));
//        listRequests.add( new GenericDataRequest( 33,  "真 optcod 33 ??"));
//        listRequests.add( new GenericDataRequest( 34,  "真 34 ??"));
//        listRequests.add( new GenericDataRequest( 35,  "Allow Events"));
//        listRequests.add( new GenericDataRequest( 36,  "Grab Server"));
//        listRequests.add( new GenericDataRequest( 37,  "Ungrab Server"));
//        listRequests.add( new GenericDataRequest( 38,  "Query Pointer"));
//        listRequests.add( new GenericDataRequest( 39,  "Get Motion Events"));
//        listRequests.add( new GenericDataRequest( 40,  "Translate Coordinates"));
//        listRequests.add( new GenericDataRequest( 41,  "真 41 ??"));
//        listRequests.add( new GenericDataRequest( 42,  "Set Input Focus"));
//        listRequests.add( new GenericDataRequest( 43,  "Get Input Focus"));
//        listRequests.add( new GenericDataRequest( 44,  "Query Keymap"));
//        listRequests.add( new GenericDataRequest( 45,  "Open Font"));
//        listRequests.add( new GenericDataRequest( 46,  "Close Font"));
//        listRequests.add( new GenericDataRequest( 47,  "Query Font"));
//        listRequests.add( new GenericDataRequest( 48,  "Query Text Extents"));
//        listRequests.add( new GenericDataRequest( 49,  "List Fonts"));
//        listRequests.add( new GenericDataRequest( 50,  "List Font With Info"));
//        listRequests.add( new GenericDataRequest( 51,  "Set Font Path"));
//        listRequests.add( new GenericDataRequest( 52,  "Get Font Path"));
//        listRequests.add( new GenericDataRequest( 53,  "Create Pixmap"));
//        listRequests.add( new GenericDataRequest( 54,  "Free Pixmap"));
//        listRequests.add( new GenericDataRequest( 55,  "Create GC"));
//        listRequests.add( new GenericDataRequest( 56,  "Change GC"));
//        listRequests.add( new GenericDataRequest( 57,  "Copy GC"));
//        listRequests.add( new GenericDataRequest( 58,  "Set Dashes"));
//        listRequests.add( new GenericDataRequest( 59,  "Set Clip Rectangles"));
//        listRequests.add( new GenericDataRequest( 60,  "Free GC"));
//        listRequests.add( new GenericDataRequest( 61,  "Clear Area"));
//        listRequests.add( new GenericDataRequest( 62,  "Copy Area"));
//        listRequests.add( new GenericDataRequest( 63,  "Copy Plane"));
//        listRequests.add( new GenericDataRequest( 64,  ""));
//        listRequests.add( new GenericDataRequest( 65,  ""));
//        listRequests.add( new GenericDataRequest( 66,  ""));
//        listRequests.add( new GenericDataRequest( 67,  ""));
//        listRequests.add( new GenericDataRequest( 68,  ""));
//        listRequests.add( new GenericDataRequest( 69,  ""));
//        listRequests.add( new GenericDataRequest( 70,  ""));
//        listRequests.add( new GenericDataRequest( 71,  ""));
//        listRequests.add( new GenericDataRequest( 74,  ""));
//        listRequests.add( new GenericDataRequest( 75,  ""));
//        listRequests.add( new GenericDataRequest( 76,  ""));
//        listRequests.add( new GenericDataRequest( 77,  "Draw something"));
//        listRequests.add( new GenericDataRequest( 72,  "Put Image"));
//        listRequests.add( new GenericDataRequest( 73,  "Get Image"));
//        listRequests.add( new GenericDataRequest( 78,  "Create Colormap"));
//        listRequests.add( new GenericDataRequest( 79,  "真v79v??"));
//        listRequests.add( new GenericDataRequest( 80,  "真 80 ??"));
//        listRequests.add( new GenericDataRequest( 81,  "Install Colormap"));
//        listRequests.add( new GenericDataRequest( 82,  "Uninstall Colormap"));
//        listRequests.add( new GenericDataRequest( 83,  "List Installed Colormaps"));
//        listRequests.add( new GenericDataRequest( 84,  "Alloc Color"));
//        listRequests.add( new GenericDataRequest( 85,  "Alloc Named Color"));
//        listRequests.add( new GenericDataRequest( 86,  "Alloc Color Cells"));
//        listRequests.add( new GenericDataRequest( 87,  "Alloc Color Planes"));
//        listRequests.add( new GenericDataRequest( 88,  "Free Colors"));
//        listRequests.add( new GenericDataRequest( 89,  "Store Colors"));
//        listRequests.add( new GenericDataRequest( 90,  "Store Named Color"));
//        listRequests.add( new GenericDataRequest( 91,  "Query Colors"));
//        listRequests.add( new GenericDataRequest( 92,  "Lookup Color"));
//        listRequests.add( new GenericDataRequest( 93,  "Create Cursor"));
//        listRequests.add( new GenericDataRequest( 94,  "Crate Glyph Cursor"));
//        listRequests.add( new GenericDataRequest( 95,  "Free Cursor"));
//        listRequests.add( new GenericDataRequest( 96,  "Recolor Cursor"));
//        listRequests.add( new GenericDataRequest( 97,  "Query Best Size"));
//        listRequests.add( new GenericDataRequest( 98,  "Query Extension"));
//        listRequests.add( new GenericDataRequest( 99,  "List Extensions"));
//        listRequests.add( new GenericDataRequest( 100,  "Change Keyboard Mapping"));
//        listRequests.add( new GenericDataRequest( 101,  "Get Keyboard Mapping"));
//        listRequests.add( new GenericDataRequest( 102,  "真 102 ??"));
//        listRequests.add( new GenericDataRequest( 103,  "Get Keyboard Control"));
//        listRequests.add( new GenericDataRequest( 104,  "Default Toolkit"));
//        listRequests.add( new GenericDataRequest( 105,  "真 105 ??"));
//        listRequests.add( new GenericDataRequest( 106,  "Get Pointer Control"));
//        listRequests.add( new GenericDataRequest( 107,  "真 107 ??"));
//        listRequests.add( new GenericDataRequest( 108,  "Get Screen Saver"));
//        listRequests.add( new GenericDataRequest( 109,  "Change Hosts"));
//        listRequests.add( new GenericDataRequest( 110,  "List Hosts"));
//        listRequests.add( new GenericDataRequest( 111,  "Set Access Control"));
//        listRequests.add( new GenericDataRequest( 112,  ""));
//        listRequests.add( new GenericDataRequest( 113,  "XWeb,  Kill Client"));
//        listRequests.add( new GenericDataRequest( 114,  "Rotate Properties"));
//        listRequests.add( new GenericDataRequest( 115,  "真 115 ?? "));
//        listRequests.add( new GenericDataRequest( 116,  "Set Pointer Mapping"));
//        listRequests.add( new GenericDataRequest( 117,  "Get Pointer Mapping"));
//        listRequests.add( new GenericDataRequest( 118,  "Set Modifier Mapping"));
//        listRequests.add( new GenericDataRequest( 119,  "GetModifier Mapping")); 
//        listRequests.add( new GenericDataRequest( 127,  "真 127 ??"));
//    }

}
