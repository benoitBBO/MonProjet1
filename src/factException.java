public class factException extends Exception {

    public factException() {
        super("Exception dans factException");
    }

    public factException(String message) {
        super(message);
    }

    public factException(int a) {
        super("Exception sur "+a);
    }
}
