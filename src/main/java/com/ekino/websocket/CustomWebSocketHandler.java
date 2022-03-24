package com.ekino.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class CustomWebSocketHandler extends TextWebSocketHandler {

  Logger logger = LoggerFactory.getLogger(CustomWebSocketHandler.class);

  @Override
  public void handleBinaryMessage(WebSocketSession session, BinaryMessage message) {
    logger.info("new message {}", message.toString());

    super.handleBinaryMessage(session, message);
  }
}
