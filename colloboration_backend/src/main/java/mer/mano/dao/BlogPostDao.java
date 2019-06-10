package mer.mano.dao;

import java.util.List;

import mer.mano.model.BlogComment;
import mer.mano.model.BlogPost;

public interface BlogPostDao {
	
	void addBlogPost(BlogPost blogPost);
	List<BlogPost> getBlogs(boolean approved);
	BlogPost getBlogById(int id);
	void blogApproved(int id);
	void blogRejected(int id,String rejectionReason);
	void addBlogComment(BlogComment blogComment);
	List<BlogComment> getAllBlogComments(int blogPostId);
}
