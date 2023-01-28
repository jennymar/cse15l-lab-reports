import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;

class Handler implements URLHandler {

    String output = "";

    public String handleRequest(URI url) { 

        if (url.getPath().equals("/add-message")) {
            String[] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")) {
                output += parameters[1] + "\n";
            }

            return output;

        } 
        return "404 not found";
    }
}



public class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}