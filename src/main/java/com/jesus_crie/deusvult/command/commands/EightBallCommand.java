package com.jesus_crie.deusvult.command.commands;

import com.jesus_crie.deusvult.command.Command;
import com.jesus_crie.deusvult.command.CommandPattern;
import com.jesus_crie.deusvult.response.ResponseBuilder;
import com.jesus_crie.deusvult.utils.S;
import com.jesus_crie.deusvult.utils.StringUtils;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class EightBallCommand extends Command {

    private final Random random = new Random();
    private final List<String> answers = Arrays.asList(S.EIGHT_BALL_DATA.get().split("//"));

    public EightBallCommand() {
        super("8ball",
                S.COMMAND_8BALL_HELP.get(),
                null,
                AccessLevel.EVERYONE,
                Context.calculate(Context.EVERYWHERE));

        registerPatterns(
                new CommandPattern(new CommandPattern.Argument[] {
                        CommandPattern.Argument.STRING.clone().setRepeatable(true)
                }, this::onCommand, "<question>")
        );
    }

    private boolean onCommand(MessageReceivedEvent event, List<Object> args) {
        String question = event.getMessage().getStrippedContent().substring(StringUtils.PREFIX.length()).substring("8ball ".length());
        String answer = answers.get(random.nextInt(answers.size()));

        ResponseBuilder.create(event.getMessage())
                .addField(StringUtils.EMOJI_EXCLAMATION + " " + question, StringUtils.EMOJI_8BALL + " " + answer, false)
                .send(event.getChannel()).queue();

        return true;
    }
}
