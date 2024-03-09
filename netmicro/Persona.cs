public class Persona
{
    public Persona(int codigo, string nombres, string direccion, string identificacion, string tipotransaccion){
        this.codigo=codigo;
        this.nombres=nombres;
        this.direccion=direccion;
        this.identificacion=identificacion;
        this.tipotransaccion=tipotransaccion;
    }

    public int codigo {get; set;}
    
    public string nombres {get; set;}
    
    public string direccion {get; set;}
    
    public string identificacion {get; set;}

    public string tipotransaccion {get; set;}
}