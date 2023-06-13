
public class testePilha {

	public static void main(String[] args) {

		PilhaArray<String> prb = new PilhaArray<String>(5);

		for (int i = 0; i < 7; i++) {
			prb.pushPreta("Preta");
			prb.mostrarTudo();
		}

		for (int i = 0; i < 7; i++) {
			prb.pushVermelha("Vermelha");
			prb.mostrarTudo();
		}

		for (int i = 0; i < 7; i++) {
			prb.popPreta();
			prb.mostrarTudo();
		}

		for (int i = 0; i < 7; i++) {
			prb.popVermelha();
			prb.mostrarTudo();
		}

	}
}
