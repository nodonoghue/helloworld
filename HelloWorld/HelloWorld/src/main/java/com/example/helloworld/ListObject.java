package com.example.helloworld;

/**
 * Created by Nathan on 6/8/13.
 */
public class ListObject {
    public int id;
    public String Title;
    public String Description;

    //constructors
    public ListObject()
    {
        super();
    }

    public ListObject(int id, String Title, String Description)
    {
        super();
        this.id = id;
        this.Title = Title;
        this.Description = Description;
    }

    //Overrides
    @Override
    public String toString()
    {
        return this.id + ". " + this.Title;
    }
}
