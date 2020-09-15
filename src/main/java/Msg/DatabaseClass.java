package Msg;

//import sun.java2d.cmm.Profile;
//import javax.jms.Message;
import java.util.HashMap;
import java.util.Map;



public class DatabaseClass {
    private static Map<Long, message> messages = new HashMap<>();
//    private static Map<Long, Profile> profiles = new HashMap<>();

    public static Map<Long, message> getMessages(){
        return messages;
    }

  //  public static Map<Long, Profile> getProfiles(){
     //   return profiles;
    //}

}
