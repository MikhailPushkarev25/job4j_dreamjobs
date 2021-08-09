package ru.job4j.dream.store;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.City;
import ru.job4j.dream.model.Post;

public class PsqlMain {
    public static void main(String[] args) throws InterruptedException {
        Store store = PsqlStore.instOf();
        store.savePost(new Post(0, "Java Job"));
        store.savePost(new Post(2, "Ja"));
        for (Post post : store.findAllPosts()) {
            System.out.println(post.getId() + " " + post.getName());
        }
        Thread.sleep(1000);
        store.saveCan(new Candidate(0, "Java Junior", 0));
        //store.addCandidate(new Candidate(0, "Java Middle"));
        for (Candidate can : store.findAllCandidates()) {
            System.out.println(can.getId() + " " + can.getName());
        }

        for (City city : store.findAllCity()) {
            System.out.println(city.getId() + " " + city.getName());
        }

        store.removeCan(2);
        for (Candidate can : store.findAllCandidates()) {
            System.out.println(can.getId() + " " + can.getName());
        }
    }
}
