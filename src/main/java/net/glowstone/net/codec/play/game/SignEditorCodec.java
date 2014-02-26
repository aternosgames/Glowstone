package net.glowstone.net.codec.play.game;

import com.flowpowered.networking.Codec;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.DecoderException;
import net.glowstone.net.message.play.game.SignEditorMessage;

import java.io.IOException;

public final class SignEditorCodec implements Codec<SignEditorMessage> {
    public SignEditorMessage decode(ByteBuf buf) throws IOException {
        throw new DecoderException("Cannot decode SignEditorMessage");
    }

    public ByteBuf encode(ByteBuf buf, SignEditorMessage message) throws IOException {
        buf.writeInt(message.getX());
        buf.writeInt(message.getY());
        buf.writeInt(message.getZ());
        return buf;
    }
}
