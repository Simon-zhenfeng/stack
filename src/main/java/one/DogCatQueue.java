package one;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DogCatQueue {
    private Queue<PetEntry> dogQueue = new LinkedList<>();
    private Queue<PetEntry> catQueue = new LinkedList<>();

    public void add(Pet pet) {
        int index = size() + 1;
        PetEntry petEntry = new PetEntry(pet, index);
        if (pet.type().equals("dog")) {
            dogQueue.add(petEntry);
        }else if(pet.type().equals("cat")) {
            catQueue.add(petEntry);
        }else {
            throw new RuntimeException("Pet type is unknow!");
        }
    }

    public int size() {
        return dogQueue.size() + catQueue.size();
    }

    public List<Pet> pollAll() {
        List<Pet> petList = new ArrayList<>(size());
        while (size() > 0) {
            int catIndex = getPetIndexInQueue(catQueue);
            int dogIndex = getPetIndexInQueue(dogQueue);
            if (catIndex == 0 || dogIndex == 0) {
                petList.add(getExistPet());
            } else {
                petList.add(getFrontPet());
            }
        }
        return petList;
    }

    private Pet getFrontPet() {
        if (catQueue.peek().index < dogQueue.peek().index) {
            return catQueue.poll().pet;
        }
        return dogQueue.poll().pet;
    }

    private Pet getExistPet() {
        if (catQueue.size() == 0) {
            return dogQueue.poll().pet;
        }
        return catQueue.poll().pet;
    }

    private int getPetIndexInQueue(Queue<PetEntry> petQueue) {
        return petQueue.size() == 0 ? 0 : petQueue.peek().index;
    }

    public static class Pet {
        /**
         * type: cat, dog
         */
        private String type;

        protected String name;

        public Pet(String type) {
            this.type = type;
        }

        public String type() {
            return this.type;
        }

        public String getName() {
            return name;
        }
    }

    public static class PetEntry{
        private Pet pet;
        //如果有1个元素，就是从1开始
        private int index;

        public PetEntry(Pet pet, int index) {
            this.pet = pet;
            this.index = index;
        }

        public Pet getPet() {
            return pet;
        }

        public int getIndex() {
            return index;
        }
    }
    public static class Dog extends Pet {
        public Dog(String name) {
            super("dog");
            this.name = name;
        }
    }

    public static class Cat extends Pet {
        public Cat(String name) {
            super("cat");
            this.name = name;
        }
    }

}
