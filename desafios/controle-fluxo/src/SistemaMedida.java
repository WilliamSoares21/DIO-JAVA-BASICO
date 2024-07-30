public class SistemaMedida {
    public static void main(String[] args) {
        
        String sigla = "M";

		switch (sigla) {
		case "P":
        case "p":{
			System.out.println("PEQUENO");
			break;
		}
		case "M":
        case "m":{
            System.out.println("MÉDIO");
			break;
		}
		case "G":
		case "g":{
            System.out.println("GRANDE");
			break;
		}
		default:
			System.out.println("INDEFINIDO");
		}
		
	}
}
