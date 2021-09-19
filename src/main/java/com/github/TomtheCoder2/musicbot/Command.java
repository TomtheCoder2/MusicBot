package com.github.TomtheCoder2.musicbot;

import discord4j.core.event.domain.message.MessageCreateEvent;

interface Command {
    void execute(MessageCreateEvent event);
}