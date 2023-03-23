 package Model;

import java.util.List;

public class Profesor extends Persona {

    private List<Curso> CursosImparten;
    
    public List<Curso> MostrarCursosImparten(){
    return this.CursosImparten;
    }

    public boolean AgregarCursos() {
        return true;
    }

    public boolean EditarCursos() {
        return true;
    }

    public boolean EliminarCursos() {
        return true;
    }
}