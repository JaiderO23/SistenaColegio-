package Model;


public class Persona {
    
    private String Identificacion;
    private String Nombre;
    private String Apellido;
    private byte Edad;

    public String getIdentificacion() {
        return Identificacion;
    }

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public byte getEdad() {
        return Edad;
    }

    public void setEdad(byte Edad) {
        this.Edad = Edad;
    }
     public boolean RegistrarPersona(String Nombre,String Apellido,String Identificacion,byte edad){
         try{
             this.Nombre= Nombre;
             this.Apellido=Apellido;
             this.Identificacion=Identificacion;
             this.Edad=edad;
              return true;
         }catch(Exception e){
             return false;
         }
      
    }
     
     public boolean actualizarDatos(String Nombre,String Apellido,String Identificacion,byte edad){
         try{
             /*this.setNombre(Nombre);
             this.setApellido(Apellido);
             this.setIdentificacion(Identificacion);
             this.setEdad(edad);*/
              this.Nombre= Nombre;
             this.Apellido=Apellido;
             this.Identificacion=Identificacion;
             this.Edad=edad;
             return true;
         }catch(Exception e){
             return false;
         }
         
     }
   
    
        
}
