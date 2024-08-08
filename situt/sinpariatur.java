public class Options {
    public String fieldvar;

    public Options(String fieldvar) {
        this.fieldvar = fieldvar;
    }
}

public class Main {
    public static void main(String[] args) {
        Options opt = new Options("some value");
        String fieldvar = opt.fieldvar;
        System.out.println(fieldvar);  // Output: "some value"
    }
}
