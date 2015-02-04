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
    
    public static boolean testConnection(String ip){
        URL ipRouter;
        try {
            ipRouter = new URL("http://" + ip);
            URLConnection conn = ipRouter.openConnection();
            conn.setConnectTimeout(2000);
            conn.connect();
            return true;
        } catch (MalformedURLException ex) {
            Logger.getLogger(TestConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (SocketTimeoutException ex){
            return false;
        } catch (IOException ex) {
            Logger.getLogger(TestConnection.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public static void main(String[] args) {
        String ipRouter = "10.125.136.135";
        System.out.println(testConnection(ipRouter));
//        try {
//            URL urlRouter = new URL("http://"+ipRouter);
//            URLConnection conn = urlRouter.openConnection();
//            //BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//            conn.setConnectTimeout(2000);
//            conn.connect();
//            System.out.println(ipRouter+" está ativo!");
//            String line;
//            //while((line = br.readLine())!=null){
//            //    System.out.println(line);
//            //}
//            
//        } catch (MalformedURLException ex) {
//            Logger.getLogger(TestConnection.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//        } catch (SocketTimeoutException ex){
//            System.out.println(ipRouter+" não está ativo!");
//        }catch (IOException ex) {
//            Logger.getLogger(TestConnection.class.getName()).log(Level.SEVERE, null, ex);
//            ex.printStackTrace();
//        }
    }
    
}
