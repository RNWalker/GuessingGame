public class WeatherCheck {
    public static void main(String[] args) {

        double temp = 24;
        boolean currentlyRaining = true;

        if (temp >= 25.0 && !currentlyRaining) {
            System.out.println("How about shorts and a parasol");
        } else if (temp >= 25.0 && currentlyRaining) {
                System.out.println("How about shorts and an umbrella");
        } else if ( temp < 25.0 && currentlyRaining ) {
            System.out.println("Oh dear! You appear to be in Wales for the Summer! How about a macintosh?");
        } else {
            System.out.println("Woolley jumper weather maybe?");
        }

        double temperature = 22.2;
        String currentRain = "no";

        String rainResult = currentRain.equals("yes") ? "umbrella time" : "no umbrella time";
        String tempResult = (temperature > 25) ? "hot hot hot" : "not not not hot";
        System.out.println(rainResult);
        System.out.println(tempResult);
        

    }
}
