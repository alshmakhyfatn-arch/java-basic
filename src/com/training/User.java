
package com.traning;

import java.util.Objects;

public class User implements Comparable<User> {
	private String userId; 
	private String userName;
	private String userEmail;
	
	public User(String userId, String userName, String userEmail) {
		this.userId = userId;
		this.userName = userName;
		this.userEmail = userEmail;
	
		
		//System.out.println("Constructor is called");
	}
	
	static String organizationName;
	public String getUserName()
	{
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	// 2. behaviour
	public void setUserId(String userId) {
		this.userId = userId;
	}
	// getter method
	public String getUserId() {
		
		return this.userId;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userEmail=" + userEmail + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(userEmail, userId, userName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(userEmail, other.userEmail) && Objects.equals(userId, other.userId)
				&& Objects.equals(userName, other.userName);
	}	
	
	public int compareTo(User o) {
		return this.userId.compareTo(o.userId);
	}
	
}