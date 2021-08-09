package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.City;
import ru.job4j.dream.model.Post;
import ru.job4j.dream.model.User;

import java.util.Collection;

public interface Store {

    Collection<Candidate> findAllCandidates();

    Collection<City> findAllCity();

    void saveCan(Candidate candidate);

    Candidate findByIdCan(int id);

    void removeCan(int id);

    Collection<Post> findAllPosts();

    Post findByIdPost(int id);

    void savePost(Post post);

    Collection<User> findAllUser();

    void saveUser(User user);

    User findByIdUser(int id);

    User findByEmail(String email);

}
