package Controller;

import Model.Curso;
import Model.cursoConsulta;
import java.util.List;


public class ControlCurso {
    cursoConsulta p= new cursoConsulta();
    
    public boolean agregarCurso(int codigo, String nombreCurso){
        return p.agregarCurso(codigo, nombreCurso);
    }
    
    public boolean editarCurso(int codigo,String Nombre){
        return p.editarCurso(codigo, Nombre);
    }
    
    public boolean elimarCurso(int codigo){
        return p.eliminarCurso(codigo);
    }
    
    public List ListaCurso(){
        return p.ListaCurso();
    }
    
    public Curso ConsultaCodigo(int codigo){
        return p.consultarCursoPorCodigo(codigo);
    }
}
