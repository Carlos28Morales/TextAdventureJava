import java.util.*;
import java.io.*;

public class Skeleton {


    private String name;
    private int health;
    private int damage;

    public Skeleton(String n) {
        name = n;
    }

    public Skeleton() {

    }

    public void MonsterHealth(int h) {
        health = h;
    }

    public void MonsterDmg(int d) {
        damage = d;
    }

    public int GetHealth() {
        return health;
    }

    public String GetName() {
        return name;
    }

    public int GetDamage() {
        return damage;
    }

    public void TakeDamage(int d) {
        health -= d;
    }

    public int Attack() {
        return damage;
    }


}

