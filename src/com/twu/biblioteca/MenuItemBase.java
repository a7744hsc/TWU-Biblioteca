package com.twu.biblioteca;

/**
 * Created by hchan on 1/7/16.
 */
public abstract class MenuItemBase {
    private String ItemName;
    abstract void doAction();

    public MenuItemBase(String itemName) {
        ItemName = itemName;
    }

    public String getItemName() {
        return ItemName;
    }
}
