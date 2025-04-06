package co.edu.uniandes.csw.mueblesdelosalpes.servicios;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Usuario;
import co.edu.uniandes.csw.mueblesdelosalpes.dto.UsuarioDTO;
import co.edu.uniandes.csw.mueblesdelosalpes.excepciones.AutenticacionException;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.ejb.ServicioSeguridadMock;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/seguridad")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ServicioSeguridadService {

    private ServicioSeguridadMock logica = new ServicioSeguridadMock();

    @POST
    @Path("/login")
    public Response login(UsuarioDTO dto) {
        try {
            Usuario user = logica.ingresar(dto.getLogin(), dto.getContraseña());
            return Response.status(200).entity(user).build();
        } catch (AutenticacionException e) {
            return Response.status(Response.Status.UNAUTHORIZED)
                           .entity("{\"error\":\"" + e.getMessage() + "\"}")
                           .build();
        }
    }
}
