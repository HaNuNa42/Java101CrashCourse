public class Main {

    public static void main(String[] args) {
	WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
	womanGameCalculator.hesapla();
	womanGameCalculator.gameOver();

	//ABSTRACTLAR NEW PARAMETRESİ ALMAZ, her classın ayrı operasyonlar yapması gerekir.
        GameCalculator gameCalculator = new WomanGameCalculator();

        }
}
