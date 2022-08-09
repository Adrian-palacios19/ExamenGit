public class EmojiTriste {
    //creacion de la clase emoji triste
    String cara = "triste";

    public void setCara(String cara) {
        this.cara = cara;
        System.out.println("emoji de cara" + this.cara);
    }

    public String getCara(){
        return  "emoji de cara" + cara;
    }

    void emocion(){
        System.out.println("emocion = tristeza");
    }

}
