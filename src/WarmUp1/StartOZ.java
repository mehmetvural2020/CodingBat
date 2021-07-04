package WarmUp1;

public class StartOZ {
    /*Given a string, return a string made of the first 2 chars (if present),
    however include first char only if it is 'o' and include the second only if it is 'z',
    so "ozymandias" yields "oz".

    startOz("ozymandias") → "oz"
    startOz("bzoo") → "z"
    startOz("oxx") → "o"*/

    public static void main(String[] args) {

    }

    public String startOz(String str) {
        if(str.equals("")) return "";
        if(str.length()>1 && str.substring(0,2).equals("oz")) return "oz";
        else if(str.substring(0,1).equals("o")) return "o";
        else if(str.substring(1,2).equals("z")) return "z";
        return "";
    }
}
