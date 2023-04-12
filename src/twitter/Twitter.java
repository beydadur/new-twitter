/* *********** Pledge of Honor ************************************************ *

I hereby certify that I have completed this lab assignment on my own
without any help from anyone else. I understand that the only sources of authorized
information in this lab assignment are (1) the course textbook, (2) the
materials posted at the course website and (3) any study notes handwritten by myself.
I have not used, accessed or received any information from any other unauthorized
source in taking this lab assignment. The effort in the assignment thus belongs
completely to me.
READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID
SIGNATURE: <Beyda Dur, 75881>
********************************************************************************/

package twitter;

import java.util.ArrayList;
import user.*;

public class Twitter {
	
	private ArrayList <User> userList = new ArrayList<User>(); 

	public Twitter() {
	}
	
	public User addUser(String username, String type) {
		
		if (type != "Verified" && type != "Regular") {
			System.out.println("No such user type: " + type);
		}
		
		if (type == "Verified") {
			VerifiedUser newUser = new VerifiedUser(username);
			userList.add(newUser);
			return newUser ;
		}
		
		else {
			RegularUser newUser = new RegularUser(username);
			userList.add(newUser);
			return newUser ;
		}
	}
	
	public int calculateRevenue() {
		int revenue = 0;
		for ( int i = 0; i < userList.size() ; i++) {
			if (userList.get(i) instanceof VerifiedUser) {
				revenue += 8;
			}
		}
		return revenue;
	}
	
	public void displayAllTweets() {
		for ( int i = 0; i < userList.size() ; i++) {
			userList.get(i).displayTweets();
		}
	}
	
	public void displayInteractions() {
		int regularUserCount = 0;
		int verifiedUserCount = 0;
		
		for ( int i = 0; i < userList.size() ; i++) {
			if (userList.get(i) instanceof VerifiedUser) {
				verifiedUserCount += userList.get(i).getUserTweets().size();
			}
		}
		
		for ( int i = 0; i < userList.size() ; i++) {
			if (userList.get(i) instanceof RegularUser) {
				regularUserCount += userList.get(i).getUserTweets().size();
			}
		}
		
		int userCount = regularUserCount + verifiedUserCount;
		
		System.out.println("Total Number of Tweets: " + userCount);
		System.out.println("Number of tweets from verified users: " + verifiedUserCount);
		System.out.println("Number of tweets from regular users: " + regularUserCount);

	}
}