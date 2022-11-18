package abstracts_interfaces.charsequence;

public class ShiftedCharSequence implements CharSequence{
    private String word;
    private int shiftBy;

    public ShiftedCharSequence(String word, int shiftBy){
        this.word = word.substring(shiftBy);
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

    public String getWord() {
        return word;
    }

    public static void main(String[] args) {
        ShiftedCharSequence shifter = new ShiftedCharSequence("example", 2);
        System.out.println(shifter.getWord());
        System.out.println(shifter.charAt(0));
        // should print out: a

    }
}
