package Msg;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("messages")
public class messageResource {

messageService messageService = new messageService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
        public List<message> getMessage(){
        return messageService.getAllMessages();
    }

    /*@GET
    @Path("/{messageID}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public message getMessage1(@PathParam("messageID") long id){
        return messageService.getMessage(id);
    }*/

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public message addMessage(message msg){
        return messageService.addMessage(msg);
    }

    @PUT
    @Path("/{messageID}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public message updateMessage(@PathParam("messageID") long id, message msg){
        msg.setId(id);
        return messageService.updateMessage(msg);
    }

    @DELETE
    @Path("/{messageID}")
    @Produces(MediaType.APPLICATION_JSON)
    public void deleteMessage(@PathParam("messageID") long id, message msg){
        messageService.removeMessage(id);
    }

  /*  @GET
    @Path("/messageID")
    @Produces(MediaType.APPLICATION_JSON)
    public message getMessage(@PathParam("messageId") long id){
        return Msg.messageService.getMessage();

    }*/
}
