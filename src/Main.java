public class Main {
    public static void main(String[] args) {
        Convertable height = new HeightInMeters();
        ConvertableAdapter converter = new ConvertableAdapterImpl(height);
        System.out.println("Height in feet = " + converter.getHeight());
    }
}