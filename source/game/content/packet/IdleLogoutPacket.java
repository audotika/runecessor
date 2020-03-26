package game.content.packet;


import game.content.donator.AfkChair;
import game.player.LogOutUpdate;
import game.player.Player;
import game.player.PlayerAssistant;
import network.packet.PacketType;


public class IdleLogoutPacket implements PacketType {


	/**
	 * This is called when the player is idle for a while.
	 */
	@Override
	public void processPacket(final Player player, int packetType, int packetSize, boolean trackPlayer) {
		//AfkChair.afk(player);
		LogOutUpdate.manualLogOut(player);
	}
}
