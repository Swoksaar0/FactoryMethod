package Factory;

import Interfaces.Nissan;
import Interfaces.NissanFactory;
import models.NissanSkyline;

public class NissanSkylineFactory implements NissanFactory {
    @Override
    public Nissan CreateNissan(){
        return new NissanSkyline();
    }
}
