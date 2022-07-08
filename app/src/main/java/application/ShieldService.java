package application;

import org.springframework.stereotype.Service;

@Service
public class ShieldService {
    public String transform(String body) {
        String result = "";

        for (int i = 0; i < body.length(); i++) {
            char ch = body.charAt(i);

            result += Character.toString(ch + 1);
        }
        return result;
    }
}
