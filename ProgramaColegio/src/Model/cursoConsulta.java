
package Model;

import java.util.ArrayList;
import java.util.List;


public class cursoConsulta {
    public static List<Curso> ListaCursos = new ArrayList<>();

    public boolean agregarCurso(int codigo, String nombre) {
        Curso cursoO = new Curso();
        cursoO.setCodigo(codigo);
        cursoO.setNombres(nombre);
        ListaCursos.add(cursoO);
        return true;
    }

    public boolean editarCurso(int codigo, String nombre) {
        Curso cursoO = null;
        int indice = -1;
        for (int i = 0; i < ListaCursos.size(); i++) {
            if (ListaCursos.get(i).getCodigo() == codigo) {
                cursoO = ListaCursos.get(i);
                indice = i;
            }
        }
        if (cursoO != null) {
            cursoO.setCodigo(codigo);
            cursoO.setNombres(nombre);
            ListaCursos.set(indice, cursoO);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarCurso(int codigo) {
        for (int i = 0; i < ListaCursos.size(); i++) {
            if (ListaCursos.get(i).getCodigo() == codigo) {
                ListaCursos.remove(i);
                return true;
            }
        }
        return false;
    }
    
    public List<Curso> consultarListaCurso(){
        return ListaCursos;
    }
    public Curso consultarCursoPorCodigo(int codigo){
        for (int i = 0; i < ListaCursos.size(); i++) {
            if (ListaCursos.get(i).getCodigo() == codigo) {
                return ListaCursos.get(i);
            }
        }
        return null;
    }
}
