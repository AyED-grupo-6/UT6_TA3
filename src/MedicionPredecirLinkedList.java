import java.io.Serializable;
import java.util.LinkedList;

public class MedicionPredecirLinkedList extends Medible {

    PredecirConLinkedList linkedList;

    public MedicionPredecirLinkedList(LinkedList<String> linkedList) {
        this.linkedList = new PredecirConLinkedList(linkedList);
    }

    @Override
    public void ejecutar(Object... params) {
        int repeticion = (int) params[0];
        String[] palabras = (String[]) params[1];
        for (int i = 0; i < repeticion; i++) {
            for (String palabra : palabras) {
                this.linkedList.predecir(palabra);
            }
        }
    }

    @Override
    public Object getObjetoAMedirMemoria() {
        return linkedList.palabras;
    }
}
