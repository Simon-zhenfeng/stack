package one;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class DogCatQueueTest {
    @Test
    void should_add_dog_and_cat_into_queue() {
        DogCatQueue dogCatQueue = new DogCatQueue();
        dogCatQueue.add(new DogCatQueue.Dog("1"));
        dogCatQueue.add(new DogCatQueue.Cat("2"));
        assertThat(dogCatQueue.size()).isEqualTo(2);
    }

    @Test
    void should_pull_all_pet_from_queue() {
        DogCatQueue dogCatQueue = new DogCatQueue();
        dogCatQueue.add(new DogCatQueue.Dog("1"));
        dogCatQueue.add(new DogCatQueue.Cat("2"));
        List<DogCatQueue.Pet> allPets = dogCatQueue.pollAll();
        assertThat(allPets.get(0).getName()).isEqualTo("1");
        assertThat(allPets.get(1).getName()).isEqualTo("2");
    }
}
