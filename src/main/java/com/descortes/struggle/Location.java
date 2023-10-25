package com.descortes.struggle;

public abstract class Location {
    protected abstract Integer pointsBy(Human human);
    protected abstract Integer pointsBy(Vampire vampire);
    protected abstract Integer pointsBy(Wolf stadium);
}
