package model.instrument;

import interfaces.AbstractFactory;

public class InstrumentFactory implements AbstractFactory<MusicInstrument> {

    @Override
    public MusicInstrument create(String type) {
        try {
            Class<?> clazz = Class.forName(type);
            return  (MusicInstrument) clazz.newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        return null;
    }
}
