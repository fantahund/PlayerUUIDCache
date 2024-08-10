package de.iani.playerUUIDCache;

import java.net.InetSocketAddress;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.Server;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Egg;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.entity.Vehicle;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public final class CachedPlayer implements Player {
    private final UUID uuid;

    private final String name;

    private final long lastSeen;

    private final long cacheLoadTime;

    public CachedPlayer(UUID uuid, String name, long lastSeen, long cacheLoadTime) {
        this.uuid = uuid;
        this.name = name;
        this.lastSeen = lastSeen;
        this.cacheLoadTime = cacheLoadTime;
    }

    /**
     * Gets the UUID of the cached player. This is never null.
     *
     * @return the UUID of the player
     */
    public UUID getUUID() {
        return uuid;
    }

    public UUID getUniqueId() {
        return uuid;
    }

    /**
     * Gets the name of the cached player. This is never null, but the name might be outdated.
     *
     * @return the name of the player
     */

    @Override
    public String getDisplayName() {
        return name;
    }

    @Override
    public void setDisplayName(String s) {

    }

    public long getLastSeen() {
        return lastSeen;
    }

    @Override
    public void setCompassTarget(Location location) {

    }

    long getCacheLoadTime() {
        return cacheLoadTime;
    }

    @Override
    public InetSocketAddress getAddress() {
        return null;
    }

    @Override
    public void kickPlayer(String s) {

    }

    @Override
    public void chat(String s) {
    }

    @Override
    public boolean performCommand(String s) {
        return false;
    }

    @Override
    public boolean isSneaking() {
        return false;
    }

    @Override
    public void setSneaking(boolean b) {

    }

    @Override
    public void updateInventory() {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public PlayerInventory getInventory() {
        return null;
    }

    @Override
    public ItemStack getItemInHand() {
        return null;
    }

    @Override
    public void setItemInHand(ItemStack itemStack) {

    }

    @Override
    public int hashCode() {
        return name.hashCode() + uuid.hashCode() + (int) lastSeen;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj.getClass() != CachedPlayer.class) {
            return false;
        }
        CachedPlayer other = (CachedPlayer) obj;
        return name.equalsIgnoreCase(other.name) && uuid.equals(other.uuid) && lastSeen == other.lastSeen;
    }

    @Override
    public void sendMessage(String s) {

    }

    @Override
    public boolean isOp() {
        return false;
    }

    @Override
    public boolean isPlayer() {
        return false;
    }

    @Override
    public boolean isOnline() {
        return true;
    }


    @Override
    public Location getLocation() {
        return null;
    }

    @Override
    public World getWorld() {
        return null;
    }

    @Override
    public void teleportTo(Location location) {

    }

    @Override
    public void teleportTo(Entity entity) {

    }

    @Override
    public int getEntityId() {
        return 0;
    }

    @Override
    public int getFireTicks() {
        return 0;
    }

    @Override
    public int getMaxFireTicks() {
        return 0;
    }

    @Override
    public void setFireTicks(int i) {

    }

    @Override
    public void remove() {

    }

    @Override
    public Server getServer() {
        return null;
    }

    @Override
    public int getHealth() {
        return 0;
    }

    @Override
    public void setHealth(int i) {

    }

    @Override
    public double getEyeHeight() {
        return 0;
    }

    @Override
    public double getEyeHeight(boolean b) {
        return 0;
    }

    @Override
    public List<Block> getLineOfSight(HashSet<Byte> hashSet, int i) {
        return List.of();
    }

    @Override
    public Block getTargetBlock(HashSet<Byte> hashSet, int i) {
        return null;
    }

    @Override
    public List<Block> getLastTwoTargetBlocks(HashSet<Byte> hashSet, int i) {
        return List.of();
    }

    @Override
    public Egg throwEgg() {
        return null;
    }

    @Override
    public Snowball throwSnowball() {
        return null;
    }

    @Override
    public Arrow shootArrow() {
        return null;
    }

    @Override
    public boolean isInsideVehicle() {
        return false;
    }

    @Override
    public boolean leaveVehicle() {
        return false;
    }

    @Override
    public Vehicle getVehicle() {
        return null;
    }

    @Override
    public int getRemainingAir() {
        return 0;
    }

    @Override
    public void setRemainingAir(int i) {

    }

    @Override
    public int getMaximumAir() {
        return 0;
    }

    @Override
    public void setMaximumAir(int i) {

    }
}
