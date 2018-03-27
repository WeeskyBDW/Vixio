package me.iblitzkriegi.vixio.expressions.message;

import ch.njol.skript.expressions.base.SimplePropertyExpression;
import me.iblitzkriegi.vixio.Vixio;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.User;

public class ExprAuthor extends SimplePropertyExpression<Message, User> {
    static {
        Vixio.getInstance().registerPropertyExpression(ExprAuthor.class, User.class, "author", "messages")
                .setName("Author of Message")
                .setDesc("Get the author of a message")
                .setExample("author of event-message");
    }

    @Override
    protected String getPropertyName() {
        return "author";
    }

    @Override
    public User convert(Message o) {
        return o.getAuthor();
    }

    @Override
    public Class<? extends User> getReturnType() {
        return User.class;
    }
}