package restapi;




import javax.ws.rs.core.MediaType;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;

@Path("student")
public class StudentService {
    
    @GET
    @Path("hello")
    @Produces(MediaType.APPLICATION_JSON)
    public String helloworld(){
        return "HelloWorld";
    }
    
    
    
}
