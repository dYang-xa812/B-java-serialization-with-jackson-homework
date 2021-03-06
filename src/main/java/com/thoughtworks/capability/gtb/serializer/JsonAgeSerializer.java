package com.thoughtworks.capability.gtb.serializer;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;

public class JsonAgeSerializer extends StdSerializer<Integer> {
    protected JsonAgeSerializer() {
        super(Integer.class);
    }

    @Override
    public void serialize(Integer age, JsonGenerator gen, SerializerProvider provider) throws IOException {
        gen.writeNumber(0);
    }
}
