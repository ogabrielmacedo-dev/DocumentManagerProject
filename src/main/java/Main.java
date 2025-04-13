public class Main {
    public static void main(String[] args) {
        ConfigManager config = ConfigManager.getInstancia();

        Documento novoDoc = config.criarDocumento();

        novoDoc.setTitulo("Relatório de vendas por período");
        novoDoc.setConteudo("Dados do mês de março");

        // Prototype
        System.out.println("Documento protótipo:");
        System.out.println(config.getPrototipoDocumento());

        // Clone mostrado na tela com os atributos alterados com o método set utilizando o clone.
        System.out.println("\nNovo documento clonado:");
        System.out.println(novoDoc);
    }
}
