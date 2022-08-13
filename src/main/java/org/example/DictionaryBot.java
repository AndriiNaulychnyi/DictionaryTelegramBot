package org.example;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class DictionaryBot implements HttpFunction {
    @Override
    public void service(HttpRequest request, HttpResponse response) throws IOException {
        var writer = new PrintWriter(response.getWriter());
        writer.printf("Добрий день, everybody)");
    }
}
