package ru.isntrui.holodos.models.receipt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.annotation.Nullable;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@lombok.Data
public class Receipt {
    private int code;
    private int first;
    private Data data;
    private Request request;

    public static @Nullable Receipt fromJson(String json) {
        try {
            return new ObjectMapper().readValue(json, Receipt.class);
        } catch (JsonProcessingException e) {
            Logger.getGlobal().log(Level.INFO, "Failed to parse receipt", e);
            return null;
        }
    }

    public List<Item> getItems() {
        return getData().getJson().getItems();
    }
}
