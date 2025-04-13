public class ConfigManager {
    private static ConfigManager instancia;
    private String configuracaoPadrao;
    private Documento prototipoDocumento;

    private ConfigManager() {
        this.configuracaoPadrao = "A4 - Margem 2cm";
        this.prototipoDocumento = new Documento("Título", "Conteúdo", configuracaoPadrao);
    }

    public static ConfigManager getInstancia() {
        if (instancia == null) {
            instancia = new ConfigManager();
        }
        return instancia;
    }

    public String getConfiguracaoPadrao() {
        return configuracaoPadrao;
    }

    public void setConfiguracaoPadrao(String configuracaoPadrao) {
        this.configuracaoPadrao = configuracaoPadrao;
    }

    public Documento getPrototipoDocumento() {
        return prototipoDocumento;
    }

    public void setPrototipoDocumento(Documento prototipoDocumento) {
        this.prototipoDocumento = prototipoDocumento;
    }

    public Documento criarDocumento() {
        return prototipoDocumento.clone();
    }
}
