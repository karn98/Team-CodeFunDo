package com.fide.abbasal1.fide;

public class Data {
    //@com.google.gson.annotations.SerializedName("message")
    private String mText;

    /**
     * Item Id
     */
    //@com.google.gson.annotations.SerializedName("id")
    private String mId;

    /**
     * ToDoItem constructor
     */
    public Data() {

    }

    @Override
    public String toString() {
        return getText();
    }

    /**
     * Initializes a new ToDoItem
     *
     * @param text
     *            The item text
     * @param id
     *            The item id
     */
    public Data(String text, String id) {
        this.setText(text);
        this.setId(id);
    }

    /**
     * Returns the item text
     */
    public String getText() {
        return mText;
    }

    /**
     * Sets the item text
     *
     * @param text
     *            text to set
     */
    public final void setText(String text) {
        mText = text;
    }

    /**
     * Returns the item id
     */
    public String getId() {
        return mId;
    }

    /**
     * Sets the item id
     *
     * @param id
     *            id to set
     */
    public final void setId(String id) {
        mId = id;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof Data && ((Data) o).mId == mId;
    }
}
