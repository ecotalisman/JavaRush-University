package ua.javarush.task.jdk13.task41.task4112;

import java.util.*;

public class Bowling {
    // Change code:
    private final Queue<Track> tracks = new LinkedList<>();
    private final Queue<PairOfShoes> shoesShelf = new LinkedList<>();

    public Bowling(int tracksNumber) {
        for (int i = 1; i <= tracksNumber; i++) {
            tracks.add(new Track(i));
        }
        int shoeSize = 38;
        for (int i = 1; i <= 50; i++) {
            shoesShelf.add(new PairOfShoes(shoeSize));
            shoeSize = shoeSize < 45 ? shoeSize + 1 : 38;
        }
    }

    public synchronized Track acquireTrack() {
        Track track = tracks.poll();
        if (track != null) {
            track.setPrice(100 - tracks.size() * 10);
            return track;
        }
        return null;
    }

    public synchronized void releaseTrack(Track track) {
        if (track != null) {
            tracks.offer(track);
            System.out.printf("З доріжки №%d зняли броню\n", track.getNumber());
        }
    }

    public synchronized Set<PairOfShoes> acquireShoes(int number) {
        if (shoesShelf.size() < number) {
            return null;
        }

        Set<PairOfShoes> shoes = new HashSet<>();
        for (int i = 1; i <= number; i++) {
            shoes.add(shoesShelf.poll());
        }
        return shoes;
    }

    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
        if (shoes != null) {
            for (PairOfShoes shoe : shoes) {
                shoesShelf.offer(shoe);
            }
            System.out.printf("У гардероб повернули %d пар взуття\n", shoes.size());
        }

        // That was a condition:
//    public Bowling(int tracksNumber) {
//    }

//    public synchronized Track acquireTrack() {
//        return new Track(1);
//    }

//    public synchronized void releaseTrack(Track track) {
//        System.out.printf("З доріжки №%d зняли броню\n", track.getNumber());
//    }

//    public synchronized Set<PairOfShoes> acquireShoes(int number) {
//        Set<PairOfShoes> shoes = new HashSet<>();
//        for (int i = 0; i < number; i++) {
//            shoes.add(new PairOfShoes(42));
//        }
//        return shoes;
//    }

//    public synchronized void releaseShoes(Set<PairOfShoes> shoes) {
//        System.out.printf("У гардероб повернули %d пар взуття\n", shoes.size());
//    }
    }
}
