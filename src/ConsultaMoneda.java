/*@Carolina Bernal Challenger Alura G6 Backend*/
import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    public Divisa buscarMoneda (String monedaDeConsulta, String monedaConvertir) {
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/fe0d55c4d1e53e5181b447b4/pair/"+monedaDeConsulta+"/"+ monedaConvertir+"/");

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Divisa.class);
        } catch (Exception e) {
            throw new RuntimeException("No encontre esa Moneda!.");
        }


    }
}
