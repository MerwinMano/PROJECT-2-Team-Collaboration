package mer.mano.dao;

import mer.mano.model.ProfilePicture;

public interface ProfilePictureDao {
void uploadProfilePicture(ProfilePicture profilePicture);
ProfilePicture getProfilePicture(String email);
}
