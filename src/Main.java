import Factory.NissanSilviaFactory;
import Factory.NissanSkylineFactory;
import Interfaces.Nissan;
import Interfaces.NissanFactory;

public class Main {
    public static void main(String[] args) {
        NissanFactory nissanFactory = CreateNissanByModel("Skyline");
        Nissan nissan = nissanFactory.CreateNissan();
        nissan.CreateNissan();
    }
    static NissanFactory CreateNissanByModel(String model) {
        if (model.equals("Skyline")) {
            return new NissanSkylineFactory();
        } else if (model.equals("Silvia")) {
            return new NissanSilviaFactory();
        }else{
            throw new IllegalArgumentException("Unknown model: " + model);
        }
    }
}
