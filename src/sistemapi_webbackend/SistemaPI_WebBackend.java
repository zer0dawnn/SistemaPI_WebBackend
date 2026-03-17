package sistemapi_webbackend;

import backend.model.Podcast;
import backend.dao.PodcastDAO;

public class SistemaPI_WebBackend {

    public static void main(String[] args) {
        System.out.println("Iniciando o teste da nova Arquitetura Backend...");

        try {
            // 1. Instanciar e preencher o objeto (DTO/Model)
            Podcast novoPodcast = new Podcast();
            novoPodcast.setProdutor("Lucas");
            novoPodcast.setNomeEpisodio("Episódio 1: A Refatoração");
            novoPodcast.setNumeroEpisodio(1);
            novoPodcast.setDuracao("01:30:00");
            novoPodcast.setUrlRepo("https://github.com/lucas/podcast");

            // 2. Chamar a regra de negócio/banco de dados (DAO)
            PodcastDAO dao = new PodcastDAO();
            dao.salvar(novoPodcast);

            // 3. Imprimir o resultado direto no terminal
            System.out.println("SUCESSO: Podcast salvo no banco sem precisar de telas (JFrames)!");

        } catch (Exception e) {
            System.err.println("ERRO ao testar o sistema: " + e.getMessage());
        }
    }
}
