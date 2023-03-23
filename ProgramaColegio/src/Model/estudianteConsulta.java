
package Model;

import java.util.ArrayList;
import java.util.List;


public class estudianteConsulta extends Persona {
    private static List<Integer> CursosMatriculados;

    public boolean matricularCurso(int codigo, Estudiante estudiante) {
        try {
            CursosMatriculados = estudiante.getCursosMatriculados();
            //se recorre el arreglo buscando si está matriculad
            for (int i = 0; i < CursosMatriculados.size(); i++) {
                //si se encuentra el curso pues no se hace el proceso
                if (CursosMatriculados.get(i) == codigo) {
                    return false;
                }
            }
            //si ya se verificó se procede a matricular y  se envía un true
            CursosMatriculados.add(codigo);
            estudiante.setCursosMatriculados(CursosMatriculados);
            return true;

        } catch (Exception e) {
            //en dado caso de tener un error simplemente devolvemos un false
            return false;
        }

    }

    public boolean editarMatriculaCurso(int codigoAnterior, int codigoActual, Estudiante estudiante) {
        try {
            CursosMatriculados = estudiante.getCursosMatriculados();
            //se recorre el arreglo buscando si está matriculad
            for (int i = 0; i < CursosMatriculados.size(); i++) {
                if (CursosMatriculados.get(i) == codigoAnterior) {
                    CursosMatriculados.set(i, codigoActual);
                    estudiante.setCursosMatriculados(CursosMatriculados);
                    return true;
                }
            }
            //si no encuentra nada
            return false;
        } catch (Exception e) {
            //en dado caso de tener un error simplemente devolvemos un false
            return false;
        }
    }

    public boolean eliminarMatriculaCurso(int codigo, Estudiante estudiante) {
        try {
            //traer la información de los cursos matriculados
            CursosMatriculados = estudiante.getCursosMatriculados();
            //se recorre el arreglo buscando si está matriculado en el curso
            for (int i = 0; i < CursosMatriculados.size(); i++) {
                if (CursosMatriculados.get(i) == codigo) {
                    CursosMatriculados.remove(i);
                    estudiante.setCursosMatriculados(CursosMatriculados);
                    return true;
                }
            }
            //si llega a esta instrucción se marca como error
            return false;
        } catch (Exception e) {
            //en dado caso de tener un error simplemente devolvemos un false
            return false;
        }
    }
    private static List<Estudiante> ListEstudiante= new ArrayList<>();
    
    /*public boolean agregarEstudiante(String Nnombre,String Apellido,String Identificacion,byte edad){
        try{
            Persona p1=new Persona();
            p1.setNombre(Nnombre);
            p1.setApellido(Apellido);
            p1.setIdentificacion(Identificacion);
            p1.setEdad(edad);
            
            ListEstudiante.add(p1);
            return true;
        }catch(Exception e){
            return false;
        }
    }*/
    
    
    public boolean RegistrarEstudiante(String Nombre,String Apellido,String Identificacion,byte edad){
        
        try{
            Estudiante p = new Estudiante();
            p.RegistrarPersona(Nombre, Apellido, Identificacion, edad);
            ListEstudiante.add(p);
            return true;
        }catch(Exception e){
            return false;
        }
        
    }
    
    public List<Estudiante>Lista(){
        return ListEstudiante;
    }
}
