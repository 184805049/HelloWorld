package users;

public class User {
    private String ID;//����
    private String Pwd;//����
    private String Name;//�˻���
    private String call;//�ֻ���
    private int money;//���
    public String getID() {
    	return ID;
    }
    public void setID(String ID) {
    	this.ID=ID;
    }
    public String getPwd() {
    	return Pwd;
    }
    public void setPwd(String Pwd) {
    	this.Pwd=Pwd;
    }
    public String getName() {
    	return Name;
    }
    public void setName(String userName) {
    	this.Name=Name;
    }
    public String getCall() {
    	return call;
    }
    public void setCall(String call) {
    	this.call=call;
    }
    public int getmoney() {
    	return money;
    }
    public void setmoney(int money) {
    	this.money=money;
    }
}
