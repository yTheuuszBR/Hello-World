package helloworld.em.java;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
  
  public void onEnable() {
    getLogger().info("Plugin iniciado! Hello World =)");
  }

  public void onDisable() {
    getLogger().info("Plugin desligado!");
  }

   @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
      Player p = (Player) sender;
      
      if (cmd.getName().equalsIgnoreCase("oi")) {
        p.sendMessage("Hello, World");
        return true;
      }
    }
}
