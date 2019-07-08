package io.zipcoder;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {

    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }

    public void run() {
        //use the string iterator to copy each string within the list.
        while (this.stringIterator.hasNext()) {
            if (this.stringIterator.hasNext()) {
                copied += " " + this.stringIterator.next();
            }
        }
    }
}
