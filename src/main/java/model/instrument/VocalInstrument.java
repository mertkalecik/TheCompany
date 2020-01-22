package model.instrument;

import interfaces.IPackagingStrategy;
import model.packaging.strategy.MusicInstrumentPackStrategy;

public class VocalInstrument extends MusicInstrument {
    private IPackagingStrategy strategy;

    public VocalInstrument() {
        strategy = new MusicInstrumentPackStrategy();
    }

    @Override
    public String getType() {
        return "Vocal Instrument";
    }

    @Override
    public void pack() {
        strategy.packItem(getClass().getSimpleName());
    }
}
