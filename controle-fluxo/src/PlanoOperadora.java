public class PlanoOperadora {
    public static void main(String[] args) {

        String plano = "M";

		switch (plano) {
			case "T":
            case "t": {
				System.out.println("5Gb Youtube");
                break;
			}
			case "M":
            case "m": {
				System.out.println("WhatsApp e Instagram grátis");
                break;
			}
			case "B":
            case "b": {
				System.out.println("100 minutos de ligação");
                break;
			}
            default:
            System.err.println("Alterativa incorreta");
		}
    }
}
