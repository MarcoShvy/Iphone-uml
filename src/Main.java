public class Main {
    public static void main(String[] args) {
        Iphone.Iphone myPhone = new Iphone.Iphone();

        myPhone.ligar();
        myPhone.atender();
        myPhone.exibirPagina("https://www.example.com");

        Player myPlayer = new Player();
        myPlayer.tocar();
        myPlayer.pausar();
    }
}