import java.util.HashMap;
import java.util.Map;

public class SqlWhere {

    public static void main(String[] args) {

        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("name", "Ivanov");
        jsonMap.put("country", "Russia");
        jsonMap.put("city", "Moscow");
        jsonMap.put("age", null);

        System.out.println(getSqlWhere(jsonMap));
    }

    public static String getSqlWhere(Map<String, Object> jsonMap) {
        StringBuilder sb = new StringBuilder();

        for (Map.Entry<String, Object> entry : jsonMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

            if (entry.getValue() != null) {
                sb.append(" ");
                sb.append(entry.getKey());
                sb.append(" = \"");
                sb.append(entry.getValue());
                sb.append("\"");
            }
        }
        return sb.toString();
    }
}