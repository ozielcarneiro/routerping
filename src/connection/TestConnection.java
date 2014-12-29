/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class TestConnection {
    
    public boolean testConnection(String ip){
        URL ipRouter;
        try {
            ipRouter = new URL("http://" + ip);
        } catch (MalformedURLException ex) {
            Logger.getLogger(TestConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
    
    public static void main(String[] args) {
        try {
            URL ipRouter = new URL("http://10.125.136.166");
            URLConnection conn = ipRouter.openConnection();
            //BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            conn.setConnectTimeout(10000);
            conn.connect();
            String line;
            //while((line = br.readLine())!=null){
            //    System.out.println(line);
            //}
            
        } catch (MalformedURLException ex) {
            Logger.getLogger(TestConnection.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } catch (SocketTimeoutException ex){
            System.out.println("Connection Timeout");
        }catch (IOException ex) {
            Logger.getLogger(TestConnection.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
    }
    
}
