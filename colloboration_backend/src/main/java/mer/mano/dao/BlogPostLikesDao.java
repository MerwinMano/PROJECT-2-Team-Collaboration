package mer.mano.dao;

import mer.mano.model.BlogPost;
import mer.mano.model.BlogPostLikes;

public interface BlogPostLikesDao {
BlogPostLikes hasUserLikedPost(int postId,String email);
BlogPost updateLikes(int postId,String email);
}
