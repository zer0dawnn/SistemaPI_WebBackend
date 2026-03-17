package backend.model;

public class PodcastRegras {
    
    // Método simples: Classifica se um podcast é longo ou curto com base nos minutos
    public String classificarDuracao(int duracaoEmMinutos) {
        if (duracaoEmMinutos <= 0) {
            return "Inválido";
        } else if (duracaoEmMinutos < 60) {
            return "Curto";
        } else {
            return "Longo";
        }
    }
}
