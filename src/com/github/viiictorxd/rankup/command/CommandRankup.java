package com.github.viiictorxd.rankup.command;

import com.github.viiictorxd.rankup.api.event.UserRankupEvent;
import com.github.viiictorxd.rankup.entity.Rank;
import com.github.viiictorxd.rankup.entity.User;
import com.github.viiictorxd.rankup.manager.UserManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

public class CommandRankup implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (commandSender instanceof ConsoleCommandSender
                || commandSender instanceof RemoteConsoleCommandSender) {
            commandSender.sendMessage(ChatColor.RED + "You're a robot!");
            return false;
        }

        User user = UserManager.get(((Player) commandSender).getUniqueId());

        Rank currentRank = user.getRank();

        // Não há um novo rank, o jogador atingiu o último.
        if (!currentRank.hasNextRank()) return false;

        Rank nextRank = currentRank.getNextRank();
        // Verifique se o jogador possui o preço para o próximo rank
        /* if (economy.has(commandSender, nextRank.getPrice()) { } */

        UserRankupEvent event = new UserRankupEvent(user, currentRank, nextRank);
        if (event.isCancelled()) return false;

        nextRank = event.getNewRank();

        for (String cmd : nextRank.getCommands()) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), cmd
                    .replace("{name}", commandSender.getName())
                    .replace("{currentRank}", currentRank.getName())
                    .replace("{nextRank}", nextRank.getName())
            );
        }

        user.setRank(nextRank);
        return false;
    }
}
