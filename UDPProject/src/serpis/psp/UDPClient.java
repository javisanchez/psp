package serpis.psp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPClient {


	public static void main(String[] args) throws IOException
	{
		String text = "Hola Desde UDPClient";
		byte[] buf= text.getBytes();//Se convierte a byte array
		InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
		int port = 10001;
		
		DatagramSocket datagramSocket = new DatagramSocket();
		
		DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length, inetAddress, port);
		
		datagramSocket.send(datagramPacket);//Envía el paquete y sigue, no se espera a que llegue.
		datagramSocket.close();
		
		System.out.println("Soy el Cliente. FIN");
	}

}
