package json.parser;

import com.fasterxml.jackson.databind.ObjectMapper;
import json.ex001_json.entity.CasinoGame;

import java.io.File;
import java.io.IOException;

public class JacksonDataBind {

public static void parseJson(String path ) {
    ObjectMapper objectMapper = new ObjectMapper();
    CasinoGame casinoGame= null;

    try {
        casinoGame = objectMapper.readValue(new File(path), CasinoGame.class);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }


}




}
