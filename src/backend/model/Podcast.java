package backend.model;

import javax.persistence.*;

@Entity
@Table(name = "podcast")
public class Podcast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String produtor;
    @Column(name = "nome_episodio")
    private String nomeEpisodio;
    @Column(name = "numero_episodio")
    private int numeroEpisodio;
    private String duracao;
    @Column(name = "url_repo")
    private String urlRepo;

    public Podcast() {}

    // Gere os Getters e Setters aqui com Alt+Insert
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getProdutor() { return produtor; }
    public void setProdutor(String produtor) { this.produtor = produtor; }
    public String getNomeEpisodio() { return nomeEpisodio; }
    public void setNomeEpisodio(String nomeEpisodio) { this.nomeEpisodio = nomeEpisodio; }
    public int getNumeroEpisodio() { return numeroEpisodio; }
    public void setNumeroEpisodio(int numeroEpisodio) { this.numeroEpisodio = numeroEpisodio; }
    public String getDuracao() { return duracao; }
    public void setDuracao(String duracao) { this.duracao = duracao; }
    public String getUrlRepo() { return urlRepo; }
    public void setUrlRepo(String urlRepo) { this.urlRepo = urlRepo; }
}

