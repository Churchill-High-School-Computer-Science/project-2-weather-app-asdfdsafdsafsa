public class Main {
    public static void main(String[] args) {

        WeatherAPI mrAPI = new WeatherAPI();

        GUI IUG = new GUI(mrAPI);

        IUG.createWindow();
        IUG.setUpButton();
        IUG.pinkBackground();

    }
}
