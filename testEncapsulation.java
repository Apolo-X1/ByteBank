package byteBank.Alura;

public class testEncapsulation {
    public static void main(String[] args) {
        Account account = new Account();
        Client client = new Client();

        client.setNombre("Apolo");
        client.setDocumento("3427932");

        account.setTitular(client);

        System.out.println(client.getNombre());
        System.out.println(account.getTitular().getDocumento());
    }
}
