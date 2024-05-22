
import java.util.HashMap;
import java.util.TreeMap;

public class MedicionPredecirHashMap  extends Medible {

    PredecirConHashMap hashMap;

    public MedicionPredecirHashMap(HashMap<String, String> hashMap) {
        this.hashMap = new PredecirConHashMap(hashMap);
    }

    @Override
    public void ejecutar(Object... params) {
        int repeticion = (int) params[0];
        String[] palabras = (String[]) params[1];
        for (int i = 0; i < repeticion; i++) {
            for (String palabra : palabras) {
                this.hashMap.predecir(palabra);
            }
        }
    }

    @Override
    public Object getObjetoAMedirMemoria() {
        return hashMap;
    }
}
 
