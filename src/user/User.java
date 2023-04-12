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

package user;

import twitter.Tweet;
import java.util.ArrayList;

public class User {
	
	protected String username;
	private int userId;
	protected ArrayList <Tweet> userTweets = new ArrayList<Tweet>();
	static int idTrack;
	protected ArrayList <User> followedUsers = new ArrayList<User>();
	
	public User(String username) {
		this.username = username;
		this.userId = idTrack;
		idTrack++;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public ArrayList<Tweet> getUserTweets() {
		return userTweets;
	}

	public void setUserTweets(ArrayList<Tweet> userTweets) {
		this.userTweets = userTweets;
	}
	
	public void displayTweets() {
		for (int i=0 ; i < userTweets.size(); i++) {
			System.out.println("Tweet: " + userTweets.get(i));
		}
		System.out.println();
	}
	
	public void sendTweet(String content) {
		Tweet newTweet = new Tweet(content);
		userTweets.add(newTweet);
	}
	
	public void followUser(User user) {
		followedUsers.add(user);
	}
	
	private ArrayList <User> verifiedCount = new ArrayList<User>();
	private ArrayList <User> regularCount = new ArrayList<User>();

	public void displayFollowedUserTweets() {
		
		for ( int i = 0; i < followedUsers.size(); i++) {
			
			if (followedUsers.get(i) instanceof VerifiedUser) {
				verifiedCount.add(followedUsers.get(i));
			}
			
			if (followedUsers.get(i) instanceof RegularUser) {
				regularCount.add(followedUsers.get(i));
			}
		}
		
		for ( int i = 0; i < verifiedCount.size(); i++) {
			verifiedCount.get(i).displayTweets();
		}
		
		for ( int i = 0; i < regularCount.size(); i++) {
			regularCount.get(i).displayTweets();
		}
	}
}