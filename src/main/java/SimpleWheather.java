import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Nuclear on 21.09.2018.
 */
public class SimpleWheather {
    public static void main(String[] args) {

    }

    private static void getCityWhetherInfo(String city){
        try {
            URL url = new URL("http://api.apixu.com/v1/current.json?key=79e670bc590d4d76a2d173714182109&q=" + city);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            BufferedReader br = new BufferedReader(new InputStreamReader(
                    (conn.getInputStream())));

            String output = br.readLine();
            conn.disconnect();

            String[] outputs = output.split(",");

            for (String s : outputs) {
                if (s.contains("country")){
                    System.out.println("Государство: " +s.substring(11, s.lastIndexOf("\"")));
                    System.out.println("Город " + city);
                }
                if (s.contains("localtime\"")){
                    System.out.println("Местное время: " +s.substring(13, s.lastIndexOf("\"")));
                }
                if (s.contains("temp_c")){
                    System.out.println("Температура: " +s.substring(9) + " С");
                }
                if (s.contains("humidity")){
                    System.out.println("Влажность: " +s.substring(11) + " %");
                }
            }
        } catch (Exception e) {
            System.out.println("Не удалось получить информацию.");
        }
    }
}
