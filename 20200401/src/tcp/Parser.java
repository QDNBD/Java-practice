package tcp;


public class Parser {
    public static void main(String[] args) {
       String url = "";

       parse(url);
    }

    private static void parse(String url) {
        String remain;
        {
            int i = url.indexOf("://");
            String schema = url.substring(0, i);
            System.out.println(schema);
            remain = url.substring(i+3);
        }
        {

        }
    }
}
