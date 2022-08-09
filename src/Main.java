public class Main {
    public static void main(String[] args){

        EmojiFeliz carafeliz = new EmojiFeliz();
        EmojiTriste caratriste = new EmojiTriste();

        carafeliz.setCara("feliz");
        carafeliz.emocion();

        caratriste.setCara("triste");
        caratriste.emocion();

    }
}
