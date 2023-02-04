public class ConvertableAdapterImpl implements ConvertableAdapter {
    private Convertable height;

    public ConvertableAdapterImpl(Convertable h) {
        height = h;
    }

    @Override
    public double getHeight() {
        return convertMtoFt(height.getHeight());
    }

    private double convertMtoFt(double h) {
        return h * 3.28084;
    }

}
