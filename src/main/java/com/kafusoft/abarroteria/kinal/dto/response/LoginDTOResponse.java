package main.java.com.kafusoft.abarroteria.kinal.dto.response;

public class LoginDTOResponse {
    
    private String nombre;
    private String apellido;
    private String contrasenaHash;
    private String nombreRol;

    public LoginDTOResponse(String nombre, String apellido, String contrasenaHash, String nombreRol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.contrasenaHash = contrasenaHash;
        this.nombreRol = nombreRol;
    }
    
    public LoginDTOResponse(String nombre, String apellido, String nombreRol){
        this.nombre = nombre;
        this.apellido = apellido;
        this.nombreRol = nombreRol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getContrasenaHash() {
        return contrasenaHash;
    }

    public void setContrasenaHash(String contrasenaHash) {
        this.contrasenaHash = contrasenaHash;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }
    
}
