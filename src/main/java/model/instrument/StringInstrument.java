package model.instrument;

import interfaces.IPackagingStrategy;
import model.packaging.strategy.MusicInstrumentPackStrategy;

public class StringInstrument extends MusicInstrument {
    private IPackagingStrategy strategy;

    public StringInstrument() {
        this.strategy = new MusicInstrumentPackStrategy();
    }

    @Override
    public String getType() {
        return "String Instrument";
    }

    @Override
    public void pack() {
        strategy.packItem(getClass().getSimpleName());
    }
}
