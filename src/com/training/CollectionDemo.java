package com.training;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
	


public class CollectionDemo {

	public static void main(String[] args) {
		Set <String> name = new HashSet<>();
		name.add(new String("Zara"));
		name.add(new String("Tina"));
		name.add(new String("Sayeed"));
	
		Iterator it = name.iterator();
		while (it.hasNext()) {
			String names = (String)it.next();
			System.out.println(name);
		}


List<User> userList = new ArrayList<>();
User user1 = new User("A101", "Gaith", "abc@mail.com");
User user2 = new User("A102", "Anwar", "sdf@mail.com");
User user3 = new User("A103", "Ayubr", "gjf@mail.com");
User user4 = new User("A104", "Rohan", "rho@mail.com");
User user5 = new User("A102", "anwar", "sdf@mail.com");
userList.add(user1);
userList.add(user2);
userList.add(user3);
userList.add(user4);
userList.add(user5);

for(User user:userSet) {
	System.out.println(user);
	
	
	
}




	}

}
