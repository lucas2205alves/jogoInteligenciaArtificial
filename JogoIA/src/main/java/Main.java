public class Main {

    public static void main(String[] args) {
        Baralho deck = new Baralho();
        deck.embaralhar();
        Baralho.Carta cartaVira = deck.getVira();
        Baralho.Carta[] mao1 = {deck.getCarta(), deck.getCarta(), deck.getCarta()};
        Baralho.Carta[] mao2 = {deck.getCarta(), deck.getCarta(), deck.getCarta()};
        Player player1 = new Player(mao1);
        Player player2 = new Player(mao2);
        //System.out.println(deck);
        System.out.println("Carta vira: " + cartaVira);
        System.out.println("==========================");
        //System.out.println("Jogador Humano: " + Arrays.toString(hand1) + " - Maior carta: " + player1.getMaiorCarta());
        //System.out.println("Jogador Bot: " + Arrays.toString(hand2) + " - Maior carta: " + player2.getMaiorCarta());
        Jogo partida = new Jogo();

        partida.jogar(player1, player2);

        // REVISAR A LOGICA DE GANHOU/PERDEU
        // E QUANTAS FAZ O BOT ESTÁ ROUBANDO
    }

}
