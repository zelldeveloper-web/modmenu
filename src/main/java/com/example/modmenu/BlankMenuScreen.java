package com.example.modmenu;

import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class BlankMenuScreen extends Screen {
    public BlankMenuScreen() { super(Component.literal("Mod Menu")); }

    @Override
    public void render(GuiGraphics g, int mx, int my, float pt) {
        g.fill(0, 0, width, height, 0x80000000);
        super.render(g, mx, my, pt);
        g.drawCenteredString(font, title, width / 2, 20, 0xFFFFFF);
    }

    @Override
    public boolean isPauseScreen() { return false; }
}