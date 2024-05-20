
public class MedicionBuscarTrie extends Medible {

    TArbolTrie trieArbol;

    public MedicionBuscarTrie(TArbolTrie trieArbol) {
        this.trieArbol = trieArbol;
    }

    @Override
    public void ejecutar(Object... params) {
        int repeticion = (int) params[0];
        String[] palabras = (String[]) params[1];
        for (int i = 0; i < repeticion; i++) {
            for (String palabra : palabras) {
                trieArbol.buscar(palabra);
            }
        }
    }

    @Override
    public Object getObjetoAMedirMemoria() {
        return trieArbol;
    }
}