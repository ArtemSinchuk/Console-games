package com.github;

import java.util.ArrayList;
import java.util.List;

public class Instruments {

    private List<Axe> axes;
    private List<Pickaxe> pickaxes;

    public Instruments() {
        this.axes = new ArrayList<>();
        this.pickaxes = new ArrayList<>();
    }

    public void addAxe(Axe axe) {
        axes.add(axe);
    }
    
    public void addPickaxe(Pickaxe pickaxe) {
        pickaxes.add(pickaxe);
    }

    public int getNumberOfAxes() {
        return axes.size();
    }

    public int getNumberOfPickaxes() {
        return pickaxes.size();
    }

    public int useAxes() {
        int totalWood = 0;
        List<Axe> brokenAxes = new ArrayList<>();
        for (Axe axe : axes) {
            totalWood += axe.use();
            if (axe.getDurability() <= 0) {
                brokenAxes.add(axe);
            }
        }
        axes.removeAll(brokenAxes);
        return totalWood;
    }

    public int usePickaxes() {
        int totalStone = 0;
        List<Pickaxe> brokenPickaxes = new ArrayList<>();
        for (Pickaxe pickaxe : pickaxes) {
            totalStone += pickaxe.use();
            if (pickaxe.getDurability() <= 0) {
                brokenPickaxes.add(pickaxe);
            }
        }
        pickaxes.removeAll(brokenPickaxes);
        return totalStone;
    }
}
