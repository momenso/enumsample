package enumsample;

import java.util.Map;
import java.util.stream.Stream;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;


public enum LookupEnum {
    ENUM_1("A"),
    ENUM_2("B");

    private String value;

    private static final Map<String, LookupEnum> ENUM_MAP = Stream.of(LookupEnum.values())
            .collect(toMap(LookupEnum::getValue, identity()));

    LookupEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }

    public static LookupEnum fromValue(String value) {
        return ENUM_MAP.get(value);
    }
}