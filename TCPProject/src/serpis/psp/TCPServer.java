package serpis.psp;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Scanner;

public class TCPServer {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		//holaMundo();
		connectAndWrite();
		
	}
	
	private static void connectAndWrite() throws IOException {
		int port = 10001;
		
		ServerSocket serverSocket = new ServerSocket(port);
		
		Socket socket = serverSocket.accept();
		
		PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);//autoflush=true
		
		printWriter.println("La hora es: "+ new Date());
		
		socket.close();
		
		serverSocket.close();
	}
	
	@SuppressWarnings("unused")
	private static void holaMundo() throws IOException{
		
		int port = 10001;
		
		ServerSocket serverSocket = new ServerSocket(port);
		
		Socket socket = serverSocket.accept();
		
		Scanner scanner = new Scanner(socket.getInputStream());
		String line = scanner.nextLine();
		System.out.println("Line= " + line);
		
		socket.close();
		serverSocket.close();

	}

}
