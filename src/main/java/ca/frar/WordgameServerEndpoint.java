package ca.frar;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/game")
public class WordgameServerEndpoint {

    public WordgameServerEndpoint(){
        System.out.println("new WordgameServerEndpoint()");
    }
    
    @OnOpen
    public void onOpen(Session session) {
        System.out.println("Connected ... " + session.getId());
    }

    @OnMessage
    public String onMessage(String message, Session session) {
        System.out.println("message: " + message);
        return "echo " + message;
    }

    @OnClose
    public void onClose(Session session, CloseReason closeReason) {
        System.out.println(String.format("Session %s closed because of %s", session.getId(), closeReason));
    }
}
