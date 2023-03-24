package Controller;

import Model.Curso;
import Model.Profesor;
import Model.ProfesorConsulta;
import java.util.List;

public class ControllerProfesor {
    // metodos para llamar al modelo profesor 
  Profesor p = new Profesor();
  ProfesorConsulta p2= new ProfesorConsulta();
  Curso p1=new Curso();

    public boolean AgregarCursos() {
        return p.AgregarCursos();
    }

    public boolean EditarCursos() {
        return p.EditarCursos();

    }

    public boolean EliminarCursos() {
        return p.EliminarCursos();
    }
    
   /* public boolean agregarProfesor(String Nnombre,String Apellido,String Identificacion,byte edad){
       return p2.agregarProfesor(Nnombre, Apellido, Identificacion, edad);
    }*/
    
    public boolean agregarProfesor(String Nnombre,String Apellido,String Identificacion,byte edad){
        return p2.RegistrarProfesor(Nnombre, Apellido, Identificacion, edad);
    }
    public List ListaProfe(){
        return p2.Lista();
    }
    
    public  boolean actulizarProfesor(String Nnombre,String Apellido,String Identificacion,byte edad){
        return p2.ActulizarProfesor(Nnombre, Apellido, Identificacion, edad);
    }
    
    public boolean EliminarProfesor(String identificacion){
        return p2.ElimarProfesor(identificacion);
    }
}
