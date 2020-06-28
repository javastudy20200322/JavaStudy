package reference.mailsender;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class LocalServerIP
{

	public static void main(String[] args)
	{
		System.out.println(getLocalServerIP());
	}
	
	static String getLocalServerIP()
	{
		String localServerIP = null;
      
		try
		{
			EXIT:
			for (Enumeration en = NetworkInterface.getNetworkInterfaces(); en.hasMoreElements();)
			{
				NetworkInterface intf = (NetworkInterface) en.nextElement();
				for (Enumeration enumIpAddr = intf.getInetAddresses(); enumIpAddr.hasMoreElements();)
				{
					InetAddress inetAddress = (InetAddress) enumIpAddr.nextElement();
					if (!inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress() && inetAddress.isSiteLocalAddress())
					{
						localServerIP = inetAddress.getHostAddress().toString();
						break EXIT;
					}
				}
			}
		}
		catch (SocketException e)
		{
			e.printStackTrace();
		}
	       
		return localServerIP;
	}

}
