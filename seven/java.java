package seven;

public class GravityCalculator {

    public static void main(String[] args) {
        // Constants
        final double G = 6.67430e-11; // Gravitational constant in m^3 kg^-1 s^-2
        final double EARTH_MASS = 5.972e24; // Mass of Earth in kilograms
        final double EARTH_RADIUS = 6.371e6; // Radius of Earth in meters

        // Example: Distance of the celestial body from Earth's center (in meters)
        double distanceFromEarthCenter = EARTH_RADIUS + 400000; // 400 km above Earth's surface

        // Compute gravitational force
        double gravity = computeGravity(G, EARTH_MASS, distanceFromEarthCenter);

        System.out.printf("The gravitational acceleration at %.2f meters from Earth's center is %.2f m/s²%n",
                distanceFromEarthCenter, gravity);
    }

    /**
     * Computes the gravitational acceleration at a given distance from Earth's center.
     *
     * @param G Gravitational constant
     * @param mass Mass of Earth
     * @param distance Distance from Earth's center
     * @return Gravitational acceleration in m/s²
     */
    public static double computeGravity(double G, double mass, double distance) {
        return G * mass / (distance * distance);
    }
}
