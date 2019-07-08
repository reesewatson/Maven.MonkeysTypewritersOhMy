package io.zipcoder;

/**
 * Make this extend the Copier like `UnsafeCopier`, except use locks to make sure that the actual intro gets printed
 * correctly every time.  Make the run method thread safe.
 */
public class SafeCopier extends Copier {

    public SafeCopier(String toCopy) {
        super(toCopy);
    }

    //use the string iterator to copy each string within the list.
    public synchronized void run() {

        while (this.stringIterator.hasNext()) {
        if (this.stringIterator.hasNext()) {
            copied += " " + this.stringIterator.next();
        }
    }
    }
}
