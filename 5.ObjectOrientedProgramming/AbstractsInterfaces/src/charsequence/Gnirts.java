package abstracts_interfaces.charsequence;

public class Gnirts implements CharSequence {

    private String word;

    public Gnirts(String word) {
        StringBuilder sb = new StringBuilder(word);
        this.word = sb.reverse().toString();
    }

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        return word.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return word.substring(start, end);
    }

    public static void main(String[] args) {
        Gnirts gnirts = new Gnirts("example");
        System.out.println(gnirts.charAt(1));
    }
}
