package Model;

import java.util.ArrayList;
import java.util.List;

public class ProfesorConsulta extends Persona {

    private static List<Profesor> ListProfesor = new ArrayList<>();

    /*public boolean agregarProfesor(String Nnombre,String Apellido,String Identificacion,byte edad){
        try{
            Persona p=new Persona();
            p.setNombre(Nnombre);
            p.setApellido(Apellido);
            p.setIdentificacion(Identificacion);
            p.setEdad(edad);
            ListProfesor.add(p);
            return true;
        }catch(Exception e){
            return false;
        }
    }*/
    public boolean RegistrarProfesor(String Nombre, String Apellido, String Identificacion, byte edad) {
        try {
            Profesor p = new Profesor();
            p.RegistrarPersona(Nombre, Apellido, Identificacion, edad);
            ListProfesor.add(p);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean ActulizarProfesor(String Nombre, String Apellido, String Identificacion, byte edad){
        try{
            Profesor p= new Profesor();
            for (int i = 0; i < ListProfesor.size(); i++) {
                if (ListProfesor.get(i).getIdentificacion().equals(Identificacion)) {
                     p.actualizarDatos(Nombre, Apellido, Identificacion, edad);
                     ListProfesor.set(i, p);
                     
                     return true;
                     
                }
            }
           return false;
        }catch(Exception e){
            return false;
        }
    }

    public boolean ElimarProfesor(String identificacion){
        try{
            Profesor p= new Profesor();
            for (int i = 0; i < ListProfesor.size(); i++) {
                if (ListProfesor.get(i).getIdentificacion().equals(identificacion)) {
                    ListProfesor.remove(i);
                     return true;
                     
                }
            }
           return false;
        }catch(Exception e){
            return false;
        }
    }
    public List<Profesor> Lista() {
        return ListProfesor;
    }
}
