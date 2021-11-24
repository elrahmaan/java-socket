/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author elrahmaan
 */
public class ServerTCP {

    public static void main(String[] args) {
        try {
            System.out.println("------------------------------------\n" + "Sedang Menjalankan Server Socket...\n"
                    + "------------------------------------");
            ServerSocket ss = new ServerSocket(2001);
            Socket sk = ss.accept();
            BufferedReader br = new BufferedReader(new InputStreamReader(sk.getInputStream()));
            String line = br.readLine();
            System.out.println("ini dari teman :\n" + line);

        } catch (Exception e) {
        }
    }
}
