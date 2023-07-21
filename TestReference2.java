package byteBank.Alura;

public class TestReference2 {
    public static void main(String[] args) {
        Client David = new Client();

        David.documento = "432532";
        David.nombre = "David Guerra";
        David.telefono = "74932423";

        Account accountDavid = new Account();
        accountDavid.setAgency(-1);
        accountDavid.setTitular(David);

        System.out.println(accountDavid.getTitular().getNombre());
    }
}
