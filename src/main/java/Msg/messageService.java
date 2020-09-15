package Msg;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class messageService {
    private static Map<Long, message> messages = DatabaseClass.getMessages();

    public List<message> getAllMessages(){
        //message m1 = new message(1, "Hello World" , "Rahaf");
        //message m2 = new message(2, "Hello World 2" , "Rahaf");
      //  List <message> list =new ArrayList<>();
       // list.add(m1);
       // list.add(m2);
        return new ArrayList<message>(messages.values());
    }

    public message getMessage(long id){
        return messages.get(id);
    }

    public message addMessage(message msg){
        msg.setId(messages.size()+1);
        messages.put(msg.getId(), msg);
        return msg;
    }

    public message updateMessage(message msg){
        if (msg.getId()<=0){
            return null;
        }
        messages.put(msg.getId(), msg);
        return msg;
    }
    public message removeMessage(long id){
        return messages.remove(id);
    }

}
