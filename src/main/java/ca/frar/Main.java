package ca.frar;
import java.io.File;
import javax.servlet.ServletException;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String ... args) throws LifecycleException, ServletException{
        File webapps = new File("./target");
        File war = new File("./target/wordgame-1.0-SNAPSHOT.war");
        
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);
        tomcat.setBaseDir(webapps.getAbsolutePath());
        
        tomcat.addWebapp("/wordgame", war.getAbsolutePath());

        tomcat.start();
        tomcat.getServer().await();
    }    
}