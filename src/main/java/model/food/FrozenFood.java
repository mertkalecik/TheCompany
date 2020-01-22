package model.food;

import interfaces.IPackagingStrategy;
import model.packaging.strategy.FrozenFoodPackStrategy;

public class FrozenFood extends Food {
    private IPackagingStrategy strategy;

    public FrozenFood() {
        strategy = new FrozenFoodPackStrategy();
    }

    @Override
    public String getType() {
        return "Frozen Food";
    }

    @Override
    public void pack() {
        strategy.packItem(getClass().getSimpleName());
    }
}
