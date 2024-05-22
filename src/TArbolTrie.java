import java.io.Serializable;
import java.util.LinkedList;

public class TArbolTrie implements IArbolTrie, Serializable {

    private static final long serialVersionUID = 1L;
    private TNodoTrie raiz;

    @Override
    public void insertar(String palabra) {
        if (raiz == null) {
            raiz = new TNodoTrie();
        }
        raiz.insertar(palabra);
    }

    @Override
    public void imprimir() {
        if (raiz != null) {
            raiz.imprimir();
        }
    }

    @Override
    public int buscar(String palabra) {
        if (raiz != null) {
            return raiz.buscar(palabra);
        }
        return 0;
    }

    @Override
    public LinkedList<String> predecir(String prefijo) {
        if (raiz!= null){
            LinkedList<String> palabras = new LinkedList<String>();
            raiz.predecir(prefijo, palabras);
            return palabras;
        } else {
            return null;
        }
    }
}
