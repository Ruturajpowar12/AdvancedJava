package mypack;

public class GreetingMsg {

    private String msg;
    
	public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "GreetingMsg [msg=" + msg + "]";
    }
}
