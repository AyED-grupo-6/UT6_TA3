import java.util.HashMap;
import java.util.LinkedList;

public class PredecirConHashMap {
    private HashMap<String, String> palabras;

    public PredecirConHashMap (HashMap<String, String> palabras) {
        this.palabras = palabras;
    }

    public void anadir(String palabra){
        palabras.put(palabra, palabra);
    }

    public LinkedList<String> predecir(String prefijo){
        LinkedList<String> resultado = new LinkedList<String>();
        for (String palabra : palabras.values()) {
            if (palabra.startsWith(prefijo)) {
                resultado.add(palabra);
            }
        }
        return resultado;

    }
}
