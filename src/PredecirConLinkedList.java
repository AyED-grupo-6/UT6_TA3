import java.util.LinkedList;



public class PredecirConLinkedList {
    public LinkedList<String> palabras;

    public PredecirConLinkedList(LinkedList<String> palabras) {
        this.palabras = palabras;
    }

    public void anadir(String palabra){
        palabras.add(palabra);
    }

    public LinkedList<String> predecir(String prefijo){
        LinkedList<String> resultado = new LinkedList<String>();
        for (String palabra : palabras) {
            if (palabra.startsWith(prefijo)) {
                resultado.add(palabra);
            }
        }
        return resultado;

    }
}
