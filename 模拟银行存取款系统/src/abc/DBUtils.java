package abc;

import java.util.HashMap;

import users.*;

public class DBUtils {
	private static DBUtils instance = null;
	private HashMap<String, User> users = new HashMap<String, User>();

	private DBUtils() {
		// 设立u1
		User u1 = new User();
		u1.setID("123");
		u1.setName("aa");
		u1.setCall("123456");
		u1.setPwd("123");
		u1.setmoney(1110);
		users.put(u1.getID(), u1);
		// 设立u2
		User u2 = new User();
		u1.setID("234");
		u1.setName("bb");
		u1.setCall("234567");
		u1.setPwd("123");
		u1.setmoney(1000);
		// 设立u3
		User u3 = new User();
		u1.setID("345");
		u1.setName("cc");
		u1.setCall("123355");
		u1.setPwd("123");
		u1.setmoney(900);
	}

	public static DBUtils getInstance() {
		if (instance == null) {
			synchronized (DBUtils.class) {
				if (instance == null) {
					instance = new DBUtils();
				}
			}
		}
		return instance;
	}

	public User getUser(String cardID) {
		User user = (User) users.get(cardID);
		return user;
	}

	public HashMap<String, User> getUsers() {
		return users;
	}
}
