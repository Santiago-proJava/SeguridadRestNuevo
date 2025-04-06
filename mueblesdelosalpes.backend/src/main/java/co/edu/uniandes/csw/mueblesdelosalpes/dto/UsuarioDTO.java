package co.edu.uniandes.csw.mueblesdelosalpes.dto;

public class UsuarioDTO {
    private String login;
    private String contraseña;

    public UsuarioDTO() {}

    public UsuarioDTO(String login, String contraseña) {
        this.login = login;
        this.contraseña = contraseña;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
