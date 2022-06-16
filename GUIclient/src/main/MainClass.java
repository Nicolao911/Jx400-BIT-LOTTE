package main;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import net.ReadThread;
import view.ClientFrame;

public class MainClass {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("192.168.0.6" , 9000);
			System.out.println("Connection Success!!");
			
			ClientFrame cf = new ClientFrame(socket);
			
			new ReadThread(socket, cf).start();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
