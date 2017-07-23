package com.jesus_crie.deusvult.response;

import com.jesus_crie.deusvult.exception.CommandException;
import com.jesus_crie.deusvult.utils.S;
import com.jesus_crie.deusvult.utils.StringUtils;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.MessageEmbed;

import java.awt.*;
import java.util.List;

public class ResponseUtils {

    public static ResponseBuilder errorMessage(Message m, CommandException e) {
        return ResponseBuilder.create(m)
                .setColor(Color.RED)
                .setIcon(StringUtils.ICON_ERROR)
                .setTitle(S.RESPONSE_ERROR_COMMAND_EXCEPTION.get())
                .setDescription(e.toString());
    }

    public static MessageEmbed.Field createList(String title, boolean inline, List<String> content) {
        if (content.isEmpty())
            return new MessageEmbed.Field(title, null, inline);
        else
            return new MessageEmbed.Field(title,
                    StringUtils.EMOJI_DIAMOND_BLUE + String.join("\n" + StringUtils.EMOJI_DIAMOND_BLUE, content),
                    inline);
    }
}
