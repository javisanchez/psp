package serpis.psp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPServer {


	public static void main(String[] args) throws IOException 
	{
		DatagramSocket datagramSocket = new DatagramSocket(10001);
		
		byte[] buf = new byte[2048]; //Creas el byte para recibir los datos.
		
		while (true) {
			DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
			datagramSocket.receive(datagramPacket);//Espera hasta recibir un paquete, nada más lo recibe continua.
			datagramSocket.setReuseAddress(true);//Para poder usar el puerto muchas veces.
			System.out.println(new String(datagramPacket.getData()));
			
			//get.Data() Información que se ha recibido.
			//get.Length() Devuelve la longitud de los datos.
			//get.Address() Devuelve el inetAddress de quien envía el paquete.
			//get.Port() Devuelve el puerto de quien envía el paquete.
		}
		
		
	}

}
/*
	public static void main(String[] args) throws IOException
	{
 		byte[] = new byte [2048];
 		int port = 10001;
 	
 		DatagramPacket datagramPaquet = new DatagramPaquet (buf, buf.lenght);
 		DatagramPacket datagramSocket = DatagramSocket(port);
 	
 		datagramSocket.receive(datagramPacket);
 	
 		String data = new String(datagramPacket.getData(), 0, datagramPacket.getLength());
 	
 		System.out.println("Data=#s' InetAddress=#s Port=#d", data, datagramPacket.getAddress(), datagramPacket.getPort());
 	}
}
*/