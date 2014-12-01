package ll.mde.anymodel2uml.client;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import ll.mde.anymodel2uml.client.GenericElementMessage.Property;

import eneter.messaging.diagnostic.EneterTrace;
import eneter.messaging.endpoints.typedmessages.*;
import eneter.messaging.messagingsystems.messagingsystembase.*;
import eneter.messaging.messagingsystems.tcpmessagingsystem.TcpMessagingSystemFactory;


public class Program
{

    public static void main(String[] args)
    {
    	try
    	{
    		//EneterTrace.setTraceLog(new PrintStream("D:\\Trace.txt"));
            //EneterTrace.setDetailLevel(EDetailLevel.Debug);
    		
        	// Create sender that will wait max 10 seconds for the response.
        	IDuplexTypedMessagesFactory aSenderFactory = new DuplexTypedMessagesFactory(10000);
        	ISyncDuplexTypedMessageSender<GenericElementMessage, ElementQueryMessage> aSender = 
        			aSenderFactory.createSyncDuplexTypedMessageSender(GenericElementMessage.class, ElementQueryMessage.class);
        	
        	// Create TCP messaging.
        	IMessagingSystemFactory aMessaging = new TcpMessagingSystemFactory();
        	IDuplexOutputChannel anOutputChannel = aMessaging.createDuplexOutputChannel("tcp://127.0.0.1:8932/");
        	
        	// Attach the output channel and be able to send requests and receive responses.
        	aSender.attachDuplexOutputChannel(anOutputChannel);
        	
        	// Show the console allowing to eneter GUIDs.
        	BufferedReader aConsoleReader = new BufferedReader(new InputStreamReader(System.in));
        	while (true)
        	{
        		System.out.println("Put GUID or write exit to stop:");
        		String anInput = aConsoleReader.readLine();
        		
        		if (anInput.equals("exit"))
        		{
        			break;
        		}
        		
        		// Send the request to the service.
        		ElementQueryMessage aQuery = new ElementQueryMessage();
        		aQuery.Guid = anInput;
        		
        		GenericElementMessage aResponse = aSender.sendRequestMessage(aQuery);
        		
        		// Display the response.
        		for(Property aProperty : aResponse.Properties)
        		{
        			System.out.print(aProperty.Name);
        			System.out.print(" : ");
        			if (aProperty.Value != null)
        			{
            			for (int i = 0; i < aProperty.Value.length; ++i)
            			{
            			    System.out.print(aProperty.Value[i]);
            			    if (i < aProperty.Value.length - 1)
            			    {
            			        System.out.print(", ");
            			    }
            			}
        			}
        			else
        			{
        				System.out.print("null");
        			}
            		System.out.println();
        		}
        		
        		System.out.println();
        	}
        	
            // Detach the output channel and close the communication.
        	aSender.detachDuplexOutputChannel();
    	}
    	catch (Exception err)
    	{
    		EneterTrace.error("Client failed.", err);
    	}
    }

}
