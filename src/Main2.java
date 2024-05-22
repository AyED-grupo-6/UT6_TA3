import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.TreeMap;

public class Main2 {
    private static final int REPETICIONES = 100;

    public static void main(String[] args) {
        TArbolTrie trie = new TArbolTrie();
        LinkedList linkedList = new LinkedList();
        
        HashMap hashMap = new HashMap();
     
        String[] palabrasclave = ManejadorArchivosGenerico.leerArchivo("src\\listado-general_desordenado.txt");
        String[] prefijosPredecir = ManejadorArchivosGenerico.leerArchivo("src\\listado-general_prefijos.txt");
        for (String p : palabrasclave) {

            // insertar la palabra p en el trie
            trie.insertar(p);
            // insertar la palabra p en el linkedList
            linkedList.add(p);

     
            // insertar la palabra p en el hashMap
            hashMap.put(p, p);

        }

        Medible[] medibles = new Medible[5];
        int i = 0;
        medibles[i++] = new MedicionPredecirLinkedList(linkedList);

        medibles[i++] = new MedicionPredecirTrie(trie);
        medibles[i++] = new MedicionPredecirHashMap(hashMap);

        Medicion mi;
        i = 0;
        Object[] params = { REPETICIONES, prefijosPredecir };
        String[] lineas = new String[6];
        lineas[i++] = "algoritmo,tiempo,memoria";
        for (Medible m : medibles) {
            mi = m.medir(params);
            mi.print();
            lineas[i++] = mi.getTexto() + "," + mi.getTiempoEjecucion().toString() + "," + mi.getMemoria().toString();

        }

        ManejadorArchivosGenerico.escribirArchivo("salida.csv", lineas);
    }
}
