import java.util.ArrayList;

public class MedicionBuscarArrayList extends Medible {

    ArrayList array;

    public MedicionBuscarArrayList(ArrayList arrayList) {
        this.array = arrayList;
    }

    @Override
    public void ejecutar(Object... params) {
        int repeticion = (int) params[0];
        String[] palabras = (String[]) params[1];
        for (int i = 0; i < repeticion; i++) {
            for (String palabra : palabras) {
                array.contains(palabra);
            }
        }
    }

    @Override
    public Object getObjetoAMedirMemoria() {
        return array;
    }
}
