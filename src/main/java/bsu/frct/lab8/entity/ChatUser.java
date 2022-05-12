package bsu.frct.lab8.entity;

public class ChatUser {
	// ��� ������������
	private String name;
	// ��������� ����� �������������� � �������� � ���������� �����������,
	// ��������� � 1 ������ 1970 ����
	private long lastInteractionTime;
	// ������������� Java-������ ������������
	private String sessionId;
	private int messageAmount = 0;
	
	public ChatUser(String name,long lastInteractionTime,String sessionId, int messageAmount) {
		super();
		this.name = name;
		this.lastInteractionTime = lastInteractionTime;
		this.sessionId = sessionId;
		this.messageAmount = messageAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getLastInteractionTime() {
		return lastInteractionTime;
	}
	public void setLastInteractionTime(long lastInteractionTime) {
		this.lastInteractionTime = lastInteractionTime;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public void setMessageAmount(int amount) {
		this.messageAmount = amount;
	}

    public int getMessageAmount() {
    	return this.messageAmount;
	}
    public void increaseMessageAmount() {
    	this.messageAmount++;
	}
   
}
