package backend.model;

import org.junit.Assert;
import org.junit.Test;

public class PodcastRegrasTest {

    @Test
    public void testarPodcastCurto() {
        PodcastRegras regras = new PodcastRegras();
        String resultado = regras.classificarDuracao(45);
        
        // Verifica se 45 minutos retorna "Curto"
        Assert.assertEquals("Curto", resultado);
    }
    
    @Test
    public void testarPodcastLongo() {
        PodcastRegras regras = new PodcastRegras();
        String resultado = regras.classificarDuracao(90);
        
        // Verifica se 90 minutos retorna "Longo"
        Assert.assertEquals("Longo", resultado);
    }
    
    @Test
    public void testarPodcastInvalido() {
        PodcastRegras regras = new PodcastRegras();
        String resultado = regras.classificarDuracao(-10);
        
        // Verifica se um valor negativo retorna "Inválido"
        Assert.assertEquals("Inválido", resultado);
    }
}
