package Controller;

import Model.estudianteConsulta;
import java.util.List;

public class CotrollerEstudiante {
    estudianteConsulta p= new estudianteConsulta();
    
    public boolean ReguistroEstudiante(String Nnombre,String Apellido,String Identificacion,byte edad){
        return p.RegistrarEstudiante(Nnombre, Apellido, Identificacion, edad);
    }
    public List ListEstu(){
       return p.Lista();
    }
}
