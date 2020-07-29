import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class login {
   
    public void login(){
        System.out.println("Fazendo a conexão...");
    }
   
    public void connect (String webp, String user, String pass) throws Exception{

    URL url = new URL(webp);
    String POST_CONTENT_TYPE = "application/x-www-form-urlencoded";

// Fazendo a conexao aqui.

HttpURLConnection conn = (HttpURLConnection) url.openConnection();
    conn.setDoInput(true);
    conn.setDoOutput(true);
    conn.setUseCaches(false);
    conn.setRequestMethod("POST");
    conn.setRequestProperty("Connection", "Keep-Alive");
    conn.setRequestProperty("Authorization", "Basic" );
    conn.setRequestProperty("Content-Type", POST_CONTENT_TYPE);
    conn.setRequestProperty("Content-Type", "text/html; charset=iso-8859-1");
    conn.setInstanceFollowRedirects(true);
    HttpURLConnection.setFollowRedirects(true);




DataOutputStream dos = new DataOutputStream(conn.getOutputStream());

StringBuilder content = new StringBuilder(1024);
      content.append("Email").append(URLEncoder.encode(user, "UTF-8"));
      content.append("Passwd").append(URLEncoder.encode(pass, "UTF-8"));

dos.writeBytes(content.toString());
System.out.println("Permission: "+conn.getPermission());
System.out.println("Message: "+conn.getResponseMessage());
System.out.println("Method: "+conn.getRequestMethod());
System.out.println("Code: "+conn.getResponseCode());
BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
String responeLine;


StringBuilder response = new StringBuilder();

while ((responeLine = bufferedReader.readLine()) != null)
{
response.append(responeLine + "\n");
}

//System.out.println (response.toString());

dos.flush();
dos.close();
    }
    
    public static void main(String args[]) throws Exception{
        login log = new login();
       //log.connect("https://accounts.google.com/ServiceLogin?hl=pt-BR&continue=http://www.google.com.br/", "", "");
        log.connect("https://login.globo.com/login/1", "", "");
    }

}