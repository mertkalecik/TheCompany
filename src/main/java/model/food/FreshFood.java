package model.food;

import interfaces.IPackagingStrategy;
import model.packaging.strategy.FreshFoodPackStrategy;

public class FreshFood extends Food {

    private IPackagingStrategy strategy;

    public FreshFood() {
        strategy = new FreshFoodPackStrategy();
    }

    @Override
    public String getType() {
        return "Fresh Food";
    }

    @Override
    public void pack() {
        strategy.packItem(getClass().getSimpleName());
    }
}
