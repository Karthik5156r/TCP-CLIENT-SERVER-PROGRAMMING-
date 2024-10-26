import java.io.*;
import java.net.*;
public class TCPclient{
public static void main(String[] args){
try(Socket socket=new Socket("127.0.0.1",6789)){
OutputStream output=socket.getOutputStream();
PrintWriter writer=new PrintWriter(output,true);
writer.println("Hello,server!");
InputStream input=socket.getInputStream();
BufferedReader reader=new BufferedReader(new InputStreamReader(input));
String message=reader.readLine();
System.out.println("Received from server:"+message);
}catch(IOException ex){
ex.printStackTrace();
}
}
}

