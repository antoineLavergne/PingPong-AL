/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applipingpong;

import java.io.*;
import java.net.*;
import java.util.Scanner;
/**
 *
 * @author antoi
 */

public class Client {
    public static void main(String[] args){
    
        // Creation de la socket
	Socket socket = null;
	try {
	    socket = new Socket("localhost", Serveur.portEcoute);
	} catch(UnknownHostException e) {
	    System.err.println("Erreur sur l'hôte : " + e);
	    System.exit(-1);
	} catch(IOException e) {
	    System.err.println("Creation de la socket impossible : " + e);
	    System.exit(-1);
	}
        
        // Association d'un flux d'entree et de sortie
	ObjectInputStream input = null;
	PrintWriter output = null;
	try {
	    input = new ObjectInputStream(socket.getInputStream());
	    output = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
	} catch(IOException e) {
	    System.err.println("Association des flux impossible : " + e);
	    System.exit(-1);
	}   
        try
        {
            System.out.println("Connexion OK");
            System.out.println("Veuillez choisir un score : ");
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            output.println(str);
        }
        catch(Exception e)
            {
    	        e.printStackTrace();
    	        System.out.println(e.getMessage());
            }
        
        
        try {
            input.close();
            output.close();
            socket.close();
            System.out.println("Client deconnecte.");
            System.exit(0);
        } catch(IOException e) {
            System.err.println("Erreur lors de la fermeture des flux et des sockets : " + e);
            System.exit(-1);
        }       
        
        
      
    }
}

