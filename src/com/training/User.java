package com.training;

import java.util.Objects;

//Encapsulation
public class User{
public class User implements Comparable<User>{

	// 1. attributes
	// instance variables
@@ -44,6 +46,31 @@ public void setUserEmail(String userEmail) {
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

	@Override
	public int compareTo(User o) {
		return this.userId.compareTo(o.userId);
	}
	

