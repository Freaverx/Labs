package LR5;

class example1 {
    public static void main(String[] args) {
        CharacterStore characterStore = new CharacterStore();
        characterStore.setValueAt(65);
        System.out.println(characterStore.getCharacterCode());
        characterStore.displayCharacter();
    }
}

class CharacterStore {
    private char character;

    public void setValueAt(int ascii) {
        this.character = (char) ascii;
    }

    public int getCharacterCode() {
        return character;
    }

    public void displayCharacter() {
        System.out.print("Character: " + this.character + ", ASCII code: ");
    }
}
