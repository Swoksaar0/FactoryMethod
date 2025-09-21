package Factory;
import Interfaces.Nissan;
import Interfaces.NissanFactory;
import models.NissanSilvia;

public class NissanSilviaFactory implements NissanFactory {
    @Override
    public Nissan CreateNissan(){

        return new NissanSilvia();
    }
}
