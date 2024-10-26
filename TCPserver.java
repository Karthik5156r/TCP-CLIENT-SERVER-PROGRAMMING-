import java.io.*;
import java.net.*;
public class TCPserver{
public static void main(String[] args){
try(ServerSocket serverSocket=new ServerSocket(6789)){
System.out.println("server is listening on port 6789");
Socket clientSocket=serverSocket.accept();
System.out.println("Client connected");
InputStream input=clientSocket.getInputStream();
BufferedReader reader=new BufferedReader(new InputStreamReader(input));
String message=reader.readLine();
OutputStream output=clientSocket.getOutputStream();
PrintWriter writer=new PrintWriter(output,true);
writer.println("Hello,client!");

clientSocket.close();
}
catch(IOException ex){
ex.printStackTrace();
}
}
}