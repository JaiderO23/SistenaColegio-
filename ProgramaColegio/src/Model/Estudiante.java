package Model;

import java.util.ArrayList;
import java.util.List;


public class Estudiante extends Persona{
    
    private List<Integer> CursosMatriculados = new ArrayList<>();

    public void setCursosMatriculados(List<Integer> CursosMatriculados) {
        this.CursosMatriculados = CursosMatriculados;
    }

    public List<Integer> getCursosMatriculados() {
        return CursosMatriculados;
    }

    
    //public String MatricularCursos(){
        
        
   // }//
   
}
