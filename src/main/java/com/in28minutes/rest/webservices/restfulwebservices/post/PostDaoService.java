package com.in28minutes.rest.webservices.restfulwebservices.post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.in28minutes.rest.webservices.restfulwebservices.post.Post;

@Component
public class PostDaoService {
    private static List<Post> posts = new ArrayList<>();
    private static int postCount = 4;
    static {
	posts.add(new Post(1, "I like cheese.", 1, new Date()));
	posts.add(new Post(2, "I like hamburger.", 1, new Date()));
	posts.add(new Post(3, "I like sam.", 2, new Date()));
	posts.add(new Post(4, "I like beans.", 3, new Date()));
    }

    public List<Post> findAllForUser(Integer userId) {
	return posts.stream().filter(post -> post.getUserId() == userId)
		.collect(Collectors.toList());
    }

    public Post save(Post post) {
	post.setId(++postCount);
	posts.add(post);
	return post;
    }

    public Post findOne(int id, int userId) {
	for (Post post : posts) {
	    if (post.getId() == id && post.getUserId() == userId) {
		return post;
	    }
	}
	return null;
    }

}
