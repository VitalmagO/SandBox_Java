public class Enum{

    public static void main(String[] args) {
        Color[] colors = Color.values();
        for (Color c: colors) {
            System.out.println(c);
        }

        System.out.println(Color.RED.getCode());
        System.out.println(Color.BLUE.getCode());
        System.out.println(Color.GREEN.getCode());
    }
}
enum Color{
    RED("#FF0000"), BLUE("#0000FF"), GREEN("#00FF00");
    private String code;
    Color(String code){
        this.code = code;
    }
    public String getCode(){ return code;}
}