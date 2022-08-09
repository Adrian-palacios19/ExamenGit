public class Main {
    public static void main(String[] args){

        // creacion los objetos de las clases

        EmojiFeliz carafeliz = new EmojiFeliz();
        EmojiTriste caratriste = new EmojiTriste();

        //visualizando metodos y atributos

        carafeliz.setCara("feliz");
        carafeliz.emocion();

        caratriste.setCara("triste");
        caratriste.emocion();

    }
}
