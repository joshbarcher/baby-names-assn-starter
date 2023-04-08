package bst;

import baby_names.BabyNames;

import java.util.Iterator;

public class NamesTree implements INamesTree
{
    @Override
    public boolean add(BabyNames element)
    {
        return false;
    }

    @Override
    public boolean add(BabyNames... elements)
    {
        return false;
    }

    @Override
    public boolean contains(BabyNames element)
    {
        return false;
    }

    @Override
    public BabyNames get(String name)
    {
        return null;
    }

    @Override
    public int size()
    {
        return 0;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public void clear()
    {

    }

    @Override
    public int treeHeight()
    {
        return 0;
    }

    @Override
    public int nodeHeight(BabyNames element)
    {
        return 0;
    }

    @Override
    public int nodeDepth(BabyNames element)
    {
        return 0;
    }

    @Override
    public Iterator<BabyNames> iterator()
    {
        return null;
    }
}
