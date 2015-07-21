package serial;

/*
 * SerialExample是本类库所提供的一个例程。它所实现的功能是打开串口COM1，对其进行初始化，从串口读取信息对其进行处理后将处理结果发送到串口。 */

//import java.io.*;

/**
 *
 * This is an example of how to use the SerialBean. It opens COM1 and reads
 * six messages with different length form the serial port.
 *
 */
class SerialExample
{
	public static void PutString(String str, SerialBuffer sb) {
		if(null!=str) {
			for (int i=0;i<str.length();i++) {
				if (null!=sb) {
					sb.PutChar(str.charAt(i));
				} else {
					System.out.println("To Send: "+str.charAt(i));
				}
			}
		}
	}
	
    public static void main(String[] args)
    {
        //TO DO: Add your JAVA codes here
        SerialBean SB = new SerialBean(23);
        String attachMsg = "";
        String detachMsg = "";
        //SB.Initialize();
        /*
        for (int i = 5; i <= 10; i++)
        {
            Msg = SB.ReadPort(i);
            SB.WritePort("Reply: " + Msg);
        }
        */
        SB.WritePort("AT+CGATT=0\n");
    	//Added to test whether the program works:
        String respond = "Shiyan respond";
        PutString(respond, SB.SB);
        for (int i=0;i<3;i++) {
	        attachMsg = SB.ReadPort(5);
	        System.out.println("attachMsg is "+attachMsg);
        }

    	//Added to test whether the program works:
        SB.WritePort("AT+CGATT=1\n");
        detachMsg = SB.ReadPort(20);
        String test = "Shiyan test whether read & put works";
        PutString(test, SB.SB);
        try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("detachMsg is "+detachMsg);
        
        SB.ClosePort();
    }
}
