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

public class VerifiedUser extends User {

	public VerifiedUser(String username) {
		super(username);
	}
	
	public void editTweet (int id, String newContent) {
		getUserTweets().get(id).edit(newContent);
	}
	
	public void displayTweets() {
		System.out.println("(Verified) " + username + ":");
		super.displayTweets();
	}
}