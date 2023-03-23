
package Controller;

import Model.Curso;
import Model.cursoConsulta;
import java.util.List;


public class cursoController {
    public boolean agregarCurso(int codigo, String nombre) {
        cursoConsulta CursoConsulta = new cursoConsulta();
        return CursoConsulta.agregarCurso(codigo, nombre);
    }

    public boolean editarCurso(int codigo, String nombre) {
        cursoConsulta CursoConsulta = new cursoConsulta();
        return CursoConsulta.editarCurso(codigo, nombre);
    }

    public boolean eliminarCurso(int codigo) {
        cursoConsulta CursoConsulta = new cursoConsulta();
        return CursoConsulta.eliminarCurso(codigo);
    }


    public List<Curso> consultarListaCurso() {
        cursoConsulta CursoConsulta = new cursoConsulta();
        return CursoConsulta.consultarListaCurso();
    }

    public Curso consultarCursoPorCodigo(int codigo) {
        cursoConsulta CursoConsulta = new cursoConsulta();
        return CursoConsulta.consultarCursoPorCodigo(codigo);
    }
}
