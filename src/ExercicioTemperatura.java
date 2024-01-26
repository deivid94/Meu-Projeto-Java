public class ExercicioTemperatura {
    public static void main(String[] args) {
        int  temperatura1 = 30;

        float convetTOFahrenheit = (float) ((temperatura1 * 1.8) + 32);
        int semResultadoSemCasasDecimais = (int)(convetTOFahrenheit);
        System.err.println(semResultadoSemCasasDecimais);
    }
}
