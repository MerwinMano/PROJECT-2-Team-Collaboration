package mer.mano.dao;

import java.util.List;

import mer.mano.model.Friend;
import mer.mano.model.User;


public interface FriendDao {

	List<User> listOfSuggestedUsers(String email);
	void addFriendRequest(Friend friend);
	List<Friend> getAllPendingRequests(String email);
	void updateFriendRequest(Friend friend);
	List<User> listOfFriends(String email);
}
