package com.twu.biblioteca;

/**
 * Created by hchan on 1/8/16.
 */
public class QuitMenuItem extends MenuItemBase {
    @Override
    void doAction() {
        System.exit(0);
    }

    public QuitMenuItem(String itemName) {
        super(itemName);
    }


}
