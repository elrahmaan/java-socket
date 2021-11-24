
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.DataOutputStream;
import java.net.Socket;

/**
 *
 * @author elrahmaan
 */
public class ClientTCP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            System.out.println("----------------------------\n" + "Sedang Menjalankan Socket...\n"
                    + "----------------------------");
            Socket cl = new Socket("10.8.0.7", 2001);
            DataOutputStream dos = new DataOutputStream(cl.getOutputStream());
            dos.writeBytes("Halo Fauzan, Ini Rahman");
        } catch (Exception e) {
        }

    }

}
