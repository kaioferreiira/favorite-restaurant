package br.com.favoriterestaurant.business.utils;

import java.time.ZoneId;
import java.util.Objects;
import java.util.TimeZone;

import br.com.favoriterestaurant.business.exception.exceptions.ValidationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public abstract class LoggerUtils {

    private static final String ERRO_AO_CONVERTER_OBJETO = "Erro ao converter o objeto para String";
    private static final String REQUEST = "[REQUEST] |->";
    private static final String RESPONSE = "[RESPONSE] |->";
    private static final String MSG_NO_CONTENT = "{ Retorno sem dados }";

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerUtils.class);
    private static final ZoneId ZONE_ID = ZoneId.of("America/Sao_Paulo");
    private static final ObjectMapper jsonMapper = new ObjectMapper();

    static {
        jsonMapper.registerModule(new JavaTimeModule());
        jsonMapper.setTimeZone(TimeZone.getTimeZone(ZONE_ID));
        jsonMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    }

    public static void logRequest(Logger log, HttpMethod httpMethod, String path) {
        LoggerUtils.logRequest(log, httpMethod, path, new Object());
    }

    public static void logRequest(Logger log, HttpMethod httpMethod, String path, Object request) {
        if (Objects.nonNull(log)) {
            log.info(String.format("%s (%s) %s { %s }", REQUEST, httpMethod, path, request));
        }
    }

    public static void logResponse(Logger log, HttpMethod httpMethod, String path) {
        log.info(String.format("%s (%s) %s ", RESPONSE, httpMethod, path));
    }

    public static void logResponse(Logger log, HttpMethod httpMethod, String path, ResponseEntity response) {
        String msg = String.format("%s (%s) %s ", RESPONSE, httpMethod, path);
        if (response.getStatusCode().is2xxSuccessful()) {
            if (HttpStatus.NO_CONTENT.equals(response.getStatusCode())) {
                log.info(msg + MSG_NO_CONTENT);
            } else {
                log.info(msg + converterToString(response.getBody()));
            }
        } else {
            log.error(msg + converterToString(response.getBody()));
        }

    }

    private static String converterToString(Object request) {
        if (Objects.nonNull(request)) {
            try {
                return jsonMapper.writeValueAsString(request);
            } catch (Exception e) {
                LOGGER.error(ERRO_AO_CONVERTER_OBJETO, e);
                throw new ValidationException(ERRO_AO_CONVERTER_OBJETO);
            }
        }
        return null;
    }

}
