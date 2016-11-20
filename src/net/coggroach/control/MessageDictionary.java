package net.coggroach.control;

public class MessageDictionary 
{
	//Client Message
	public static String JoinChatroom = "JOIN_CHATROOM";
	public static String JoinChatroomRegex;
	
	public static String ClientIp = "CLIENT_IP";
	public static String ClientIpRegex;
	
	public static String LeaveChatroom = "LEAVE_CHATROOM";
	public static String LeaveChatroomRegex;
	
	public static String Disconnect = "DISCONNECT";
	public static String DisconnectRegex;
	
	//Common Message
	
	public static String Port = "PORT";
	public static String PortRegex;
	
	public static String ColonSpace = ": ";
	public static String ColonSpaceRegex;
	
	public static String ErrorCode = "ERROR_CODE";
	public static String ErrorCodeRegex;
	
	public static String ErrorDescription = "ERROR_DESCRIPTION";
	public static String ErrorDescriptionRegex;	
	
	public static String JoinId = "JOIN_ID";
	public static String JoinIdRegex;
	
	public static String Chat = "CHAT";
	public static String ChatRegex;
	
	public static String Message = "MESSAGE";
	public static String MessageRegex;		
	
	public static String ClientName = "CLIENT_NAME";
	public static String ClientNameRegex;
	
	//Server Message
	
	public static String JoinedChatroom = "JOINED_CHATROOM";
	public static String JoinedChatroomRegex;
	
	public static String ServerIp = "SERVER_IP";
	public static String ServerIpRegex;
	
	public static String RoomReference = "ROOM_REF";
	public static String RoomReferenceRegex;
	
	public static String LeftChatroom = "LEFT_CHATROOM";
	public static String LeftChatroomRegex;
	
	//Content Regexs
	
	public static String TextRegex = ".+";
	public static String IpRegex = "[\\d]+[\\.][\\d]+[\\.][\\d]+[\\.][\\d]+";
	public static String IntegerRegex = "[\\d]+";
	
	
	static
	{
		//Client Message
		JoinedChatroomRegex = CreateRegex(JoinedChatroom);
		ClientIpRegex = CreateRegex(ClientIp);
		LeaveChatroomRegex = CreateRegex(LeaveChatroom);
		DisconnectRegex = CreateRegex(Disconnect);
		
		//Common Message
		PortRegex = CreateRegex(Port);
		ColonSpaceRegex = CreateRegex(ColonSpace);
		ErrorCodeRegex = CreateRegex(ErrorCode);
		ErrorDescriptionRegex = CreateRegex(ErrorDescription);
		JoinIdRegex = CreateRegex(JoinId);
		ChatRegex = CreateRegex(Chat);
		MessageRegex = CreateRegex(Message);
		ClientNameRegex = CreateRegex(ClientName);
		
		//Server Message
		JoinedChatroomRegex = CreateRegex(JoinedChatroom);
		ServerIpRegex = CreateRegex(ServerIp);
		RoomReferenceRegex = CreateRegex(RoomReference);
		LeftChatroomRegex = CreateRegex(LeftChatroom);		
	}
	
	private static String CreateRegex(String input)
	{
		String output = "";
		for(int i = 0; i < input.length(); i++)
		{
			output += "[" + input.charAt(i) + "]";
		}
		return output;
	}
}
