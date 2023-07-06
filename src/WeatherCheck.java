public class WeatherCheck {
    public static void main(String[] args) {

        double temp = 22.2;
        boolean currentlyRaining = false;

        if (temp >= 25.0 && !currentlyRaining) {
            System.out.println("How about shorts and a parasol");
        } else if (temp >= 25.0 && currentlyRaining) {
                System.out.println("How about shorts and an umbrella");
        } else if ( temp < 25.0 && currentlyRaining ) {
            System.out.println("Oh dear! You appear to be in Wales for the Summer! How about a macintosh?");
        } else {
            System.out.println("Woolley jumper weather maybe?");
        }
    }
}
