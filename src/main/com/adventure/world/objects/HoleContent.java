package main.com.adventure.world.objects;

import main.com.adventure.world.objects.keys.Key;

public class HoleContent {

    private Key content = new Key();
    private boolean isCovered = true;

    /**
     * Key constructor.
     * @param key - content maker
     */
    public HoleContent(Key key) {
        content = key;

    }

    /**
     * Set isCovered or not.
     */
    public void setCovered() {
        isCovered = !isCovered;
    }

    public boolean isCovered() {
        return isCovered;

    }

    public Key getKey() {
        return content;

    }



}
