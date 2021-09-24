package com.windows.WeekDungeon;

import java.util.Date;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class WeekDungeon extends JavaPlugin implements Listener {
	
	String prefix = ChatColor.YELLOW + "[WINDOWS] §b";
	
	public void onEnable() {
		Bukkit.getConsoleSender().sendMessage("§e[WINDOWS] §a요일던전 플러그인 활성화");
	}
	
	public void onDisable() {
		Bukkit.getConsoleSender().sendMessage("§e[WINDOWS] §c요일던전 플러그인 비활성화");
	}
	
	@SuppressWarnings("deprecation")
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player = (Player) sender;
		if (label.equalsIgnoreCase("요일던전")) {
			if (args.length == 0 || args.length > 2) {
				if (!player.hasPermission("weekdungeon.admin")) {
					player.sendMessage(prefix + "§c당신은 권한이 없습니다.");
					return false;
				}
				player.sendMessage(prefix + "§e▒ 요일던전 시스템");
				player.sendMessage(prefix + "/요일던전 [월,화,수,목,금,토,일] 설정 | 현재 서있는곳을 해당 요일에 이동될 던전의 좌표로 설정합니다.");
				player.sendMessage(prefix + "/요일던전 이동 | 설정해둔 요일던전의 좌표로 이동합니다.");
				player.sendMessage(prefix + "§c[!] §e도움말 - 위 명령어는 관리자만 사용이 가능하니 트리거 등을 응용하여 입장하도록 해주세요.");
				return false;
			}
			if (args[0].equalsIgnoreCase("제품코드") || args[0].equalsIgnoreCase("productcode")) {
		    	player.sendMessage(ChatColor.DARK_AQUA + "[WINDOWS] " + ChatColor.YELLOW + "0010");
		    	return false;
		    }
			if (args[0].equalsIgnoreCase("이동")) {
				if (!player.hasPermission("weekdungeon.admin")) {
					player.sendMessage(prefix + "§c당신은 권한이 없습니다.");
					return false;
				}
				Date dt = new Date();
				int day = dt.getDay();
				if (day == 0) {
					if (!getConfig().contains("일요일")) {
						player.sendMessage(prefix + "§a일요일 던전§b의 위치가 설정되어있지 않습니다.");
						return false;
					}
					String World1 = getConfig().getString("일요일.World");
		    		double X1 = getConfig().getDouble("일요일.X");
		    		double Y1 = getConfig().getDouble("일요일.Y");
		    		double Z1 = getConfig().getDouble("일요일.Z");
		    		String Yaw1 = getConfig().getString("일요일.Yaw");
		    		String Pitch1 = getConfig().getString("일요일.Pitch");
		    		Location view = new Location(Bukkit.getWorld(World1), X1, Y1, Z1, Float.parseFloat(Yaw1), Float.parseFloat(Pitch1));
		    		player.teleport(view);
		    		player.sendMessage(prefix + "§a일요일 던전§b에 입장했습니다.");
		    		return false;
				} else if (day == 1) {
					if (!getConfig().contains("월요일")) {
						player.sendMessage(prefix + "§a월요일 던전§b의 위치가 설정되어있지 않습니다.");
						return false;
					}
					String World1 = getConfig().getString("월요일.World");
		    		double X1 = getConfig().getDouble("월요일.X");
		    		double Y1 = getConfig().getDouble("월요일.Y");
		    		double Z1 = getConfig().getDouble("월요일.Z");
		    		String Yaw1 = getConfig().getString("월요일.Yaw");
		    		String Pitch1 = getConfig().getString("월요일.Pitch");
		    		Location view = new Location(Bukkit.getWorld(World1), X1, Y1, Z1, Float.parseFloat(Yaw1), Float.parseFloat(Pitch1));
		    		player.teleport(view);
		    		player.sendMessage(prefix + "§a월요일 던전§b에 입장했습니다.");
		    		return false;
				}  else if (day == 2) {
					if (!getConfig().contains("화요일")) {
						player.sendMessage(prefix + "§a화요일 던전§b의 위치가 설정되어있지 않습니다.");
						return false;
					}
					String World1 = getConfig().getString("화요일.World");
		    		double X1 = getConfig().getDouble("화요일.X");
		    		double Y1 = getConfig().getDouble("화요일.Y");
		    		double Z1 = getConfig().getDouble("화요일.Z");
		    		String Yaw1 = getConfig().getString("화요일.Yaw");
		    		String Pitch1 = getConfig().getString("화요일.Pitch");
		    		Location view = new Location(Bukkit.getWorld(World1), X1, Y1, Z1, Float.parseFloat(Yaw1), Float.parseFloat(Pitch1));
		    		player.teleport(view);
		    		player.sendMessage(prefix + "§a화요일 던전§b에 입장했습니다.");
		    		return false;
				} else if (day == 3) {
					if (!getConfig().contains("수요일")) {
						player.sendMessage(prefix + "§a수요일 던전§b의 위치가 설정되어있지 않습니다.");
						return false;
					}
					String World1 = getConfig().getString("수요일.World");
		    		double X1 = getConfig().getDouble("수요일.X");
		    		double Y1 = getConfig().getDouble("수요일.Y");
		    		double Z1 = getConfig().getDouble("수요일.Z");
		    		String Yaw1 = getConfig().getString("수요일.Yaw");
		    		String Pitch1 = getConfig().getString("수요일.Pitch");
		    		Location view = new Location(Bukkit.getWorld(World1), X1, Y1, Z1, Float.parseFloat(Yaw1), Float.parseFloat(Pitch1));
		    		player.teleport(view);
		    		player.sendMessage(prefix + "§a수요일 던전§b에 입장했습니다.");
		    		return false;
				} else if (day == 4) {
					if (!getConfig().contains("목요일")) {
						player.sendMessage(prefix + "§a목요일 던전§b의 위치가 설정되어있지 않습니다.");
						return false;
					}
					String World1 = getConfig().getString("목요일.World");
		    		double X1 = getConfig().getDouble("목요일.X");
		    		double Y1 = getConfig().getDouble("목요일.Y");
		    		double Z1 = getConfig().getDouble("목요일.Z");
		    		String Yaw1 = getConfig().getString("목요일.Yaw");
		    		String Pitch1 = getConfig().getString("목요일.Pitch");
		    		Location view = new Location(Bukkit.getWorld(World1), X1, Y1, Z1, Float.parseFloat(Yaw1), Float.parseFloat(Pitch1));
		    		player.teleport(view);
		    		player.sendMessage(prefix + "§a목요일 던전§b에 입장했습니다.");
		    		return false;
				} else if (day == 5) {
					if (!getConfig().contains("금요일")) {
						player.sendMessage(prefix + "§a금요일 던전§b의 위치가 설정되어있지 않습니다.");
						return false;
					}
					String World1 = getConfig().getString("금요일.World");
		    		double X1 = getConfig().getDouble("금요일.X");
		    		double Y1 = getConfig().getDouble("금요일.Y");
		    		double Z1 = getConfig().getDouble("금요일.Z");
		    		String Yaw1 = getConfig().getString("금요일.Yaw");
		    		String Pitch1 = getConfig().getString("금요일.Pitch");
		    		Location view = new Location(Bukkit.getWorld(World1), X1, Y1, Z1, Float.parseFloat(Yaw1), Float.parseFloat(Pitch1));
		    		player.teleport(view);
		    		player.sendMessage(prefix + "§a금요일 던전§b에 입장했습니다.");
		    		return false;
				} else if (day == 6) {
					if (!getConfig().contains("토요일")) {
						player.sendMessage(prefix + "§a토요일 던전§b의 위치가 설정되어있지 않습니다.");
						return false;
					}
					String World1 = getConfig().getString("토요일.World");
		    		double X1 = getConfig().getDouble("토요일.X");
		    		double Y1 = getConfig().getDouble("토요일.Y");
		    		double Z1 = getConfig().getDouble("토요일.Z");
		    		String Yaw1 = getConfig().getString("토요일.Yaw");
		    		String Pitch1 = getConfig().getString("토요일.Pitch");
		    		Location view = new Location(Bukkit.getWorld(World1), X1, Y1, Z1, Float.parseFloat(Yaw1), Float.parseFloat(Pitch1));
		    		player.teleport(view);
		    		player.sendMessage(prefix + "§a토요일 던전§b에 입장했습니다.");
		    		return false;
				}
			}
			if (args[0].equalsIgnoreCase("월")) {
				if (args[1].equalsIgnoreCase("설정")) {
					player.sendMessage(prefix + "현재 위치가 §a월요일 던전 §b으로 설정되었습니다.");
					getConfig().set("월요일.World", player.getLocation().getWorld().getName());
					getConfig().set("월요일.X", player.getLocation().getX());
					getConfig().set("월요일.Y", player.getLocation().getY());
					getConfig().set("월요일.Z", player.getLocation().getZ());
					getConfig().set("월요일.Yaw", player.getLocation().getYaw());
					getConfig().set("월요일.Pitch", player.getLocation().getPitch());
					saveConfig();
					return false;
				}
			} else if (args[0].equalsIgnoreCase("화")) {
				if (args[1].equalsIgnoreCase("설정")) {
					player.sendMessage(prefix + "현재 위치가 §a화요일 던전 §b으로 설정되었습니다.");
					getConfig().set("화요일.World", player.getLocation().getWorld().getName());
					getConfig().set("화요일.X", player.getLocation().getX());
					getConfig().set("화요일.Y", player.getLocation().getY());
					getConfig().set("화요일.Z", player.getLocation().getZ());
					getConfig().set("화요일.Yaw", player.getLocation().getYaw());
					getConfig().set("화요일.Pitch", player.getLocation().getPitch());
					saveConfig();
					return false;
				}
			} else if (args[0].equalsIgnoreCase("수")) {
				if (args[1].equalsIgnoreCase("설정")) {
					player.sendMessage(prefix + "현재 위치가 §a수요일 던전 §b으로 설정되었습니다.");
					getConfig().set("수요일.World", player.getLocation().getWorld().getName());
					getConfig().set("수요일.X", player.getLocation().getX());
					getConfig().set("수요일.Y", player.getLocation().getY());
					getConfig().set("수요일.Z", player.getLocation().getZ());
					getConfig().set("수요일.Yaw", player.getLocation().getYaw());
					getConfig().set("수요일.Pitch", player.getLocation().getPitch());
					saveConfig();
					return false;
				}
			} else if (args[0].equalsIgnoreCase("목")) {
				if (args[1].equalsIgnoreCase("설정")) {
					player.sendMessage(prefix + "현재 위치가 §a목요일 던전 §b으로 설정되었습니다.");
					getConfig().set("목요일.World", player.getLocation().getWorld().getName());
					getConfig().set("목요일.X", player.getLocation().getX());
					getConfig().set("목요일.Y", player.getLocation().getY());
					getConfig().set("목요일.Z", player.getLocation().getZ());
					getConfig().set("목요일.Yaw", player.getLocation().getYaw());
					getConfig().set("목요일.Pitch", player.getLocation().getPitch());
					saveConfig();
					return false;
				}
			} else if (args[0].equalsIgnoreCase("금")) {
				if (args[1].equalsIgnoreCase("설정")) {
					player.sendMessage(prefix + "현재 위치가 §a금요일 던전 §b으로 설정되었습니다.");
					getConfig().set("금요일.World", player.getLocation().getWorld().getName());
					getConfig().set("금요일.X", player.getLocation().getX());
					getConfig().set("금요일.Y", player.getLocation().getY());
					getConfig().set("금요일.Z", player.getLocation().getZ());
					getConfig().set("금요일.Yaw", player.getLocation().getYaw());
					getConfig().set("금요일.Pitch", player.getLocation().getPitch());
					saveConfig();
					return false;
				}
			} else if (args[0].equalsIgnoreCase("토")) {
				if (args[1].equalsIgnoreCase("설정")) {
					player.sendMessage(prefix + "현재 위치가 §a토요일 던전 §b으로 설정되었습니다.");
					getConfig().set("토요일.World", player.getLocation().getWorld().getName());
					getConfig().set("토요일.X", player.getLocation().getX());
					getConfig().set("토요일.Y", player.getLocation().getY());
					getConfig().set("토요일.Z", player.getLocation().getZ());
					getConfig().set("토요일.Yaw", player.getLocation().getYaw());
					getConfig().set("토요일.Pitch", player.getLocation().getPitch());
					saveConfig();
					return false;
				}
			} else if (args[0].equalsIgnoreCase("일")) {
				if (args[1].equalsIgnoreCase("설정")) {
					player.sendMessage(prefix + "현재 위치가 §a일요일 던전 §b으로 설정되었습니다.");
					getConfig().set("일요일.World", player.getLocation().getWorld().getName());
					getConfig().set("일요일.X", player.getLocation().getX());
					getConfig().set("일요일.Y", player.getLocation().getY());
					getConfig().set("일요일.Z", player.getLocation().getZ());
					getConfig().set("일요일.Yaw", player.getLocation().getYaw());
					getConfig().set("일요일.Pitch", player.getLocation().getPitch());
					saveConfig();
					return false;
				}
			}
		}
		return true;
	}

}
