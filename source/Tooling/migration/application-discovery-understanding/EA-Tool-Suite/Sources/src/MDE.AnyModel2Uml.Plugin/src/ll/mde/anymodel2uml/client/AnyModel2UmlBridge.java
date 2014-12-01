package ll.mde.anymodel2uml.client;

import eneter.messaging.endpoints.typedmessages.DuplexTypedMessagesFactory;
import eneter.messaging.endpoints.typedmessages.IDuplexTypedMessagesFactory;
import eneter.messaging.endpoints.typedmessages.ISyncDuplexTypedMessageSender;
import eneter.messaging.messagingsystems.messagingsystembase.IDuplexOutputChannel;
import eneter.messaging.messagingsystems.messagingsystembase.IMessagingSystemFactory;
import eneter.messaging.messagingsystems.tcpmessagingsystem.TcpMessagingSystemFactory;

public class AnyModel2UmlBridge
{

    static AnyModel2UmlBridge instance;
    
    IDuplexTypedMessagesFactory aSenderFactory;
    ISyncDuplexTypedMessageSender<GenericElementMessage, ElementQueryMessage> aSender;
    
    private AnyModel2UmlBridge(String ipIn, int portIn, int timeoutMsIn) throws Exception
    {
        // Create sender that will wait max 10 seconds for the response.
        aSenderFactory = new DuplexTypedMessagesFactory(timeoutMsIn);
        aSender = aSenderFactory.createSyncDuplexTypedMessageSender(GenericElementMessage.class, ElementQueryMessage.class);
        
        // Create TCP messaging.
        IMessagingSystemFactory aMessaging = new TcpMessagingSystemFactory();
        IDuplexOutputChannel anOutputChannel = aMessaging.createDuplexOutputChannel("tcp://" + ipIn + ":" + portIn + "/");
        
        // Attach the output channel and be able to send requests and receive responses.
        aSender.attachDuplexOutputChannel(anOutputChannel);
        
    }
    
    public static AnyModel2UmlBridge getInstance(String ipIn, int portIn, int timeoutMsIn) throws Exception
    {
        if(instance == null)
        {
            instance = new AnyModel2UmlBridge(ipIn, portIn, timeoutMsIn);
        }
        else
        {
	        // Create sender that will wait max 10 seconds for the response.
	        instance.aSenderFactory = new DuplexTypedMessagesFactory(timeoutMsIn);
	        instance.aSender = instance.aSenderFactory.createSyncDuplexTypedMessageSender(GenericElementMessage.class, ElementQueryMessage.class);
	        
	        // Create TCP messaging.
	        IMessagingSystemFactory aMessaging = new TcpMessagingSystemFactory();
	        IDuplexOutputChannel anOutputChannel = aMessaging.createDuplexOutputChannel("tcp://" + ipIn + ":" + portIn + "/");
	        
	        // Attach the output channel and be able to send requests and receive responses.
	        instance.aSender.attachDuplexOutputChannel(anOutputChannel);
        }
        return instance;
        
    }
    
    public GenericElementMessage getElementByGuid(String guidIn) throws Exception
    {
        
        // Send the request to the service.
        ElementQueryMessage aQuery = new ElementQueryMessage();
        aQuery.Guid = guidIn;
        
        GenericElementMessage aResponse = aSender.sendRequestMessage(aQuery);
        
        return aResponse;
    }
    
    public void detach()
    {
        aSender.detachDuplexOutputChannel();
    }
    
}
